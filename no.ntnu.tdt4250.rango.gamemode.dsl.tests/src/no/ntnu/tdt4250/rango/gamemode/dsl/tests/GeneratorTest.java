package no.ntnu.tdt4250.rango.gamemode.dsl.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * What the generator makes of the example editions: which files, and that the rules of the model end
 * up in them.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(RangoModeInjectorProvider.class)
public class GeneratorTest {

	private static final String JAVA = "core/src/generated/java/io/github/RangoUnchained/Modes/Generated/";

	@Inject
	private Provider<ResourceSet> resourceSets;

	@Inject
	private IGenerator2 generator;

	private InMemoryFileSystemAccess generate(String edition) {
		Resource resource = resourceSets.get().getResource(
				URI.createFileURI(new File(ExamplesTest.EXAMPLES, edition + ".rango").getAbsolutePath()), true);
		InMemoryFileSystemAccess files = new InMemoryFileSystemAccess();
		generator.doGenerate(resource, files, new GeneratorContext());
		return files;
	}

	private static String file(InMemoryFileSystemAccess files, String path) {
		CharSequence content = files.getTextFiles().get(IFileSystemAccess.DEFAULT_OUTPUT + path);
		assertTrue(content != null, "not generated: " + path + " in " + files.getTextFiles().keySet());
		// the templates use the line separator of the platform
		return content.toString().replace("\r\n", "\n");
	}

	@Test
	public void generatesTheFilesOfAnEdition() {
		Set<String> paths = new TreeSet<>();
		generate("arcade").getTextFiles().keySet().forEach(path -> paths.add(path.substring(IFileSystemAccess.DEFAULT_OUTPUT.length())));
		assertEquals(Set.of(JAVA + "GeneratedEdition.java", JAVA + "TimeAttackMode.java", JAVA + "PopFrenzyMode.java",
				JAVA + "SurvivorMode.java", JAVA + "WaveRushMode.java", JAVA + "MinefieldMode.java",
				"assets/modes/TimeAttack-1.json", "assets/modes/PopFrenzy-1.json", "assets/modes/Survivor-1.json",
				"assets/modes/WaveRush-1.json", "assets/modes/Minefield-1.json", "android/res/values/edition.xml"), paths);
	}

	@Test
	public void editionListsItsModesInOrder() {
		String edition = file(generate("arcade"), JAVA + "GeneratedEdition.java");
		assertTrue(edition.contains("TITLE = \"Rango Unchained: Arcade\""));
		assertTrue(edition.indexOf("new TimeAttackMode()") < edition.indexOf("new PopFrenzyMode()"));
		assertTrue(edition.indexOf("new PopFrenzyMode()") < edition.indexOf("new SurvivorMode()"));
	}

	@Test
	public void editionListsItsDifficultiesFromEasyToHard() {
		String edition = file(generate("arcade"), JAVA + "GeneratedEdition.java");
		assertTrue(edition.indexOf("new Difficulty(\"easy\", \"Easy\")") < edition.indexOf("new Difficulty(\"medium\", \"Medium\")"));
		assertTrue(edition.indexOf("new Difficulty(\"medium\", \"Medium\")") < edition.indexOf("new Difficulty(\"hard\", \"Hard\")"));
		String hard = edition.substring(edition.indexOf("new Difficulty(\"hard\""));
		assertTrue(hard.contains(".with(Difficulty.ENEMY_SPEED, 1.3f)"), hard);
		assertTrue(hard.contains(".with(Difficulty.PLAYER_HEALTH, 0.5f)"), hard);
		// an edition without difficulties plays its modes as modelled
		String hardcore = file(generate("hardcore"), JAVA + "GeneratedEdition.java");
		assertTrue(hardcore.contains("Arrays.<Difficulty>asList(\n        );"), hardcore);
	}

	@Test
	public void splitRulesBecomeFragments() {
		InMemoryFileSystemAccess files = generate("arcade");
		String timeAttack = file(files, JAVA + "TimeAttackMode.java");
		assertTrue(timeAttack.contains("context.split(enemy, \"Weed\", 4, 45.0f, 5.0f);"));
		assertTrue(timeAttack.contains("context.split(enemy, \"Weed\", 2, 45.0f, 7.0f);"));
		assertTrue(file(files, JAVA + "PopFrenzyMode.java").contains("// vanishes at once"));
		// a Bomb splits into a full ring of eight
		assertTrue(file(generate("classic"), JAVA + "EndlessMode.java")
				.contains("context.split(enemy, \"Tumbleweed\", 8, 45.0f, 6.0f);"));
	}

	@Test
	public void scoringAndEffectsFollowTheModel() {
		InMemoryFileSystemAccess files = generate("arcade");
		String timeAttack = file(files, JAVA + "TimeAttackMode.java");
		assertTrue(timeAttack.contains("context.addScore(30 * context.speedBonus(2.0f, 60.0f));"));
		assertTrue(timeAttack.contains("context.changeSpeed(2.0f, 6.0f, \"Powerup/Speed.png\");"));
		assertTrue(timeAttack.contains("context.shield(6.0f, \"Powerup/Speed.png\");"));
		String popFrenzy = file(files, JAVA + "PopFrenzyMode.java");
		assertTrue(popFrenzy.contains("context.addScore(5);"));
		assertTrue(popFrenzy.contains("context.changeSpeed(0.6f, 3.0f, \"Enemy/Small enemy.png\");"));
	}

	@Test
	public void endConditionsBecomeChecks() {
		InMemoryFileSystemAccess files = generate("arcade");
		assertTrue(file(files, JAVA + "TimeAttackMode.java").contains("return stats.score() >= 1500;"));
		String popFrenzy = file(files, JAVA + "PopFrenzyMode.java");
		assertTrue(popFrenzy.contains("return stats.popped() >= 20\n            || stats.cleared();"));
		assertTrue(popFrenzy.contains("return stats.playerHealth() <= 0\n            || stats.elapsed() >= 120.0f;"));
		assertTrue(file(generate("classic"), JAVA + "EndlessMode.java").contains("return false; // endless"));
	}

	@Test
	public void wavesAndDropsBecomeSchedules() {
		String endless = file(generate("classic"), JAVA + "EndlessMode.java");
		assertTrue(endless.contains("int extra = cycle * 1;"));
		assertTrue(endless.contains("spawner.spawn(\"Tumbleweed\", 3, 2 + extra, 30.0f, 75.0f, RIGHT);"));
		assertTrue(endless.contains("public boolean loopsWaves(int level) {\n        switch (level) {\n            case 0:\n                return true;"), endless);
		assertTrue(endless.contains("arena.teleporter(\"West\", 6.0f, 20.0f, \"East\", true, false);"));
	}

	@Test
	public void eachEnemyRollsOnItsOwnDropTable() {
		String endless = file(generate("classic"), JAVA + "EndlessMode.java");
		// Endless uses the edition's drop tables: a Bomb drops something at 40 %, a Shield half of the time
		String bomb = between(endless, "case \"Bomb\":", "break;");
		assertTrue(bomb.contains("if (context.chance(40.0f)) { // 40 % of Bomb pops drop something"), bomb);
		assertTrue(bomb.contains("context.dropPowerUp(\"Shield\", enemy); // 50 % of drops, 20 % of pops"), bomb);
		String tumbleweed = between(endless, "case \"Tumbleweed\":", "break;");
		assertTrue(tumbleweed.contains("if (context.chance(10.0f)) {"), tumbleweed);
		assertTrue(tumbleweed.contains("context.dropPowerUp(\"Health\", enemy);"), tumbleweed);
		// Wave Rush has drop tables of its own, which replace the edition's
		String weed = between(file(generate("arcade"), JAVA + "WaveRushMode.java"), "case \"Weed\":", "break;");
		assertTrue(weed.contains("if (context.chance(20.0f)) {"), weed);
		assertTrue(weed.contains("context.dropPowerUp(\"Heart\", enemy); // 75 % of drops, 15 % of pops"), weed);
	}

	/** The part of onEnemyPopped from the first occurrence of start to the next occurrence of end. */
	private static String between(String text, String start, String end) {
		int from = text.indexOf(start, text.indexOf("onEnemyPopped"));
		assertTrue(from >= 0, "no " + start);
		return text.substring(from, text.indexOf(end, from));
	}

	@Test
	public void eachLevelGetsItsArenaAndSpawning() {
		InMemoryFileSystemAccess files = generate("classic");
		String campaign = file(files, JAVA + "CampaignMode.java");
		assertTrue(campaign.contains("public int levelCount() {\n        return 5;"), campaign);
		assertTrue(campaign.contains("case 1:\n                return \"Cactus Garden\";"), campaign);
		assertTrue(campaign.contains("case 4:\n                return \"modes/Campaign-5.json\";"), campaign);
		assertTrue(campaign.contains("private void spawnWaveOfLevel5(int wave, int cycle, Spawner spawner) {"), campaign);
		for (int level = 1; level <= 5; level++) {
			file(files, "assets/modes/Campaign-" + level + ".json");
		}
		assertTrue(placeEnemies(campaign).contains("case 1:\n                spawner.spawn(\"Cactus\", "), campaign);
		assertTrue(file(files, "assets/modes/Campaign-3.json").contains("{ \"name\": \"Mesa\""));
	}

	@Test
	public void arenasUseTheLevelFormat() {
		InMemoryFileSystemAccess files = generate("arcade");
		String popFrenzy = file(files, "assets/modes/PopFrenzy-1.json");
		assertTrue(popFrenzy.contains("{ \"name\": \"ObsticleFloor\", \"dimension\": {}, \"typeInfo\": { \"type\": \"Obsticle\", \"subType\": \"Floor\" } }"));
		// the game's spawner places the enemies, and the player's health comes from the mode's player profile
		assertFalse(popFrenzy.contains("\"type\": \"Enemy\""), popFrenzy);
		assertFalse(popFrenzy.contains("\"health\""), popFrenzy);
		String survivor = file(files, "assets/modes/Survivor-1.json");
		assertTrue(survivor.contains("{ \"name\": \"Pillar\", \"dimension\": { \"x\": 50.0, \"y\": 20.0, \"width\": 40, \"height\": 160, \"relative\": true }"));
		assertTrue(file(files, "android/res/values/edition.xml").contains("Rango Unchained: Arcade"));
	}

	@Test
	public void enemiesMoveAtTheSpeedOfTheirType() {
		InMemoryFileSystemAccess files = generate("arcade");
		// the speed reaches the game through the enemy kind, which the difficulty scales
		String minefield = file(files, JAVA + "MinefieldMode.java");
		assertTrue(minefield.contains("ENEMY_WEED = new EnemyKind(\"Weed\", \"Enemy/Plant.png\",\n        0.9f, 1.0f, 6.0f);"), minefield);
		assertTrue(minefield.contains("ENEMY_MINE = new EnemyKind(\"Mine\", \"Enemy/Bomb.png\",\n        1.0f, 1.0f, 5.0f);"), minefield);
		// so a spawn only gives the direction
		String placed = placeEnemies(minefield);
		assertTrue(placed.contains("spawner.spawn(\"Mine\", 2, 1, 25.0f, 70.0f, RIGHT);"), placed);
		assertTrue(placed.contains("spawner.spawn(\"Mine\", 2, 1, 75.0f, 70.0f, LEFT);"), placed);
	}

	@Test
	public void fixedLayoutsAreSpawnedAtTheStart() {
		String placed = placeEnemies(file(generate("arcade"), JAVA + "PopFrenzyMode.java"));
		// six bubbles in one spawn, which the game spreads out around 50 %
		assertTrue(placed.contains("spawner.spawn(\"Bubble\", 3, 6, 50.0f, 85.0f, "), placed);
		assertTrue(placed.contains("spawner.spawn(\"Tumbleweed\", 3, 1, 15.0f, 60.0f, RIGHT);"), placed);
		// a wave schedule spawns nothing at the start
		String endless = placeEnemies(file(generate("classic"), JAVA + "EndlessMode.java"));
		assertFalse(endless.contains("spawner.spawn"), endless);
	}

	/** The body of placeEnemies. */
	private static String placeEnemies(String mode) {
		int from = mode.indexOf("public void placeEnemies");
		assertTrue(from >= 0, "no placeEnemies");
		return mode.substring(from, mode.indexOf("@Override", from));
	}
}
