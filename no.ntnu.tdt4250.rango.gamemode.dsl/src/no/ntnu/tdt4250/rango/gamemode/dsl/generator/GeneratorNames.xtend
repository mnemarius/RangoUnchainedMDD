package no.ntnu.tdt4250.rango.gamemode.dsl.generator

import java.util.List
import java.util.Set
import no.ntnu.tdt4250.rango.gamemode.BallSpawn
import no.ntnu.tdt4250.rango.gamemode.Block
import no.ntnu.tdt4250.rango.gamemode.DropTable
import no.ntnu.tdt4250.rango.gamemode.Edition
import no.ntnu.tdt4250.rango.gamemode.GameMode
import no.ntnu.tdt4250.rango.gamemode.Material
import no.ntnu.tdt4250.rango.gamemode.NamedElement
import no.ntnu.tdt4250.rango.gamemode.Target
import no.ntnu.tdt4250.rango.gamemode.Wave
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule
import org.eclipse.xtext.util.Strings

/**
 * What the templates of the generator share: where the generated files go in the game, and how model
 * values are written as Java, JSON and XML.
 */
class GeneratorNames {

	/** The source folder of the game's core module that receives the generated Java code. */
	public static val JAVA_FOLDER = 'core/src/generated/java/'

	/** The package of the generated Java code. */
	public static val PACKAGE = 'io.github.RangoUnchained.Modes.Generated'

	/** The folder of the game's assets that receives the arena resources. */
	public static val ARENA_FOLDER = 'assets/modes/'

	/** The Android resource file that receives the product name. */
	public static val ANDROID_VALUES = 'android/res/values/edition.xml'

	def static className(GameMode mode) {
		mode.name.toFirstUpper + 'Mode'
	}

	def static javaFile(String className) {
		JAVA_FOLDER + PACKAGE.replace('.', '/') + '/' + className + '.java'
	}

	/** The arena resource of a mode as the game loads it, relative to the assets folder. */
	def static arenaResource(GameMode mode) {
		'modes/' + mode.name + '.json'
	}

	def static arenaFile(GameMode mode) {
		'assets/' + mode.arenaResource
	}

	/** A Java constant name for a ball type: PricklyPear becomes BALL_PRICKLY_PEAR. */
	def static constant(NamedElement element) {
		'BALL_' + element.name.replaceAll('([a-z0-9])([A-Z])', '$1_$2').toUpperCase
	}

	def static title(Edition edition) {
		edition.title ?: edition.name
	}

	def static javaString(String value) {
		'"' + Strings.convertToJavaString(value ?: '') + '"'
	}

	def static javaFloat(float value) {
		Float.toString(value) + 'f'
	}

	def static jsonFloat(float value) {
		Float.toString(value)
	}

	/** Text that can go into a Java comment. */
	def static comment(String value) {
		(value ?: '').replace('*/', '* /')
	}

	/** Text that can go into an Android string resource. */
	def static xmlText(String value) {
		(value ?: '').replace('&', '&amp;').replace('<', '&lt;').replace('>', '&gt;').replace("'", "\\'").replace('"', '\\"')
	}

	def static balls(Target target) {
		target == Target.ALL || target == Target.BALLS
	}

	def static player(Target target) {
		target == Target.ALL || target == Target.PLAYER
	}

	/** The waves of a mode; none if its balls are all placed at the start. */
	def static List<Wave> waves(GameMode mode) {
		val spawning = mode.spawning
		if (spawning instanceof WaveSchedule) spawning.waves else #[]
	}

	/** The materials a mode's arena is built from: its floor, its walls and its blocks. */
	def static Set<Material> materials(GameMode mode) {
		val arena = mode.arena
		val surfaces = #[arena.floor, arena.walls] + arena.obstacles.filter(Block).map[material]
		surfaces.filterNull.toSet
	}

	/**
	 * The horizontal positions of the balls of a spawn: spread out sideways around the spawn position,
	 * the same way the game's spawner spreads out the balls of a wave.
	 */
	def static List<Float> spreadX(BallSpawn spawn) {
		(0 ..< Math.max(spawn.count, 0)).map[i|Math.max(3f, Math.min(97f, spawn.x + (i - (spawn.count - 1) / 2f) * 8f))].toList
	}

	/** A percentage for a comment, with at most one decimal: 12.5, 20, 6.7. */
	def static String percent(float value) {
		val rounded = Math.round(value * 10) / 10.0
		if (rounded == Math.rint(rounded)) String.valueOf(rounded as int) else String.valueOf(rounded)
	}

	/** The upper end of the roll that drops the entry at the given index of a drop table. */
	def static int threshold(DropTable table, int index) {
		table.entries.take(index + 1).fold(0)[sum, entry|sum + entry.weight]
	}
}
