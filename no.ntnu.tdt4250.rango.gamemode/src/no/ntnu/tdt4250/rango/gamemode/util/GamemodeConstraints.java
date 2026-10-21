package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import no.ntnu.tdt4250.rango.gamemode.BallType;
import no.ntnu.tdt4250.rango.gamemode.BallsAlive;
import no.ntnu.tdt4250.rango.gamemode.BallsPopped;
import no.ntnu.tdt4250.rango.gamemode.Cleared;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.HealthDepleted;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.PlayerEffect;
import no.ntnu.tdt4250.rango.gamemode.Poison;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.ScoreReached;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.TimeReached;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import no.ntnu.tdt4250.rango.gamemode.WavesSurvived;

/**
 * The constraints of the metamodel that need more than one object to be checked, and are therefore
 * written in Java rather than OCL. The generated {@link GamemodeValidator} delegates to these methods.
 * Every method returns the violations it finds; an empty list means the constraint holds.
 */
public final class GamemodeConstraints {

	/** The source of the diagnostics, as used by the generated validator. */
	public static final String SOURCE = GamemodeValidator.DIAGNOSTIC_SOURCE;

	public static final int NAME_NOT_UNIQUE = 101;
	public static final int DUPLICATE_EFFECT_KIND = 102;
	public static final int SIMULTANEOUS_OUTCOME = 105;
	public static final int LOST_AT_START = 106;
	public static final int CONDITION_UNREACHABLE = 107;
	public static final int NEVER_ENDS = 108;
	public static final int WRONG_ROLE = 109;
	public static final int TELEPORTER_ELSEWHERE = 110;
	public static final int HEALTH_NOT_DECISIVE = 111;

	/** Issue codes as seen by Xtext, which joins the source and the code of an EMF diagnostic. */
	public static final String ISSUE_NEVER_ENDS = SOURCE + "." + NEVER_ENDS;
	public static final String ISSUE_WRONG_ROLE = SOURCE + "." + WRONG_ROLE;
	public static final String ISSUE_HEALTH_NOT_DECISIVE = SOURCE + "." + HEALTH_NOT_DECISIVE;

	/**
	 * A broken constraint: what is wrong, on which object and, if it can be pinned down, on which
	 * of its features.
	 */
	public record Violation(int code, String message, EObject target, EStructuralFeature feature) {
	}

	private GamemodeConstraints() {
	}

	/** No two elements of the same list share a name. */
	public static List<Violation> nameUniqueAmongSiblings(NamedElement element) {
		List<Violation> violations = new ArrayList<>();
		EObject container = element.eContainer();
		EStructuralFeature feature = element.eContainingFeature();
		if (container == null || element.getName() == null || !feature.isMany()) {
			return violations;
		}
		for (Object sibling : (List<?>) container.eGet(feature)) {
			if (sibling != element && sibling instanceof NamedElement other && element.getName().equals(other.getName())) {
				violations.add(new Violation(NAME_NOT_UNIQUE,
						"The name '" + element.getName() + "' is used more than once in the same list",
						element, GamemodePackage.Literals.NAMED_ELEMENT__NAME));
				break;
			}
		}
		return violations;
	}

	/** A ball type or power-up has at most one effect of each kind: two shields would just overlap. */
	public static List<Violation> distinctEffectKinds(EObject owner, List<PlayerEffect> effects) {
		List<Violation> violations = new ArrayList<>();
		Set<EClass> seen = new HashSet<>();
		for (PlayerEffect effect : effects) {
			if (!seen.add(effect.eClass())) {
				violations.add(new Violation(DUPLICATE_EFFECT_KIND,
						"There are two " + effect.eClass().getName() + " effects; combine them into one",
						effect, null));
			}
		}
		return violations;
	}

	/**
	 * A round cannot be won and lost by the same event, and is not decided before it starts: the time
	 * to survive is shorter than the time limit, and the round does not start overrun.
	 */
	public static List<Violation> noSimultaneousOutcome(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		for (EndCondition win : mode.getWinConditions()) {
			for (EndCondition lose : mode.getLoseConditions()) {
				if (win instanceof TimeReached survive && lose instanceof TimeReached limit
						&& survive.getSeconds() >= limit.getSeconds()) {
					String when = survive.getSeconds() == limit.getSeconds() ? "at the same moment as" : "after";
					violations.add(new Violation(SIMULTANEOUS_OUTCOME,
							"The round would be won " + when + " it is lost by its time limit of " + seconds(limit.getSeconds()),
							survive, GamemodePackage.Literals.TIME_REACHED__SECONDS));
				}
			}
		}
		int initialBalls = GamemodeDerivations.initialBalls(mode.getSpawning());
		for (EndCondition lose : mode.getLoseConditions()) {
			if (lose instanceof BallsAlive overrun && overrun.getCount() <= initialBalls) {
				violations.add(new Violation(LOST_AT_START,
						"The round starts with " + initialBalls + " balls, so it would be lost at once by having "
								+ overrun.getCount() + " balls alive",
						overrun, GamemodePackage.Literals.BALLS_ALIVE__COUNT));
			}
		}
		return violations;
	}

	/** Every win condition can actually be met, given what the mode spawns. */
	public static List<Violation> winnable(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		SpawnStrategy spawning = mode.getSpawning();
		boolean looping = spawning instanceof WaveSchedule schedule && schedule.isLoop();
		for (EndCondition win : mode.getWinConditions()) {
			if (win instanceof Cleared && looping) {
				violations.add(new Violation(CONDITION_UNREACHABLE,
						"The waves loop, so the arena is never cleared for good", win, null));
			} else if (win instanceof WavesSurvived waves) {
				if (!(spawning instanceof WaveSchedule schedule)) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							"The mode has no waves to survive", win, null));
				} else if (!schedule.isLoop() && waves.getCount() > schedule.getWaves().size()) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							"The mode only has " + schedule.getWaves().size() + " waves, and they do not loop",
							win, GamemodePackage.Literals.WAVES_SURVIVED__COUNT));
				}
			} else if (win instanceof BallsPopped popped) {
				int available = mode.getPopsToClear();
				if (available != GamemodeDerivations.UNBOUNDED && popped.getCount() > available) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							"Only " + available + " pops are possible in this mode",
							win, GamemodePackage.Literals.BALLS_POPPED__COUNT));
				}
			} else if (win instanceof ScoreReached score) {
				int maxScore = mode.getMaxScore();
				float bonus = mode.getSpeedBonus() != null ? mode.getSpeedBonus().getMaxFactor() : 1;
				long reachable = (long) Math.floor((double) maxScore * bonus);
				if (maxScore != GamemodeDerivations.UNBOUNDED && score.getPoints() > reachable) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							"At most " + reachable + " points can be scored in this mode",
							win, GamemodePackage.Literals.SCORE_REACHED__POINTS));
				}
			}
		}
		return violations;
	}

	/**
	 * A mode without win conditions keeps sending balls (its waves loop); otherwise the round would
	 * never end once everything has been popped.
	 */
	public static List<Violation> endsSomehow(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		boolean looping = mode.getSpawning() instanceof WaveSchedule schedule && schedule.isLoop();
		if (mode.getWinConditions().isEmpty() && !looping) {
			violations.add(new Violation(NEVER_ENDS,
					"Mode " + mode.getName() + " has no win condition and its balls run out, so a round could never end",
					mode, GamemodePackage.Literals.GAME_MODE__WIN_CONDITIONS));
		}
		return violations;
	}

	/**
	 * A mode in which the player can be hurt is lost when the player runs out of health. Otherwise a
	 * player without hearts would be removed from the arena while the round goes on.
	 */
	public static List<Violation> healthDepletedWhenHarmful(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		boolean losesOnHealth = mode.getLoseConditions().stream().anyMatch(HealthDepleted.class::isInstance);
		if (losesOnHealth) {
			return violations;
		}
		List<PlayerEffect> effects = new ArrayList<>();
		for (BallType type : mode.getBallTypes()) {
			effects.addAll(type.getContactEffects());
		}
		for (PowerUp powerUp : mode.getPowerUps()) {
			effects.addAll(powerUp.getEffects());
		}
		if (effects.stream().anyMatch(effect -> effect instanceof Damage || effect instanceof Poison)) {
			violations.add(new Violation(HEALTH_NOT_DECISIVE,
					"The player can be hurt in mode " + mode.getName() + ", so it must be lost when health is depleted",
					mode, GamemodePackage.Literals.GAME_MODE__LOSE_CONDITIONS));
		}
		return violations;
	}

	/** Running out of health or being overrun can only lose a round; the other conditions can only win it. */
	public static List<Violation> fitsRole(EndCondition condition) {
		List<Violation> violations = new ArrayList<>();
		if (condition.eContainer() == null) {
			return violations;
		}
		boolean loseOnly = condition instanceof HealthDepleted || condition instanceof BallsAlive;
		boolean winOnly = condition instanceof Cleared || condition instanceof ScoreReached
				|| condition instanceof BallsPopped || condition instanceof WavesSurvived;
		if (condition.isWin() && loseOnly) {
			violations.add(new Violation(WRONG_ROLE,
					"A " + condition.eClass().getName() + " condition can only lose a round", condition, null));
		} else if (!condition.isWin() && winOnly) {
			violations.add(new Violation(WRONG_ROLE,
					"A " + condition.eClass().getName() + " condition can only win a round", condition, null));
		}
		return violations;
	}

	/** A teleporter leads to another teleporter of the same arena. */
	public static List<Violation> targetInSameArena(Teleporter teleporter) {
		List<Violation> violations = new ArrayList<>();
		Teleporter target = teleporter.getTarget();
		if (target != null && target.eContainer() != teleporter.eContainer()) {
			violations.add(new Violation(TELEPORTER_ELSEWHERE,
					"Teleporter " + target.getName() + " is in another arena",
					teleporter, GamemodePackage.Literals.TELEPORTER__TARGET));
		}
		return violations;
	}

	private static String seconds(float seconds) {
		return (seconds == Math.rint(seconds) ? String.valueOf((int) seconds) : String.valueOf(seconds)) + " s";
	}
}
