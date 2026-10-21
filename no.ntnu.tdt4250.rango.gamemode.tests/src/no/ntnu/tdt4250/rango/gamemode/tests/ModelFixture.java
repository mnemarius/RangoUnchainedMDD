package no.ntnu.tdt4250.rango.gamemode.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.BallSpawn;
import no.ntnu.tdt4250.rango.gamemode.BallType;
import no.ntnu.tdt4250.rango.gamemode.Burst;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodeFactory;
import no.ntnu.tdt4250.rango.gamemode.Heal;
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
 * <li>Tumbleweed splits into 2 (10 points); Bomb bursts into 4 Tumbleweed (25 points).</li>
 * <li>Mode Clear: a fixed layout of one large Tumbleweed and one large Bomb, won when cleared.</li>
 * <li>Mode Waves: two waves (one large Tumbleweed, then two medium Bombs) with a drop table of
 * Shield (weight 3) and Heart (weight 1) at 20 %, won after two waves.</li>
 * </ul>
 */
public class ModelFixture {

	static final GamemodeFactory F = GamemodeFactory.eINSTANCE;

	final Edition edition = F.createEdition();
	final BallType tumbleweed = ball("Tumbleweed", 10);
	final BallType bomb = ball("Bomb", 25);
	final PowerUp shield = F.createPowerUp();
	final PowerUp heart = F.createPowerUp();
	final PlayerProfile rango = F.createPlayerProfile();
	final GameMode clear = F.createGameMode();
	final GameMode waves = F.createGameMode();
	final FixedLayout layout = F.createFixedLayout();
	final WaveSchedule schedule = F.createWaveSchedule();
	final DropTable drops = F.createDropTable();

	public ModelFixture() {
		GamemodeOCL.initialize();
		edition.setName("Fixture");

		Split split = F.createSplit();
		split.setFragments(2);
		tumbleweed.setSplitRule(split);
		Burst burst = F.createBurst();
		burst.setFragments(4);
		burst.setFragmentType(tumbleweed);
		bomb.setSplitRule(burst);
		edition.getBallTypes().add(tumbleweed);
		edition.getBallTypes().add(bomb);

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

		rango.setName("Rango");
		rango.setHealth(3);
		edition.getPlayers().add(rango);

		mode(clear, "Clear");
		layout.getSpawns().add(spawn(tumbleweed, 3, 1));
		layout.getSpawns().add(spawn(bomb, 3, 1));
		clear.setSpawning(layout);
		clear.getWinConditions().add(F.createCleared());

		mode(waves, "Waves");
		Wave first = F.createWave();
		first.getSpawns().add(spawn(tumbleweed, 3, 1));
		Wave second = F.createWave();
		second.setDelay(2);
		second.getSpawns().add(spawn(bomb, 2, 2));
		schedule.getWaves().add(first);
		schedule.getWaves().add(second);
		waves.setSpawning(schedule);
		drops.setChance(20);
		drops.getEntries().add(drop(shield, 3));
		drops.getEntries().add(drop(heart, 1));
		waves.setDrops(drops);
		var survived = F.createWavesSurvived();
		survived.setCount(2);
		waves.getWinConditions().add(survived);
	}

	private BallType ball(String name, int points) {
		BallType type = F.createBallType();
		type.setName(name);
		type.setSprite("Ball/" + name + ".png");
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
		Arena arena = F.createArena();
		arena.setBackground("Desert");
		mode.setArena(arena);
		mode.getLoseConditions().add(F.createHealthDepleted());
		edition.getModes().add(mode);
	}

	static BallSpawn spawn(BallType type, int size, int count) {
		BallSpawn spawn = F.createBallSpawn();
		spawn.setType(type);
		spawn.setSize(size);
		spawn.setCount(count);
		spawn.setX(50);
		spawn.setY(70);
		return spawn;
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
