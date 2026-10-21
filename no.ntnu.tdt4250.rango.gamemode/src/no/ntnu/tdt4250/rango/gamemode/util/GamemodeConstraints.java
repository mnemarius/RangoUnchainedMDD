package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.EnemiesAlive;
import no.ntnu.tdt4250.rango.gamemode.EnemiesPopped;
import no.ntnu.tdt4250.rango.gamemode.Cleared;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.HealthDepleted;
import no.ntnu.tdt4250.rango.gamemode.Level;
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
	public static final int NO_DROP_TABLE = 112;
	public static final int DUPLICATE_DROP_TABLE = 113;

	/** Issue codes as seen by Xtext, which joins the source and the code of an EMF diagnostic. */
	public static final String ISSUE_NEVER_ENDS = SOURCE + "." + NEVER_ENDS;
	public static final String ISSUE_WRONG_ROLE = SOURCE + "." + WRONG_ROLE;
	public static final String ISSUE_HEALTH_NOT_DECISIVE = SOURCE + "." + HEALTH_NOT_DECISIVE;
	public static final String ISSUE_NO_DROP_TABLE = SOURCE + "." + NO_DROP_TABLE;

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

	/** A enemy type or power-up has at most one effect of each kind: two shields would just overlap. */
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
		for (Level level : mode.getLevels()) {
			int initialEnemies = GamemodeDerivations.initialEnemies(level.getSpawning());
			for (EndCondition lose : mode.getLoseConditions()) {
				if (lose instanceof EnemiesAlive overrun && overrun.getCount() <= initialEnemies) {
					violations.add(new Violation(LOST_AT_START,
							about(level, "The round starts with " + initialEnemies + " enemies, so it would be lost at once by having "
									+ overrun.getCount() + " enemies alive"),
							overrun, GamemodePackage.Literals.ENEMIES_ALIVE__COUNT));
				}
			}
		}
		return violations;
	}

	/** Every win condition can actually be met in every level, given what the level spawns. */
	public static List<Violation> winnable(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		for (Level level : mode.getLevels()) {
			violations.addAll(winnable(mode, level));
		}
		return violations;
	}

	private static List<Violation> winnable(GameMode mode, Level level) {
		List<Violation> violations = new ArrayList<>();
		SpawnStrategy spawning = level.getSpawning();
		boolean looping = spawning instanceof WaveSchedule schedule && schedule.isLoop();
		for (EndCondition win : mode.getWinConditions()) {
			if (win instanceof Cleared && looping) {
				violations.add(new Violation(CONDITION_UNREACHABLE,
						about(level, "The waves loop, so the arena is never cleared for good"), win, null));
			} else if (win instanceof WavesSurvived waves) {
				if (!(spawning instanceof WaveSchedule schedule)) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "The " + kind(level) + " has no waves to survive"), win, null));
				} else if (!schedule.isLoop() && waves.getCount() > schedule.getWaves().size()) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "The " + kind(level) + " only has " + schedule.getWaves().size() + " waves, and they do not loop"),
							win, GamemodePackage.Literals.WAVES_SURVIVED__COUNT));
				}
			} else if (win instanceof EnemiesPopped popped) {
				int available = level.getPopsToClear();
				if (available != GamemodeDerivations.UNBOUNDED && popped.getCount() > available) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "Only " + available + " pops are possible in this " + kind(level)),
							win, GamemodePackage.Literals.ENEMIES_POPPED__COUNT));
				}
			} else if (win instanceof ScoreReached score) {
				int maxScore = level.getMaxScore();
				float bonus = mode.getSpeedBonus() != null ? mode.getSpeedBonus().getMaxFactor() : 1;
				long reachable = (long) Math.floor((double) maxScore * bonus);
				if (maxScore != GamemodeDerivations.UNBOUNDED && score.getPoints() > reachable) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "At most " + reachable + " points can be scored in this " + kind(level)),
							win, GamemodePackage.Literals.SCORE_REACHED__POINTS));
				}
			}
		}
		return violations;
	}

	/**
	 * A mode without win conditions keeps sending enemies (its waves loop); otherwise the round would
	 * never end once everything has been popped. A mode with several levels needs a win condition,
	 * since only winning a level moves on to the next.
	 */
	public static List<Violation> endsSomehow(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		if (!mode.getWinConditions().isEmpty()) {
			return violations;
		}
		if (mode.getLevels().size() > 1) {
			violations.add(new Violation(NEVER_ENDS,
					"Mode " + mode.getName() + " has several levels but no win condition, so no level could ever be completed",
					mode, GamemodePackage.Literals.GAME_MODE__WIN_CONDITIONS));
			return violations;
		}
		for (Level level : mode.getLevels()) {
			boolean looping = level.getSpawning() instanceof WaveSchedule schedule && schedule.isLoop();
			if (!looping) {
				violations.add(new Violation(NEVER_ENDS,
						"Mode " + mode.getName() + " has no win condition and its enemies run out, so a round could never end",
						mode, GamemodePackage.Literals.GAME_MODE__WIN_CONDITIONS));
			}
		}
		return violations;
	}

	/** Whether a level is one of several in its mode, and so has to be named in messages. */
	private static boolean oneOfSeveral(Level level) {
		return level.eContainer() instanceof GameMode mode && mode.getLevels().size() > 1;
	}

	/** What a message calls the scope of a level: the mode itself if it has only this level. */
	private static String kind(Level level) {
		return oneOfSeveral(level) ? "level" : "mode";
	}

	/** A message about a level, which says which level it is about if the mode has several. */
	private static String about(Level level, String message) {
		if (!oneOfSeveral(level)) {
			return message;
		}
		return "In level " + level.getNumber() + ", " + Character.toLowerCase(message.charAt(0)) + message.substring(1);
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
		for (EnemyType type : mode.getEnemyTypes()) {
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
		boolean loseOnly = condition instanceof HealthDepleted || condition instanceof EnemiesAlive;
		boolean winOnly = condition instanceof Cleared || condition instanceof ScoreReached
				|| condition instanceof EnemiesPopped || condition instanceof WavesSurvived;
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

	/**
	 * Every enemy type that can appear in a mode has a drop table there, so that popping any enemy has a
	 * chance to drop a power-up. The table is the mode's own or, if the mode has none, the edition's.
	 */
	public static List<Violation> everyEnemyDrops(GameMode mode) {
		List<Violation> violations = new ArrayList<>();
		for (EnemyType type : mode.getEnemyTypes()) {
			if (GamemodeDerivations.dropTableFor(mode, type) == null) {
				violations.add(new Violation(NO_DROP_TABLE,
						type.getName() + " can appear in mode " + mode.getName() + " but has no drop table ("
								+ (mode.getDrops().isEmpty() ? "the edition's" : "the mode's") + " drops list none for it)",
						mode, GamemodePackage.Literals.NAMED_ELEMENT__NAME));
			}
		}
		return violations;
	}

	/** A list of drop tables, of a mode or of the edition, has at most one table per enemy type. */
	public static List<Violation> oneTablePerEnemy(DropTable table) {
		List<Violation> violations = new ArrayList<>();
		EObject container = table.eContainer();
		EStructuralFeature feature = table.eContainingFeature();
		if (container == null || table.getEnemyType() == null || !feature.isMany()) {
			return violations;
		}
		for (Object sibling : (List<?>) container.eGet(feature)) {
			if (sibling == table) {
				break;
			}
			if (sibling instanceof DropTable other && other.getEnemyType() == table.getEnemyType()) {
				violations.add(new Violation(DUPLICATE_DROP_TABLE,
						"There is already a drop table for " + table.getEnemyType().getName(),
						table, GamemodePackage.Literals.DROP_TABLE__ENEMY_TYPE));
				break;
			}
		}
		return violations;
	}

	private static String seconds(float seconds) {
		return (seconds == Math.rint(seconds) ? String.valueOf((int) seconds) : String.valueOf(seconds)) + " s";
	}
}
