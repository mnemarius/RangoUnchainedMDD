package no.ntnu.tdt4250.rango.gamemode.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;

/** The derived features of the metamodel, on the fixture edition. */
public class DerivedFeaturesTest {

	private final ModelFixture f = new ModelFixture();

	@Test
	public void resultTypeDefaultsToTheOwningType() {
		assertSame(f.tumbleweed, ((Split) f.tumbleweed.getSplitRule()).getResultType());
		assertSame(f.tumbleweed, ((Split) f.bomb.getSplitRule()).getResultType());
		assertEquals(List.of(f.tumbleweed), f.bomb.getProducedTypes());
	}

	@Test
	public void spacingClosesIntoARingAtEight() {
		Split rule = (Split) f.bomb.getSplitRule();
		// up to a full ring, fragments leave 45 degrees apart: two fan out, eight go all the way round
		for (int fragments : new int[] { 1, 2, 4, 8 }) {
			rule.setFragments(fragments);
			assertEquals(45f, rule.getSpacing(), 1e-4f);
		}
		// more fragments close the gaps evenly
		rule.setFragments(9);
		assertEquals(40f, rule.getSpacing(), 1e-4f);
		rule.setFragments(12);
		assertEquals(30f, rule.getSpacing(), 1e-4f);
	}

	@Test
	public void enemyTypesAreTheSpawnedTypesAndWhatTheyProduce() {
		assertEquals(List.of(f.tumbleweed, f.bomb), f.clear.getEnemyTypes());
		// only a Bomb is spawned, but it splits into Tumbleweeds; the edition's order is kept
		f.layout.getSpawns().remove(0);
		assertEquals(List.of(f.tumbleweed, f.bomb), f.clear.getEnemyTypes());
		// a Tumbleweed only splits into Tumbleweeds
		f.layout.getSpawns().set(0, ModelFixture.spawn(f.tumbleweed, 3, 1));
		assertEquals(List.of(f.tumbleweed), f.clear.getEnemyTypes());
	}

	@Test
	public void enemyTypesFollowCyclesOnce() {
		((Split) f.tumbleweed.getSplitRule()).setFragmentType(f.bomb);
		f.layout.getSpawns().remove(1);
		assertEquals(List.of(f.tumbleweed, f.bomb), f.clear.getEnemyTypes());
	}

	@Test
	public void popsToClearFollowFragmentsAcrossTypes() {
		// a large Tumbleweed: 1 + 2 * (1 + 2 * 1) = 7
		assertEquals(7, f.layout.getSpawns().get(0).getPopsToClear());
		// a large Bomb: 1 + 4 medium Tumbleweeds of 1 + 2 * 1 = 13
		assertEquals(13, f.layout.getSpawns().get(1).getPopsToClear());
		assertEquals(20, f.layout.getPopsToClear());
		assertEquals(20, f.clear.getPopsToClear());
	}

	@Test
	public void wavesAreNumberedAndCounted() {
		assertEquals(1, f.schedule.getWaves().get(0).getNumber());
		assertEquals(2, f.schedule.getWaves().get(1).getNumber());
		// wave 2: two medium Bombs, each 1 + 4 small Tumbleweeds = 5
		assertEquals(10, f.schedule.getWaves().get(1).getPopsToClear());
		assertEquals(17, f.waves.getPopsToClear());
	}

	@Test
	public void loopingWavesNeverRunOut() {
		f.schedule.setLoop(true);
		assertEquals(GamemodeDerivations.UNBOUNDED, f.waves.getPopsToClear());
		assertEquals(GamemodeDerivations.UNBOUNDED, f.waves.getMaxScore());
	}

	@Test
	public void maxScoreAddsThePointsOfEveryPop() {
		// Tumbleweed large: 10 + 2 * (10 + 2 * 10) = 70; Bomb large: 25 + 4 * (10 + 2 * 10) = 145
		assertEquals(215, f.clear.getMaxScore());
	}

	@Test
	public void dropProbabilitiesShareTheChanceByWeight() {
		assertEquals(4, f.drops.getTotalWeight());
		assertEquals(15f, f.drops.getEntries().get(0).getProbability(), 1e-4);
		assertEquals(5f, f.drops.getEntries().get(1).getProbability(), 1e-4);
		assertEquals(75f, f.drops.getEntries().get(0).getShare(), 1e-4);
		assertEquals(25f, f.drops.getEntries().get(1).getShare(), 1e-4);
		assertEquals(List.of(f.shield, f.heart), f.waves.getPowerUps());
		assertEquals(List.of(f.heart), f.clear.getPowerUps());
	}

	@Test
	public void theDropTablesOfAModeReplaceThoseOfTheEdition() {
		assertEquals(List.of(f.drops, f.tumbleweedDrops), f.waves.getEffectiveDrops());
		assertEquals(List.of(f.tumbleweedDefault, f.bombDefault), f.clear.getEffectiveDrops());
		assertSame(f.bombDefault, GamemodeDerivations.dropTableFor(f.clear, f.bomb));
		assertSame(f.drops, GamemodeDerivations.dropTableFor(f.waves, f.bomb));
		// without tables of its own, a mode falls back to the edition's
		f.waves.getDrops().clear();
		assertEquals(List.of(f.tumbleweedDefault, f.bombDefault), f.waves.getEffectiveDrops());
	}

	@Test
	public void endConditionsKnowTheirRole() {
		assertTrue(f.clear.getWinConditions().get(0).isWin());
		assertFalse(f.clear.getLoseConditions().get(0).isWin());
	}
}
