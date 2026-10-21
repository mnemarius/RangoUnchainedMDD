package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;

import no.ntnu.tdt4250.rango.gamemode.BallSpawn;
import no.ntnu.tdt4250.rango.gamemode.BallType;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.Fragmenting;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;

/**
 * The values of the derived features of the metamodel. The generated {@code impl} classes delegate
 * to these methods, so that all hand-written logic stays out of the generated sources.
 */
public final class GamemodeDerivations {

	/** The value of the counting features when a mode never runs out of balls. */
	public static final int UNBOUNDED = -1;

	/** The largest size class of a ball. Larger (invalid) sizes are counted as this one. */
	public static final int MAX_SIZE = 3;

	private GamemodeDerivations() {
	}

	/** The type the fragments of a rule get: its fragment type, or else the ball type owning it. */
	public static BallType resultType(Fragmenting rule) {
		if (rule.getFragmentType() != null) {
			return rule.getFragmentType();
		}
		EObject owner = rule.eContainer();
		return owner instanceof BallType type ? type : null;
	}

	/** The ball types that popping a ball of the given type can create. */
	public static EList<BallType> producedTypes(BallType type) {
		List<BallType> produced = new ArrayList<>();
		if (type.getSplitRule() instanceof Fragmenting rule && resultType(rule) != null) {
			produced.add(resultType(rule));
		}
		return unmodifiable(type, GamemodePackage.Literals.BALL_TYPE__PRODUCED_TYPES, produced);
	}

	/**
	 * The hits needed to get rid of one ball of a type and size, and of everything it breaks into.
	 * With f fragments of the same type: 1 for a small ball, 1 + f for a medium one, 1 + f + f² for a large one.
	 */
	public static long popsFor(BallType type, int size) {
		if (type == null || size < 1) {
			return 0;
		}
		int clamped = Math.min(size, MAX_SIZE);
		if (clamped == 1 || !(type.getSplitRule() instanceof Fragmenting rule)) {
			return 1;
		}
		return 1 + (long) Math.max(rule.getFragments(), 0) * popsFor(resultType(rule), clamped - 1);
	}

	/** The points earned by popping one ball of a type and size and everything it breaks into. */
	public static long pointsFor(BallType type, int size) {
		if (type == null || size < 1) {
			return 0;
		}
		int clamped = Math.min(size, MAX_SIZE);
		if (clamped == 1 || !(type.getSplitRule() instanceof Fragmenting rule)) {
			return type.getPoints();
		}
		return type.getPoints() + (long) Math.max(rule.getFragments(), 0) * pointsFor(resultType(rule), clamped - 1);
	}

	public static int popsToClear(BallSpawn spawn) {
		return saturate(spawn.getCount() * popsFor(spawn.getType(), spawn.getSize()));
	}

	public static int popsToClear(Wave wave) {
		long pops = 0;
		for (BallSpawn spawn : wave.getSpawns()) {
			pops += spawn.getPopsToClear();
		}
		return saturate(pops);
	}

	public static int popsToClear(SpawnStrategy strategy) {
		long pops = 0;
		if (strategy instanceof FixedLayout layout) {
			for (BallSpawn spawn : layout.getSpawns()) {
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

	public static int popsToClear(GameMode mode) {
		return mode.getSpawning() == null ? 0 : mode.getSpawning().getPopsToClear();
	}

	public static int maxScore(GameMode mode) {
		SpawnStrategy strategy = mode.getSpawning();
		if (strategy instanceof WaveSchedule schedule && schedule.isLoop()) {
			return UNBOUNDED;
		}
		long points = 0;
		for (BallSpawn spawn : allSpawns(strategy)) {
			points += spawn.getCount() * pointsFor(spawn.getType(), spawn.getSize());
		}
		return saturate(points);
	}

	/** All spawns of a strategy, in order: those of the layout, or those of every wave. */
	public static List<BallSpawn> allSpawns(SpawnStrategy strategy) {
		List<BallSpawn> spawns = new ArrayList<>();
		if (strategy instanceof FixedLayout layout) {
			spawns.addAll(layout.getSpawns());
		} else if (strategy instanceof WaveSchedule schedule) {
			for (Wave wave : schedule.getWaves()) {
				spawns.addAll(wave.getSpawns());
			}
		}
		return spawns;
	}

	/** The number of balls in the arena when the round starts (fixed layout) or the first wave arrives. */
	public static int initialBalls(SpawnStrategy strategy) {
		List<BallSpawn> spawns = new ArrayList<>();
		if (strategy instanceof FixedLayout layout) {
			spawns.addAll(layout.getSpawns());
		} else if (strategy instanceof WaveSchedule schedule && !schedule.getWaves().isEmpty()) {
			spawns.addAll(schedule.getWaves().get(0).getSpawns());
		}
		long balls = 0;
		for (BallSpawn spawn : spawns) {
			balls += spawn.getCount();
		}
		return saturate(balls);
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

	/** The drop table that applies to pops of the given ball type in the mode, or null if there is none. */
	public static DropTable dropTableFor(GameMode mode, BallType type) {
		for (DropTable table : mode.getEffectiveDrops()) {
			if (table.getBallType() == type) {
				return table;
			}
		}
		return null;
	}

	/**
	 * The ball types that can appear in a mode: those it spawns, and everything popping them can
	 * produce, in the order the edition declares them.
	 */
	public static EList<BallType> ballTypes(GameMode mode) {
		Set<BallType> reachable = new LinkedHashSet<>();
		List<BallType> pending = new ArrayList<>();
		for (BallSpawn spawn : allSpawns(mode.getSpawning())) {
			pending.add(spawn.getType());
		}
		while (!pending.isEmpty()) {
			BallType type = pending.remove(pending.size() - 1);
			if (type != null && reachable.add(type)) {
				pending.addAll(type.getProducedTypes());
			}
		}
		List<BallType> types = new ArrayList<>();
		if (mode.eContainer() instanceof Edition edition) {
			for (BallType type : edition.getBallTypes()) {
				if (reachable.contains(type)) {
					types.add(type);
				}
			}
		}
		for (BallType type : reachable) {
			if (!types.contains(type)) {
				types.add(type);
			}
		}
		return unmodifiable(mode, GamemodePackage.Literals.GAME_MODE__BALL_TYPES, types);
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
