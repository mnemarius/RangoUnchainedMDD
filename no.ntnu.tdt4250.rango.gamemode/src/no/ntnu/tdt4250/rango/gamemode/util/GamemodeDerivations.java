package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;

import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;

/**
 * The values of the derived features of the metamodel. The generated {@code impl} classes delegate
 * to these methods, so that all hand-written logic stays out of the generated sources.
 */
public final class GamemodeDerivations {

	/** The value of the counting features when a mode never runs out of enemies. */
	public static final int UNBOUNDED = -1;

	/** The largest size class of an enemy. Larger (invalid) sizes are counted as this one. */
	public static final int MAX_SIZE = 3;

	/** The number of fragments that close into a full ring. Fewer fan out upwards, more close the gaps. */
	public static final int FULL_RING = 8;

	private GamemodeDerivations() {
	}

	/** The type the fragments of a rule get: its fragment type, or else the enemy type owning it. */
	public static EnemyType resultType(Split rule) {
		if (rule.getFragmentType() != null) {
			return rule.getFragmentType();
		}
		EObject owner = rule.eContainer();
		return owner instanceof EnemyType type ? type : null;
	}

	/** The angle between neighbouring fragments, in degrees: 45 up to a full ring, then 360 over the count. */
	public static float spacing(Split rule) {
		return 360f / Math.max(rule.getFragments(), FULL_RING);
	}

	/** The enemy types that popping an enemy of the given type can create. */
	public static EList<EnemyType> producedTypes(EnemyType type) {
		List<EnemyType> produced = new ArrayList<>();
		if (type.getSplitRule() instanceof Split rule && resultType(rule) != null) {
			produced.add(resultType(rule));
		}
		return unmodifiable(type, GamemodePackage.Literals.ENEMY_TYPE__PRODUCED_TYPES, produced);
	}

	/**
	 * The hits needed to get rid of one enemy of a type and size, and of everything it breaks into.
	 * With f fragments of the same type: 1 for a small enemy, 1 + f for a medium one, 1 + f + f² for a large one.
	 */
	public static long popsFor(EnemyType type, int size) {
		if (type == null || size < 1) {
			return 0;
		}
		int clamped = Math.min(size, MAX_SIZE);
		if (clamped == 1 || !(type.getSplitRule() instanceof Split rule)) {
			return 1;
		}
		return 1 + (long) Math.max(rule.getFragments(), 0) * popsFor(resultType(rule), clamped - 1);
	}

	/** The points earned by popping one enemy of a type and size and everything it breaks into. */
	public static long pointsFor(EnemyType type, int size) {
		if (type == null || size < 1) {
			return 0;
		}
		int clamped = Math.min(size, MAX_SIZE);
		if (clamped == 1 || !(type.getSplitRule() instanceof Split rule)) {
			return type.getPoints();
		}
		return type.getPoints() + (long) Math.max(rule.getFragments(), 0) * pointsFor(resultType(rule), clamped - 1);
	}

	public static int popsToClear(EnemySpawn spawn) {
		return saturate(spawn.getCount() * popsFor(spawn.getType(), spawn.getSize()));
	}

	public static int popsToClear(Wave wave) {
		long pops = 0;
		for (EnemySpawn spawn : wave.getSpawns()) {
			pops += spawn.getPopsToClear();
		}
		return saturate(pops);
	}

	public static int popsToClear(SpawnStrategy strategy) {
		long pops = 0;
		if (strategy instanceof FixedLayout layout) {
			for (EnemySpawn spawn : layout.getSpawns()) {
				pops += spawn.getPopsToClear();
			}
		} else if (strategy instanceof WaveSchedule schedule) {
			if (schedule.isLoop()) {
				return UNBOUNDED;
			}
			for (Wave wave : schedule.getWaves()) {
				pops += wave.getPopsToClear();
			}
		}
		return saturate(pops);
	}

	public static int popsToClear(Level level) {
		return level.getSpawning() == null ? 0 : level.getSpawning().getPopsToClear();
	}

	public static int maxScore(Level level) {
		SpawnStrategy strategy = level.getSpawning();
		if (strategy instanceof WaveSchedule schedule && schedule.isLoop()) {
			return UNBOUNDED;
		}
		long points = 0;
		for (EnemySpawn spawn : allSpawns(strategy)) {
			points += spawn.getCount() * pointsFor(spawn.getType(), spawn.getSize());
		}
		return saturate(points);
	}

	/** The pops of all levels of a mode; unbounded if any level never runs out of enemies. */
	public static int popsToClear(GameMode mode) {
		long pops = 0;
		for (Level level : mode.getLevels()) {
			if (level.getPopsToClear() == UNBOUNDED) {
				return UNBOUNDED;
			}
			pops += level.getPopsToClear();
		}
		return saturate(pops);
	}

	/** The points of all levels of a mode; unbounded if any level never runs out of enemies. */
	public static int maxScore(GameMode mode) {
		long points = 0;
		for (Level level : mode.getLevels()) {
			if (level.getMaxScore() == UNBOUNDED) {
				return UNBOUNDED;
			}
			points += level.getMaxScore();
		}
		return saturate(points);
	}

	public static int number(Level level) {
		return level.eContainer() instanceof GameMode mode ? mode.getLevels().indexOf(level) + 1 : 0;
	}

	/** The level an element belongs to, or null if it is not inside a level. */
	public static Level levelOf(EObject element) {
		for (EObject current = element; current != null; current = current.eContainer()) {
			if (current instanceof Level level) {
				return level;
			}
		}
		return null;
	}

	/** All spawns of a strategy, in order: those of the layout, or those of every wave. */
	public static List<EnemySpawn> allSpawns(SpawnStrategy strategy) {
		List<EnemySpawn> spawns = new ArrayList<>();
		if (strategy instanceof FixedLayout layout) {
			spawns.addAll(layout.getSpawns());
		} else if (strategy instanceof WaveSchedule schedule) {
			for (Wave wave : schedule.getWaves()) {
				spawns.addAll(wave.getSpawns());
			}
		}
		return spawns;
	}

	/** The number of enemies in the arena when the round starts (fixed layout) or the first wave arrives. */
	public static int initialEnemies(SpawnStrategy strategy) {
		List<EnemySpawn> spawns = new ArrayList<>();
		if (strategy instanceof FixedLayout layout) {
			spawns.addAll(layout.getSpawns());
		} else if (strategy instanceof WaveSchedule schedule && !schedule.getWaves().isEmpty()) {
			spawns.addAll(schedule.getWaves().get(0).getSpawns());
		}
		long enemies = 0;
		for (EnemySpawn spawn : spawns) {
			enemies += spawn.getCount();
		}
		return saturate(enemies);
	}

	public static int number(Wave wave) {
		return wave.eContainer() instanceof WaveSchedule schedule ? schedule.getWaves().indexOf(wave) + 1 : 0;
	}

	public static int totalWeight(DropTable table) {
		long total = 0;
		for (Drop drop : table.getEntries()) {
			total += drop.getWeight();
		}
		return saturate(total);
	}

	public static float probability(Drop drop) {
		DropTable table = drop.getTable();
		if (table == null || table.getTotalWeight() <= 0) {
			return 0;
		}
		return table.getChance() * drop.getWeight() / table.getTotalWeight();
	}

	public static float share(Drop drop) {
		DropTable table = drop.getTable();
		if (table == null || table.getTotalWeight() <= 0) {
			return 0;
		}
		return 100f * drop.getWeight() / table.getTotalWeight();
	}

	/** The drop tables of the mode if it has any, otherwise those of its edition. */
	public static EList<DropTable> effectiveDrops(GameMode mode) {
		List<DropTable> tables = new ArrayList<>(mode.getDrops());
		if (tables.isEmpty() && mode.eContainer() instanceof Edition edition) {
			tables.addAll(edition.getDrops());
		}
		return unmodifiable(mode, GamemodePackage.Literals.GAME_MODE__EFFECTIVE_DROPS, tables);
	}

	/** The drop table that applies to pops of the given enemy type in the mode, or null if there is none. */
	public static DropTable dropTableFor(GameMode mode, EnemyType type) {
		for (DropTable table : mode.getEffectiveDrops()) {
			if (table.getEnemyType() == type) {
				return table;
			}
		}
		return null;
	}

	/**
	 * The enemy types that can appear in a mode: those its levels spawn, and everything popping them
	 * can produce, in the order the edition declares them.
	 */
	public static EList<EnemyType> enemyTypes(GameMode mode) {
		Set<EnemyType> reachable = new LinkedHashSet<>();
		List<EnemyType> pending = new ArrayList<>();
		for (Level level : mode.getLevels()) {
			for (EnemySpawn spawn : allSpawns(level.getSpawning())) {
				pending.add(spawn.getType());
			}
		}
		while (!pending.isEmpty()) {
			EnemyType type = pending.remove(pending.size() - 1);
			if (type != null && reachable.add(type)) {
				pending.addAll(type.getProducedTypes());
			}
		}
		List<EnemyType> types = new ArrayList<>();
		if (mode.eContainer() instanceof Edition edition) {
			for (EnemyType type : edition.getEnemyTypes()) {
				if (reachable.contains(type)) {
					types.add(type);
				}
			}
		}
		for (EnemyType type : reachable) {
			if (!types.contains(type)) {
				types.add(type);
			}
		}
		return unmodifiable(mode, GamemodePackage.Literals.GAME_MODE__ENEMY_TYPES, types);
	}

	public static EList<PowerUp> powerUps(GameMode mode) {
		Set<PowerUp> powerUps = new LinkedHashSet<>();
		for (DropTable table : mode.getEffectiveDrops()) {
			for (Drop drop : table.getEntries()) {
				if (drop.getPowerUp() != null) {
					powerUps.add(drop.getPowerUp());
				}
			}
		}
		return unmodifiable(mode, GamemodePackage.Literals.GAME_MODE__POWER_UPS, new ArrayList<>(powerUps));
	}

	public static boolean isWin(EndCondition condition) {
		return condition.eContainingFeature() == GamemodePackage.Literals.GAME_MODE__WIN_CONDITIONS;
	}

	/** The mode an element belongs to, or null if it is not inside a mode. */
	public static GameMode modeOf(EObject element) {
		for (EObject current = element; current != null; current = current.eContainer()) {
			if (current instanceof GameMode mode) {
				return mode;
			}
		}
		return null;
	}

	private static int saturate(long value) {
		return (int) Math.min(value, Integer.MAX_VALUE);
	}

	private static <T> EList<T> unmodifiable(EObject owner, EStructuralFeature feature, List<T> values) {
		return new EcoreEList.UnmodifiableEList<>((org.eclipse.emf.ecore.InternalEObject) owner, feature, values.size(),
				values.toArray());
	}
}
