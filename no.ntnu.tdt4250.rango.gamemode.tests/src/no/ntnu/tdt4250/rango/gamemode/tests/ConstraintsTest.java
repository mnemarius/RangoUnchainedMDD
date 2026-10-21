package no.ntnu.tdt4250.rango.gamemode.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.junit.jupiter.api.Test;

import no.ntnu.tdt4250.rango.gamemode.EnemiesAlive;
import no.ntnu.tdt4250.rango.gamemode.EnemiesPopped;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Poison;
import no.ntnu.tdt4250.rango.gamemode.ScoreReached;
import no.ntnu.tdt4250.rango.gamemode.SpeedBonus;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.TimeReached;
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
		f.clear.getArena().getObstacles().add(teleporter);
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
	public void aEnemyHasOneDropTablePerList() {
		DropTable second = ModelFixture.dropTable(f.bomb, 5);
		second.getEntries().add(ModelFixture.drop(f.heart, 1));
		f.waves.getDrops().add(second);
		assertCode(GamemodeConstraints.DUPLICATE_DROP_TABLE);
	}

	@Test
	public void teleportersStayInTheirArena() {
		Teleporter here = ModelFixture.F.createTeleporter();
		here.setName("Here");
		Teleporter there = ModelFixture.F.createTeleporter();
		there.setName("There");
		here.setTarget(there);
		there.setTarget(here);
		f.clear.getArena().getObstacles().add(here);
		f.waves.getArena().getObstacles().add(there);
		assertCode(GamemodeConstraints.TELEPORTER_ELSEWHERE);
	}

	// ---------------------------------------------------------------- helpers

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
