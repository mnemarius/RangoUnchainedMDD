package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import no.ntnu.tdt4250.rango.gamemode.Cleared;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.Difficulty;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.HealthDepleted;
import no.ntnu.tdt4250.rango.gamemode.InstantEffect;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.LoseCondition;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.PlayerEffect;
import no.ntnu.tdt4250.rango.gamemode.Poison;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.TimeLimit;
import no.ntnu.tdt4250.rango.gamemode.TimeSurvived;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import no.ntnu.tdt4250.rango.gamemode.WavesSurvived;
import no.ntnu.tdt4250.rango.gamemode.WinCondition;

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
	public static final int CONDITION_UNREACHABLE = 107;
	public static final int NEVER_ENDS = 108;
	public static final int TELEPORTER_ELSEWHERE = 110;
	public static final int HEALTH_NOT_DECISIVE = 111;
	public static final int NO_DROP_TABLE = 112;
	public static final int DUPLICATE_DROP_TABLE = 113;
	public static final int DUPLICATE_DIFFICULTY = 114;
	public static final int OPPOSING_INSTANT_EFFECTS = 115;
	public static final int DUPLICATE_CONDITION_KIND = 116;

	/** Issue codes as seen by Xtext, which joins the source and the code of an EMF diagnostic. */
	public static final String ISSUE_NEVER_ENDS = SOURCE + "." + NEVER_ENDS;
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

	/** An enemy type or power-up has at most one effect of each kind: two shields would just overlap. */
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
	 * An enemy type or power-up has at most one kind of instant effect: healing and damaging the player
	 * at the same moment would cancel each other out. Two of the same kind are left to
	 * {@link #distinctEffectKinds}.
	 */
	public static List<Violation> oneInstantEffect(EObject owner, List<PlayerEffect> effects) {
		List<Violation> violations = new ArrayList<>();
		EClass first = null;
		for (PlayerEffect effect : effects) {
			if (effect instanceof InstantEffect) {
				if (first == null) {
					first = effect.eClass();
				} else if (first != effect.eClass()) {
					violations.add(new Violation(OPPOSING_INSTANT_EFFECTS,
							first.getName() + " and " + effect.eClass().getName()
									+ " happen at the same moment and cancel each other out; keep only one",
							effect, null));
				}
			}
		}
		return violations;
	}

	/**
	 * A level has at most one condition of each kind in each role. "time reaches 60 s or time reaches
	 * 90 s" is decided by the shorter time alone, so the other condition would be dead text.
	 */
	public static List<Violation> distinctConditionKinds(Level level) {
		List<Violation> violations = new ArrayList<>();
		for (List<? extends EObject> conditions : List.of(level.getWin(), level.getLose())) {
			Set<EClass> seen = new HashSet<>();
			for (EObject condition : conditions) {
				if (!seen.add(condition.eClass())) {
					violations.add(new Violation(DUPLICATE_CONDITION_KIND,
							about(level, "There are two " + condition.eClass().getName() + " conditions; keep only one"),
							condition, null));
				}
			}
		}
		return violations;
	}

	/**
	 * A round cannot be won and lost by the same event: the time to survive is shorter than the time
	 * limit. Values that are not positive are left to the OCL invariants of the conditions.
	 */
	public static List<Violation> noSimultaneousOutcome(Level level) {
		List<Violation> violations = new ArrayList<>();
		for (LoseCondition lose : level.getLose()) {
			if (lose instanceof TimeLimit limit && limit.getSeconds() > 0) {
				for (WinCondition win : level.getWin()) {
					if (win instanceof TimeSurvived survive && survive.getSeconds() >= limit.getSeconds()) {
						String when = survive.getSeconds() == limit.getSeconds() ? "at the same moment as" : "after";
						violations.add(new Violation(SIMULTANEOUS_OUTCOME,
								about(level, "The round would be won " + when + " it is lost by its time limit of "
										+ seconds(limit.getSeconds())),
								survive, GamemodePackage.Literals.TIME_SURVIVED__SECONDS));
					}
				}
			}
		}
		return violations;
	}

	/** Every win condition of a level can actually be met, given what the level spawns. */
	public static List<Violation> winnable(Level level) {
		List<Violation> violations = new ArrayList<>();
		SpawnStrategy spawning = level.getSpawning();
		boolean looping = spawning instanceof WaveSchedule schedule && schedule.isLoop();
		for (WinCondition win : level.getWin()) {
			if (win instanceof Cleared && looping) {
				violations.add(new Violation(CONDITION_UNREACHABLE,
						about(level, "The waves loop, so the arena is never cleared for good"), win, null));
			} else if (win instanceof WavesSurvived waves) {
				if (!(spawning instanceof WaveSchedule schedule)) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "The " + kind(level) + " has no waves to survive"),
							win, GamemodePackage.Literals.WAVES_SURVIVED__COUNT));
				} else if (!schedule.isLoop() && waves.getCount() > schedule.getWaves().size()) {
					violations.add(new Violation(CONDITION_UNREACHABLE,
							about(level, "The " + kind(level) + " only has " + schedule.getWaves().size() + " waves, and they do not loop"),
							win, GamemodePackage.Literals.WAVES_SURVIVED__COUNT));
				}
			}
		}
		return violations;
	}

	/**
	 * A level without win conditions keeps sending enemies (its waves loop); otherwise its round would
	 * never end once everything has been popped. It is also the last level of its mode, since only
	 * winning a level unlocks the next. The problem is shown at the lose conditions, which the missing
	 * win conditions would stand next to.
	 */
	public static List<Violation> endsSomehow(Level level) {
		List<Violation> violations = new ArrayList<>();
		if (!level.getWin().isEmpty()) {
			return violations;
		}
		if (level.eContainer() instanceof GameMode mode && mode.getLevels().indexOf(level) < mode.getLevels().size() - 1) {
			violations.add(new Violation(NEVER_ENDS,
					about(level, "The level has no win condition, so the levels after it could never be unlocked"),
					level, GamemodePackage.Literals.LEVEL__LOSE));
			return violations;
		}
		boolean looping = level.getSpawning() instanceof WaveSchedule schedule && schedule.isLoop();
		if (!looping) {
			violations.add(new Violation(NEVER_ENDS,
					about(level, "The " + kind(level) + " has no win condition and its enemies run out, so a round could never end"),
					level, GamemodePackage.Literals.LEVEL__LOSE));
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
	 * A level in which the player can be hurt, by its enemies or by the power-ups of its mode, is lost
	 * when the player runs out of health. Otherwise a player without hearts would be removed from the
	 * arena while the round goes on.
	 */
	public static List<Violation> healthDepletedWhenHarmful(Level level) {
		List<Violation> violations = new ArrayList<>();
		if (level.getLose().stream().anyMatch(HealthDepleted.class::isInstance)) {
			return violations;
		}
		List<PlayerEffect> effects = new ArrayList<>();
		for (EnemyType type : GamemodeDerivations.enemyTypes(level)) {
			effects.addAll(type.getContactEffects());
		}
		if (level.eContainer() instanceof GameMode mode) {
			for (PowerUp powerUp : mode.getPowerUps()) {
				effects.addAll(powerUp.getEffects());
			}
		}
		// Harmful means the effect can lower the player's health; a new effect that does so belongs here.
		if (effects.stream().anyMatch(effect -> effect instanceof Damage || effect instanceof Poison)) {
			violations.add(new Violation(HEALTH_NOT_DECISIVE,
					about(level, "The player can be hurt in this " + kind(level) + ", so it must be lost when health is depleted"),
					level, GamemodePackage.Literals.LEVEL__LOSE));
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

	/** An edition defines each difficulty tier at most once, or the game could not tell which applies. */
	public static List<Violation> onePerTier(Difficulty difficulty) {
		List<Violation> violations = new ArrayList<>();
		if (!(difficulty.eContainer() instanceof Edition edition)) {
			return violations;
		}
		for (Difficulty other : edition.getDifficulties()) {
			if (other == difficulty) {
				break;
			}
			if (other.getTier() == difficulty.getTier()) {
				violations.add(new Violation(DUPLICATE_DIFFICULTY,
						"The edition already defines the " + difficulty.getTier().getLiteral() + " difficulty",
						difficulty, GamemodePackage.Literals.DIFFICULTY__TIER));
				break;
			}
		}
		return violations;
	}

	private static String seconds(float seconds) {
		return (seconds == Math.rint(seconds) ? String.valueOf((int) seconds) : String.valueOf(seconds)) + " s";
	}
}
