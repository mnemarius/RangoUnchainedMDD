package no.ntnu.tdt4250.rango.gamemode.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import no.ntnu.tdt4250.rango.gamemode.Fragmenting;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;

/** The derived features of the metamodel, on the fixture edition. */
public class DerivedFeaturesTest {

	private final ModelFixture f = new ModelFixture();

	@Test
	public void resultTypeDefaultsToTheOwningType() {
		assertSame(f.tumbleweed, ((Fragmenting) f.tumbleweed.getSplitRule()).getResultType());
		assertSame(f.tumbleweed, ((Fragmenting) f.bomb.getSplitRule()).getResultType());
		assertEquals(List.of(f.tumbleweed), f.bomb.getProducedTypes());
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
		assertEquals(List.of(f.shield, f.heart), f.waves.getPowerUps());
		assertTrue(f.clear.getPowerUps().isEmpty());
	}

	@Test
	public void endConditionsKnowTheirRole() {
		assertTrue(f.clear.getWinConditions().get(0).isWin());
		assertFalse(f.clear.getLoseConditions().get(0).isWin());
	}
}
