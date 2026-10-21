package no.ntnu.tdt4250.rango.gamemode.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodeFactory;
import no.ntnu.tdt4250.rango.gamemode.Heal;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.Shield;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeOCL;

/**
 * A small valid edition, built in code. Every test starts from it and changes one thing.
 * <ul>
 * <li>Tumbleweed splits into 2 (10 points); Bomb splits into 4 Tumbleweed (25 points).</li>
 * <li>The edition's drop tables: Tumbleweed drops Heart at 5 %, Bomb drops Heart at 10 %.</li>
 * <li>Every mode has one level, whose arena has a desert background.</li>
 * <li>Mode Clear: a fixed layout of one large Tumbleweed and one large Bomb, won when cleared. It
 * uses the edition's drop tables.</li>
 * <li>Mode Waves: two waves (one large Tumbleweed, then two medium Bombs), won after two waves. Its
 * own drop tables replace the edition's: Bomb drops Shield (weight 3) or Heart (weight 1) at 20 %,
 * Tumbleweed drops Heart at 10 %.</li>
 * </ul>
 */
public class ModelFixture {

	static final GamemodeFactory F = GamemodeFactory.eINSTANCE;

	final Edition edition = F.createEdition();
	final EnemyType tumbleweed = enemy("Tumbleweed", 10);
	final EnemyType bomb = enemy("Bomb", 25);
	final PowerUp shield = F.createPowerUp();
	final PowerUp heart = F.createPowerUp();
	final PlayerProfile rango = F.createPlayerProfile();
	final GameMode clear = F.createGameMode();
	final GameMode waves = F.createGameMode();
	final FixedLayout layout = F.createFixedLayout();
	final WaveSchedule schedule = F.createWaveSchedule();
	final DropTable tumbleweedDefault = dropTable(tumbleweed, 5);
	final DropTable bombDefault = dropTable(bomb, 10);
	final DropTable drops = dropTable(bomb, 20);
	final DropTable tumbleweedDrops = dropTable(tumbleweed, 10);

	public ModelFixture() {
		GamemodeOCL.initialize();
		edition.setName("Fixture");

		Split split = F.createSplit();
		split.setFragments(2);
		tumbleweed.setSplitRule(split);
		Split blast = F.createSplit();
		blast.setFragments(4);
		blast.setFragmentType(tumbleweed);
		bomb.setSplitRule(blast);
		edition.getEnemyTypes().add(tumbleweed);
		edition.getEnemyTypes().add(bomb);

		shield.setName("Shield");
		shield.setSprite("Powerup/Shield.png");
		Shield shieldEffect = F.createShield();
		shieldEffect.setDuration(8);
		shield.getEffects().add(shieldEffect);
		heart.setName("Heart");
		heart.setSprite("Powerup/Health.png");
		Heal heal = F.createHeal();
		heal.setAmount(1);
		heart.getEffects().add(heal);
		edition.getPowerUps().add(shield);
		edition.getPowerUps().add(heart);
		tumbleweedDefault.getEntries().add(drop(heart, 1));
		bombDefault.getEntries().add(drop(heart, 1));
		edition.getDrops().add(tumbleweedDefault);
		edition.getDrops().add(bombDefault);

		rango.setName("Rango");
		rango.setHealth(3);
		edition.getPlayers().add(rango);

		mode(clear, "Clear");
		layout.getSpawns().add(spawn(tumbleweed, 3, 1));
		layout.getSpawns().add(spawn(bomb, 3, 1));
		level(clear).setSpawning(layout);
		clear.getWinConditions().add(F.createCleared());

		mode(waves, "Waves");
		Wave first = F.createWave();
		first.getSpawns().add(spawn(tumbleweed, 3, 1));
		Wave second = F.createWave();
		second.setDelay(2);
		second.getSpawns().add(spawn(bomb, 2, 2));
		schedule.getWaves().add(first);
		schedule.getWaves().add(second);
		level(waves).setSpawning(schedule);
		drops.getEntries().add(drop(shield, 3));
		drops.getEntries().add(drop(heart, 1));
		tumbleweedDrops.getEntries().add(drop(heart, 1));
		waves.getDrops().add(drops);
		waves.getDrops().add(tumbleweedDrops);
		var survived = F.createWavesSurvived();
		survived.setCount(2);
		waves.getWinConditions().add(survived);
	}

	private EnemyType enemy(String name, int points) {
		EnemyType type = F.createEnemyType();
		type.setName(name);
		type.setSprite("Enemy/" + name + ".png");
		type.setPoints(points);
		Damage damage = F.createDamage();
		damage.setAmount(1);
		type.getContactEffects().add(damage);
		return type;
	}

	private void mode(GameMode mode, String name) {
		mode.setName(name);
		mode.setTitle(name);
		mode.setPlayer(rango);
		mode.getLevels().add(level());
		mode.getLoseConditions().add(F.createHealthDepleted());
		edition.getModes().add(mode);
	}

	/** A level with an empty desert arena and no spawning yet. */
	static Level level() {
		Level level = F.createLevel();
		Arena arena = F.createArena();
		arena.setBackground("Desert");
		level.setArena(arena);
		return level;
	}

	static <T extends EObject> T copyOf(T object) {
		return EcoreUtil.copy(object);
	}

	/** The first level of a mode. */
	static Level level(GameMode mode) {
		return mode.getLevels().get(0);
	}

	static EnemySpawn spawn(EnemyType type, int size, int count) {
		EnemySpawn spawn = F.createEnemySpawn();
		spawn.setType(type);
		spawn.setSize(size);
		spawn.setCount(count);
		spawn.setX(50);
		spawn.setY(70);
		return spawn;
	}

	static DropTable dropTable(EnemyType type, float chance) {
		DropTable table = F.createDropTable();
		table.setEnemyType(type);
		table.setChance(chance);
		return table;
	}

	static Drop drop(PowerUp powerUp, int weight) {
		Drop drop = F.createDrop();
		drop.setPowerUp(powerUp);
		drop.setWeight(weight);
		return drop;
	}

	static Diagnostic validate(EObject object) {
		return Diagnostician.INSTANCE.validate(object);
	}
}
