package no.ntnu.tdt4250.rango.gamemode.dsl.generator

import java.util.List
import no.ntnu.tdt4250.rango.gamemode.Block
import no.ntnu.tdt4250.rango.gamemode.Level

import static extension no.ntnu.tdt4250.rango.gamemode.dsl.generator.GeneratorNames.*

/**
 * Generates the arena resource of a level of a game mode, in the JSON level format that the game's level loader
 * already reads: the background, the player, the walls, floor and roof, and the blocks. Positions are written
 * relative to the arena and converted to pixels by the game when the arena is loaded. Triggers (jump pads,
 * teleporters) need behaviour that the level format cannot express, and enemies are spread out and given their
 * speed by the game's spawner; both are left to the generated mode class.
 */
class ArenaTemplate {

	/** The texture of blocks. */
	public static val BLOCK_SPRITE = 'Obstacles/Stone.png'

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
		entities += '''{ "name": «('Player-' + mode.player.name).javaString», "dimension": { "x": «arena.playerStart.jsonFloat», "y": 0.0, "relative": true }, "typeInfo": { "type": "Player", "subType": «mode.player.character.javaString» } }'''
		for (side : #['Left', 'Right', 'Roof', 'Floor']) {
			entities += wall(side)
		}
		for (block : arena.obstacles.filter(Block)) {
			entities += block(block)
		}
		entities
	}

	def wall(String side) '''{ "name": "Obsticle«side»", "dimension": {}, "typeInfo": { "type": "Obsticle", "subType": "«side»" } }'''

	def block(Block block) '''{ "name": «block.name.javaString», "dimension": { "x": «block.x.jsonFloat», "y": «block.y.jsonFloat», "width": «block.width», "height": «block.height», "relative": true }, "typeInfo": { "type": "Obsticle", "subType": "Block", "sprite": «BLOCK_SPRITE.javaString» } }'''
}
