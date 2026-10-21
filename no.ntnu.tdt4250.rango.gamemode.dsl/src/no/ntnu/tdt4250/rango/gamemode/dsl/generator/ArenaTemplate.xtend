package no.ntnu.tdt4250.rango.gamemode.dsl.generator

import java.util.List
import no.ntnu.tdt4250.rango.gamemode.EnemySpawn
import no.ntnu.tdt4250.rango.gamemode.Block
import no.ntnu.tdt4250.rango.gamemode.Direction
import no.ntnu.tdt4250.rango.gamemode.FixedLayout
import no.ntnu.tdt4250.rango.gamemode.Level
import no.ntnu.tdt4250.rango.gamemode.Material

import static extension no.ntnu.tdt4250.rango.gamemode.dsl.generator.GeneratorNames.*

/**
 * Generates the arena resource of a level of a game mode, in the JSON level format that the game's level loader
 * already reads: the background, the player, the walls, floor and roof with their materials, the
 * blocks, and the enemies of a fixed layout. Positions are written relative to the arena and converted
 * to pixels by the game when the arena is loaded. Triggers (jump pads, teleporters) need behaviour
 * that the level format cannot express; they are built by the generated mode class instead.
 */
class ArenaTemplate {

	/** The texture of blocks whose material has none. */
	public static val DEFAULT_BLOCK_SPRITE = 'Obstacles/Stone.png'

	def generate(Level level) '''
		{
		  "metaData": {
		    "levelnr": -1,
		    "theme": «level.arena.background.javaString»
		  },
		  "entitiesData": [
		    «FOR entity : level.entities SEPARATOR ','»
		    «entity»
		    «ENDFOR»
		  ]
		}
	'''

	def List<CharSequence> entities(Level level) {
		val mode = level.mode
		val arena = level.arena
		val entities = <CharSequence>newArrayList
		entities += '''{ "name": "Background", "dimension": {}, "typeInfo": { "type": "Background", "subType": «arena.background.javaString» } }'''
		entities += '''{ "name": «('Player-' + mode.player.name).javaString», "health": «mode.player.health», "dimension": { "x": «arena.playerStart.jsonFloat», "y": 0.0, "relative": true }, "typeInfo": { "type": "Player", "subType": «mode.player.character.javaString» } }'''
		for (side : #['Left', 'Right', 'Roof']) {
			entities += wall(side, arena.walls)
		}
		entities += wall('Floor', arena.floor)
		for (block : arena.obstacles.filter(Block)) {
			entities += block(block)
		}
		val spawning = level.spawning
		if (spawning instanceof FixedLayout) {
			for (spawn : spawning.spawns) {
				for (x : spawn.spreadX) {
					entities += enemy(spawn, x)
				}
			}
		}
		entities
	}

	def wall(String side, Material material) '''{ "name": "Obsticle«side»", "dimension": {}, "typeInfo": { "type": "Obsticle", "subType": "«side»"«material.materialFields» } }'''

	def block(Block block) '''{ "name": «block.name.javaString», "dimension": { "x": «block.x.jsonFloat», "y": «block.y.jsonFloat», "width": «block.width», "height": «block.height», "relative": true }, "typeInfo": { "type": "Obsticle", "subType": "Block"«block.material.materialFields»«IF block.material?.sprite === null», "sprite": «DEFAULT_BLOCK_SPRITE.javaString»«ENDIF» } }'''

	def enemy(EnemySpawn spawn, float x) '''{ "name": «('Enemy ' + spawn.type.name).javaString», "dimension": { "x": «x.jsonFloat», "y": «spawn.y.jsonFloat», "relative": true }, "velocity": { "x": «IF spawn.direction == Direction.LEFT»-2.0«ELSE»2.0«ENDIF», "y": 0.0 }, "typeInfo": { "type": "Enemy", "subType": «spawn.type.name.javaString», "size": «spawn.size» } }'''

	def materialFields(Material material) '''«IF material !== null», "material": «material.name.javaString»«IF material.sprite !== null», "sprite": «material.sprite.javaString»«ENDIF»«ENDIF»'''
}
