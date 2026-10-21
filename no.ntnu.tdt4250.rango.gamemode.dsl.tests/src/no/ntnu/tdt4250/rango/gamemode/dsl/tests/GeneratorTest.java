package no.ntnu.tdt4250.rango.gamemode.dsl.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
				JAVA + "SurvivorMode.java", "assets/modes/TimeAttack.json", "assets/modes/PopFrenzy.json",
				"assets/modes/Survivor.json", "android/res/values/edition.xml"), paths);
	}

	@Test
	public void editionListsItsModesInOrder() {
		String edition = file(generate("arcade"), JAVA + "GeneratedEdition.java");
		assertTrue(edition.contains("TITLE = \"Rango Unchained: Arcade\""));
		assertTrue(edition.indexOf("new TimeAttackMode()") < edition.indexOf("new PopFrenzyMode()"));
		assertTrue(edition.indexOf("new PopFrenzyMode()") < edition.indexOf("new SurvivorMode()"));
	}

	@Test
	public void splitRulesBecomeFragments() {
		InMemoryFileSystemAccess files = generate("arcade");
		String timeAttack = file(files, JAVA + "TimeAttackMode.java");
		assertTrue(timeAttack.contains("context.split(enemy, \"Weed\", 4, 45.0f, 5.0f);"));
		assertTrue(timeAttack.contains("context.split(enemy, \"Weed\", 2, 45.0f, 7.0f);"));
		assertTrue(file(files, JAVA + "PopFrenzyMode.java").contains("// vanishes at once"));
		// a Bomb splits into a full ring of eight
		assertTrue(file(generate("survival"), JAVA + "EndlessMode.java")
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
		assertTrue(file(generate("survival"), JAVA + "EndlessMode.java").contains("return false; // endless"));
	}

	@Test
	public void wavesAndDropsBecomeSchedules() {
		String endless = file(generate("survival"), JAVA + "EndlessMode.java");
		assertTrue(endless.contains("int extra = cycle * 1;"));
		assertTrue(endless.contains("spawner.spawn(\"Tumbleweed\", 3, 2 + extra, 30.0f, 75.0f, RIGHT);"));
		assertTrue(endless.contains("public boolean loopsWaves() {\n        return true;"));
		assertTrue(endless.contains("arena.teleporter(\"West\", 6.0f, 20.0f, \"East\", true, false);"));
	}

	@Test
	public void eachEnemyRollsOnItsOwnDropTable() {
		InMemoryFileSystemAccess files = generate("survival");
		String endless = file(files, JAVA + "EndlessMode.java");
		// Endless Survival uses the edition's drop tables: a Bomb drops something at 40 %, a Shield half of the time
		String bomb = between(endless, "case \"Bomb\":", "break;");
		assertTrue(bomb.contains("if (context.random() * 100f < 40.0f) { // 40 % of Bomb pops drop something"), bomb);
		assertTrue(bomb.contains("context.dropPowerUp(\"Shield\", enemy); // 50 % of drops, 20 % of pops"), bomb);
		String tumbleweed = between(endless, "case \"Tumbleweed\":", "break;");
		assertTrue(tumbleweed.contains("if (context.random() * 100f < 10.0f) {"), tumbleweed);
		assertTrue(tumbleweed.contains("context.dropPowerUp(\"Health\", enemy);"), tumbleweed);
		// Wave Rush has drop tables of its own, which replace the edition's
		String armadillo = between(file(files, JAVA + "WaveRushMode.java"), "case \"Armadillo\":", "break;");
		assertTrue(armadillo.contains("if (context.random() * 100f < 20.0f) {"), armadillo);
		assertTrue(armadillo.contains("context.dropPowerUp(\"Health\", enemy); // 75 % of drops, 15 % of pops"), armadillo);
	}

	/** The part of onEnemyPopped from the first occurrence of start to the next occurrence of end. */
	private static String between(String text, String start, String end) {
		int from = text.indexOf(start, text.indexOf("onEnemyPopped"));
		assertTrue(from >= 0, "no " + start);
		return text.substring(from, text.indexOf(end, from));
	}

	@Test
	public void arenasUseTheLevelFormat() {
		InMemoryFileSystemAccess files = generate("arcade");
		String popFrenzy = file(files, "assets/modes/PopFrenzy.json");
		// six bubbles spread out around 50 %, then the two tumbleweeds of the layout
		assertEquals(8, popFrenzy.split("\"type\": \"Enemy\"").length - 1);
		assertTrue(popFrenzy.contains("\"subType\": \"Floor\", \"material\": \"Rubber\""));
		assertTrue(popFrenzy.contains("\"health\": 6"));
		String survivor = file(files, "assets/modes/Survivor.json");
		assertTrue(survivor.contains("{ \"name\": \"Pillar\", \"dimension\": { \"x\": 50.0, \"y\": 20.0, \"width\": 40, \"height\": 160, \"relative\": true }"));
		assertTrue(file(files, "android/res/values/edition.xml").contains("Rango Unchained: Arcade"));
	}
}
