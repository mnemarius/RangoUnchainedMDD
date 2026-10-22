package no.ntnu.tdt4250.rango.gamemode.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.junit.jupiter.api.Test;

import no.ntnu.tdt4250.rango.gamemode.Block;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.EnemiesAlive;
import no.ntnu.tdt4250.rango.gamemode.EnemiesPopped;
import no.ntnu.tdt4250.rango.gamemode.Difficulty;
import no.ntnu.tdt4250.rango.gamemode.DifficultyTier;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.Heal;
import no.ntnu.tdt4250.rango.gamemode.JumpPad;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.Modifier;
import no.ntnu.tdt4250.rango.gamemode.ModifierTarget;
import no.ntnu.tdt4250.rango.gamemode.Poison;
import no.ntnu.tdt4250.rango.gamemode.ScoreReached;
import no.ntnu.tdt4250.rango.gamemode.SpeedBonus;
import no.ntnu.tdt4250.rango.gamemode.SpeedChange;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.TimeReached;
import no.ntnu.tdt4250.rango.gamemode.TimedEffect;
import no.ntnu.tdt4250.rango.gamemode.WavesSurvived;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeConstraints;

/**
 * The constraints of the metamodel: the OCL invariants (evaluated by the OCL delegates) and the Java
 * constraints. Each test breaks one rule of the valid fixture and checks that exactly that rule fires.
 */
public class ConstraintsTest {

	private final ModelFixture f = new ModelFixture();

	@Test
	public void fixtureIsValid() {
		Diagnostic diagnostic = ModelFixture.validate(f.edition);
		assertEquals(Diagnostic.OK, diagnostic.getSeverity(), messages(diagnostic).toString());
	}

	// ---------------------------------------------------------------- OCL invariants

	@Test
	public void oclScaleMustBePositive() {
		f.tumbleweed.setScale(0);
		assertViolated("positiveScale");
	}

	@Test
	public void oclSplitNeedsAFragment() {
		((Split) f.bomb.getSplitRule()).setFragments(0);
		assertViolated("atLeastOneFragment");
	}

	@Test
	public void oclSplitHasAtMostSixteenFragments() {
		((Split) f.bomb.getSplitRule()).setFragments(17);
		assertViolated("atMostSixteenFragments");
	}

	@Test
	public void oclPoisonTicksWithinItsDuration() {
		Poison poison = ModelFixture.F.createPoison();
		poison.setAmount(1);
		poison.setDuration(2);
		poison.setInterval(3);
		f.tumbleweed.getContactEffects().add(poison);
		assertViolated("intervalWithinDuration");
	}

	@Test
	public void oclPositionsAreInsideTheArena() {
		f.layout.getSpawns().get(0).setY(120);
		assertViolated("insideArena");
	}

	@Test
	public void oclEscalationNeedsLoopingWaves() {
		f.schedule.setEscalation(1);
		assertViolated("escalationNeedsLoop");
	}

	@Test
	public void oclDropTableListsEachPowerUpOnce() {
		f.drops.getEntries().add(ModelFixture.drop(f.shield, 1));
		assertViolated("distinctPowerUps");
	}

	@Test
	public void oclDropChanceIsAPositivePercentage() {
		f.drops.setChance(0);
		assertViolated("chanceIsPercentage");
	}

	@Test
	public void oclHealthWithinMaximum() {
		f.rango.setMaxHealth(2);
		assertViolated("healthWithinMaximum");
	}

	@Test
	public void oclTeleporterDoesNotLeadToItself() {
		Teleporter teleporter = ModelFixture.F.createTeleporter();
		teleporter.setName("Loop");
		teleporter.setTarget(teleporter);
		ModelFixture.level(f.clear).getArena().getObstacles().add(teleporter);
		assertViolated("notToItself");
	}

	@Test
	public void oclSpeedBonusRaisesTheScore() {
		SpeedBonus bonus = ModelFixture.F.createSpeedBonus();
		bonus.setMaxFactor(1);
		f.clear.setSpeedBonus(bonus);
		assertViolated("bonusAboveOne");
	}

	@Test
	public void oclSpeedBonusLastsAWhile() {
		SpeedBonus bonus = ModelFixture.F.createSpeedBonus();
		bonus.setDuration(0);
		f.clear.setSpeedBonus(bonus);
		assertViolated("positiveDuration");
	}

	@Test
	public void oclEnemyBounceIsPositive() {
		f.tumbleweed.setBounce(0);
		assertViolated("positiveBounce");
	}

	@Test
	public void oclEnemySpeedIsPositive() {
		f.tumbleweed.setSpeed(0);
		assertViolated("positiveSpeed");
	}

	@Test
	public void oclEnemyPointsAreNotNegative() {
		f.tumbleweed.setPoints(-1);
		assertViolated("nonNegativePoints");
	}

	@Test
	public void oclFragmentsAreLaunched() {
		((Split) f.bomb.getSplitRule()).setLaunchSpeed(0);
		assertViolated("positiveLaunchSpeed");
	}

	@Test
	public void oclDamageIsPositive() {
		((Damage) f.tumbleweed.getContactEffects().get(0)).setAmount(0);
		assertViolated("positiveAmount");
	}

	@Test
	public void oclHealIsPositive() {
		((Heal) f.heart.getEffects().get(0)).setAmount(0);
		assertViolated("positiveAmount");
	}

	@Test
	public void oclPoisonIsPositive() {
		Poison poison = ModelFixture.F.createPoison();
		poison.setDuration(6);
		poison.setInterval(2);
		f.tumbleweed.getContactEffects().add(poison);
		assertViolated("positiveAmount");
	}

	@Test
	public void oclTimedEffectLastsAWhile() {
		((TimedEffect) f.shield.getEffects().get(0)).setDuration(0);
		assertViolated("positiveDuration");
	}

	@Test
	public void oclSpeedChangeChangesTheSpeed() {
		SpeedChange change = ModelFixture.F.createSpeedChange();
		change.setDuration(5);
		change.setFactor(1);
		f.shield.getEffects().add(change);
		assertViolated("factorChangesSpeed");
	}

	@Test
	public void oclPlayerHealthIsPositive() {
		f.rango.setHealth(0);
		assertViolated("positiveHealth");
	}

	@Test
	public void oclPlayerSpeedIsPositive() {
		f.rango.setSpeed(0);
		assertViolated("positiveSpeed");
	}

	@Test
	public void oclTongueTimeIsPositive() {
		f.rango.setTongueTime(0);
		assertViolated("positiveTongueTime");
	}

	@Test
	public void oclPlayerTimesAreNotNegative() {
		f.rango.setGraceTime(-1);
		assertViolated("nonNegativeTimes");
	}

	@Test
	public void oclGravityIsPositive() {
		f.clear.setGravity(0);
		assertViolated("positiveGravity");
	}

	@Test
	public void oclPlayerStartsInsideTheArena() {
		ModelFixture.level(f.clear).getArena().setPlayerStart(120);
		assertViolated("playerStartInside");
	}

	@Test
	public void oclBlockHasASize() {
		Block block = ModelFixture.F.createBlock();
		block.setName("Ledge");
		block.setWidth(0);
		block.setHeight(5);
		ModelFixture.level(f.clear).getArena().getObstacles().add(block);
		assertViolated("positiveSize");
	}

	@Test
	public void oclJumpPadLaunches() {
		JumpPad pad = ModelFixture.F.createJumpPad();
		pad.setName("Pad");
		ModelFixture.level(f.clear).getArena().getObstacles().add(pad);
		assertViolated("positiveLaunch");
	}

	@Test
	public void oclEscalationIsNotNegative() {
		f.schedule.setEscalation(-1);
		assertViolated("nonNegativeEscalation");
	}

	@Test
	public void oclWaveDelayIsNotNegative() {
		f.schedule.getWaves().get(1).setDelay(-1);
		assertViolated("nonNegativeDelay");
	}

	@Test
	public void oclSpawnSizeIsInRange() {
		f.layout.getSpawns().get(0).setSize(4);
		assertViolated("sizeInRange");
	}

	@Test
	public void oclSpawnHasAnEnemy() {
		f.layout.getSpawns().get(0).setCount(0);
		assertViolated("positiveCount");
	}

	@Test
	public void oclDropWeightIsPositive() {
		f.drops.getEntries().get(0).setWeight(0);
		assertViolated("positiveWeight");
	}

	@Test
	public void oclTimeReachedTakesTime() {
		TimeReached limit = ModelFixture.F.createTimeReached();
		f.clear.getLoseConditions().add(limit);
		assertViolated("positiveSeconds");
	}

	@Test
	public void oclScoreReachedNeedsPoints() {
		f.clear.getWinConditions().add(ModelFixture.F.createScoreReached());
		assertViolated("positivePoints");
	}

	@Test
	public void oclEnemiesPoppedNeedsAPop() {
		f.clear.getWinConditions().add(ModelFixture.F.createEnemiesPopped());
		assertViolated("positiveCount");
	}

	@Test
	public void oclWavesSurvivedNeedsAWave() {
		((WavesSurvived) f.waves.getWinConditions().get(0)).setCount(0);
		assertViolated("positiveCount");
	}

	@Test
	public void oclEnemiesAliveNeedsAnEnemy() {
		f.clear.getLoseConditions().add(ModelFixture.F.createEnemiesAlive());
		// no enemies alive is also how every round starts, so the round is lost at once as well
		Diagnostic diagnostic = ModelFixture.validate(f.edition);
		List<String> messages = messages(diagnostic);
		assertEquals(2, messages.size(), messages.toString());
		assertTrue(messages.stream().anyMatch(m -> m.contains("'positiveCount'")), messages.toString());
		assertTrue(diagnostic.getChildren().stream().anyMatch(d -> d.getCode() == GamemodeConstraints.LOST_AT_START),
				messages.toString());
	}

	@Test
	public void oclDifficultyModifiesEachValueOnce() {
		Difficulty hard = difficulty(DifficultyTier.HARD, ModifierTarget.ENEMY_SPEED, 1.3f);
		hard.getModifiers().add(difficulty(DifficultyTier.HARD, ModifierTarget.ENEMY_SPEED, 1.5f).getModifiers().get(0));
		f.edition.getDifficulties().add(hard);
		assertViolated("distinctTargets");
	}

	@Test
	public void oclModifierFactorIsPositive() {
		f.edition.getDifficulties().add(difficulty(DifficultyTier.HARD, ModifierTarget.ENEMY_SPEED, 0));
		assertViolated("positiveFactor");
	}

	// ---------------------------------------------------------------- Java constraints

	@Test
	public void namesAreUniqueAmongSiblings() {
		f.bomb.setName("Tumbleweed");
		assertCode(GamemodeConstraints.NAME_NOT_UNIQUE);
	}

	@Test
	public void effectKindsAreDistinct() {
		var second = ModelFixture.F.createDamage();
		second.setAmount(2);
		f.tumbleweed.getContactEffects().add(second);
		assertCode(GamemodeConstraints.DUPLICATE_EFFECT_KIND);
	}

	@Test
	public void cannotWinAndLoseByTheSameTime() {
		TimeReached survive = ModelFixture.F.createTimeReached();
		survive.setSeconds(60);
		TimeReached limit = ModelFixture.F.createTimeReached();
		limit.setSeconds(60);
		f.clear.getWinConditions().add(survive);
		f.clear.getLoseConditions().add(limit);
		assertCode(GamemodeConstraints.SIMULTANEOUS_OUTCOME);
	}

	@Test
	public void cannotBeLostAtTheStart() {
		EnemiesAlive overrun = ModelFixture.F.createEnemiesAlive();
		overrun.setCount(2);
		f.clear.getLoseConditions().add(overrun);
		assertCode(GamemodeConstraints.LOST_AT_START);
	}

	@Test
	public void winConditionsMustBeReachable() {
		EnemiesPopped popped = ModelFixture.F.createEnemiesPopped();
		popped.setCount(21);
		f.clear.getWinConditions().add(popped);
		assertCode(GamemodeConstraints.CONDITION_UNREACHABLE);
	}

	@Test
	public void scoreBonusRaisesTheReachableScore() {
		ScoreReached score = ModelFixture.F.createScoreReached();
		score.setPoints(300);
		f.clear.getWinConditions().add(score);
		assertCode(GamemodeConstraints.CONDITION_UNREACHABLE);
		SpeedBonus bonus = ModelFixture.F.createSpeedBonus();
		f.clear.setSpeedBonus(bonus);
		assertEquals(Diagnostic.OK, ModelFixture.validate(f.edition).getSeverity());
		// the reachable score follows the factor of the model: 215 points at most 1.2 times
		bonus.setMaxFactor(1.2f);
		assertCode(GamemodeConstraints.CONDITION_UNREACHABLE);
	}

	@Test
	public void clearedNeedsWavesThatEnd() {
		f.waves.getWinConditions().add(ModelFixture.F.createCleared());
		f.schedule.setLoop(true);
		assertCode(GamemodeConstraints.CONDITION_UNREACHABLE);
	}

	@Test
	public void modeWithoutWinConditionsMustLoop() {
		f.clear.getWinConditions().clear();
		assertCode(GamemodeConstraints.NEVER_ENDS);
	}

	@Test
	public void modeWithSeveralLevelsNeedsAWinCondition() {
		f.waves.getWinConditions().clear();
		f.schedule.setLoop(true);
		Level second = ModelFixture.level();
		second.setSpawning(ModelFixture.copyOf(f.schedule));
		f.waves.getLevels().add(second);
		assertCode(GamemodeConstraints.NEVER_ENDS);
	}

	@Test
	public void winConditionsMustBeReachableInEveryLevel() {
		// Clear is won after 20 pops, which its first level offers; a second level with a small
		// tumbleweed only offers 1
		EnemiesPopped popped = ModelFixture.F.createEnemiesPopped();
		popped.setCount(20);
		f.clear.getWinConditions().add(popped);
		Level small = ModelFixture.level();
		FixedLayout layout = ModelFixture.F.createFixedLayout();
		layout.getSpawns().add(ModelFixture.spawn(f.tumbleweed, 1, 1));
		small.setSpawning(layout);
		f.clear.getLevels().add(small);
		List<String> messages = messages(ModelFixture.validate(f.edition));
		assertEquals(1, messages.size(), messages.toString());
		assertTrue(messages.get(0).startsWith("In level 2, only 1 pops"), messages.toString());
	}

	@Test
	public void harmfulModesAreLostOnHealth() {
		f.clear.getLoseConditions().clear();
		TimeReached limit = ModelFixture.F.createTimeReached();
		limit.setSeconds(60);
		f.clear.getLoseConditions().add(limit);
		assertCode(GamemodeConstraints.HEALTH_NOT_DECISIVE);
	}

	@Test
	public void healthCanOnlyLose() {
		f.clear.getWinConditions().add(ModelFixture.F.createHealthDepleted());
		assertCode(GamemodeConstraints.WRONG_ROLE);
	}

	@Test
	public void everyEnemyOfAModeHasADropTable() {
		f.waves.getDrops().remove(f.tumbleweedDrops);
		assertCode(GamemodeConstraints.NO_DROP_TABLE);
	}

	@Test
	public void enemiesThatOnlyAppearAsFragmentsNeedADropTableToo() {
		// Clear then only spawns a Bomb, but the Bomb bursts into Tumbleweeds
		f.layout.getSpawns().remove(0);
		f.edition.getDrops().remove(f.tumbleweedDefault);
		assertCode(GamemodeConstraints.NO_DROP_TABLE);
	}

	@Test
	public void aModeWithoutAnyDropTableIsInvalid() {
		f.edition.getDrops().clear();
		assertCode(GamemodeConstraints.NO_DROP_TABLE);
	}

	@Test
	public void anEnemyHasOneDropTablePerList() {
		DropTable second = ModelFixture.dropTable(f.bomb, 5);
		second.getEntries().add(ModelFixture.drop(f.heart, 1));
		f.waves.getDrops().add(second);
		assertCode(GamemodeConstraints.DUPLICATE_DROP_TABLE);
	}

	@Test
	public void eachDifficultyTierIsDefinedOnce() {
		f.edition.getDifficulties().add(difficulty(DifficultyTier.HARD, ModifierTarget.ENEMY_SPEED, 1.3f));
		f.edition.getDifficulties().add(difficulty(DifficultyTier.EASY, ModifierTarget.ENEMY_SPEED, 0.8f));
		assertEquals(Diagnostic.OK, ModelFixture.validate(f.edition).getSeverity());
		f.edition.getDifficulties().add(difficulty(DifficultyTier.HARD, ModifierTarget.PLAYER_HEALTH, 0.5f));
		assertCode(GamemodeConstraints.DUPLICATE_DIFFICULTY);
	}

	@Test
	public void teleportersStayInTheirArena() {
		Teleporter here = ModelFixture.F.createTeleporter();
		here.setName("Here");
		Teleporter there = ModelFixture.F.createTeleporter();
		there.setName("There");
		here.setTarget(there);
		there.setTarget(here);
		ModelFixture.level(f.clear).getArena().getObstacles().add(here);
		ModelFixture.level(f.waves).getArena().getObstacles().add(there);
		assertCode(GamemodeConstraints.TELEPORTER_ELSEWHERE);
	}

	// ---------------------------------------------------------------- helpers

	private static Difficulty difficulty(DifficultyTier tier, ModifierTarget target, float factor) {
		Difficulty difficulty = ModelFixture.F.createDifficulty();
		difficulty.setTier(tier);
		Modifier modifier = ModelFixture.F.createModifier();
		modifier.setTarget(target);
		modifier.setFactor(factor);
		difficulty.getModifiers().add(modifier);
		return difficulty;
	}

	private void assertViolated(String constraint) {
		List<String> messages = messages(ModelFixture.validate(f.edition));
		assertEquals(1, messages.size(), messages.toString());
		assertTrue(messages.get(0).contains("'" + constraint + "'"), messages.toString());
	}

	private void assertCode(int code) {
		Diagnostic diagnostic = ModelFixture.validate(f.edition);
		List<Integer> codes = diagnostic.getChildren().stream().map(Diagnostic::getCode).toList();
		assertTrue(codes.contains(code), messages(diagnostic).toString());
		assertTrue(codes.stream().allMatch(c -> c == code), "only the broken rule fires: " + messages(diagnostic));
	}

	private static List<String> messages(Diagnostic diagnostic) {
		return diagnostic.getChildren().stream().map(Diagnostic::getMessage).toList();
	}
}
