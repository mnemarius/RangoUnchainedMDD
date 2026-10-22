package no.ntnu.tdt4250.rango.gamemode.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.Block;
import no.ntnu.tdt4250.rango.gamemode.Direction;
import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Generates the arena resource of a level of a game mode, in the JSON level format that the game's level loader
 * already reads: the background, the player, the walls, floor and roof, the blocks, and the enemies
 * of a fixed layout. Positions are written relative to the arena and converted
 * to pixels by the game when the arena is loaded. Triggers (jump pads, teleporters) need behaviour
 * that the level format cannot express; they are built by the generated mode class instead.
 */
@SuppressWarnings("all")
public class ArenaTemplate {
  /**
   * The texture of blocks.
   */
  public static final String BLOCK_SPRITE = "Obstacles/Stone.png";

  public CharSequence generate(final Level level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"metaData\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"levelnr\": -1,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"theme\": ");
    String _javaString = GeneratorNames.javaString(level.getArena().getBackground());
    _builder.append(_javaString, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"entitiesData\": [");
    _builder.newLine();
    {
      List<CharSequence> _entities = this.entities(level);
      boolean _hasElements = false;
      for(final CharSequence entity : _entities) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append(entity, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public List<CharSequence> entities(final Level level) {
    ArrayList<CharSequence> _xblockexpression = null;
    {
      final GameMode mode = GeneratorNames.mode(level);
      final Arena arena = level.getArena();
      final ArrayList<CharSequence> entities = CollectionLiterals.<CharSequence>newArrayList();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{ \"name\": \"Background\", \"dimension\": {}, \"typeInfo\": { \"type\": \"Background\", \"subType\": ");
      String _javaString = GeneratorNames.javaString(arena.getBackground());
      _builder.append(_javaString);
      _builder.append(" } }");
      entities.add(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{ \"name\": ");
      String _name = mode.getPlayer().getName();
      String _javaString_1 = GeneratorNames.javaString(("Player-" + _name));
      _builder_1.append(_javaString_1);
      _builder_1.append(", \"health\": ");
      int _health = mode.getPlayer().getHealth();
      _builder_1.append(_health);
      _builder_1.append(", \"dimension\": { \"x\": ");
      String _jsonFloat = GeneratorNames.jsonFloat(arena.getPlayerStart());
      _builder_1.append(_jsonFloat);
      _builder_1.append(", \"y\": 0.0, \"relative\": true }, \"typeInfo\": { \"type\": \"Player\", \"subType\": ");
      String _javaString_2 = GeneratorNames.javaString(mode.getPlayer().getCharacter());
      _builder_1.append(_javaString_2);
      _builder_1.append(" } }");
      entities.add(_builder_1.toString());
      for (final String side : Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Left", "Right", "Roof", "Floor"))) {
        CharSequence _wall = this.wall(side);
        entities.add(_wall);
      }
      Iterable<Block> _filter = Iterables.<Block>filter(arena.getObstacles(), Block.class);
      for (final Block block : _filter) {
        CharSequence _block = this.block(block);
        entities.add(_block);
      }
      final SpawnStrategy spawning = level.getSpawning();
      if ((spawning instanceof FixedLayout)) {
        EList<EnemySpawn> _spawns = ((FixedLayout)spawning).getSpawns();
        for (final EnemySpawn spawn : _spawns) {
          List<Float> _spreadX = GeneratorNames.spreadX(spawn);
          for (final Float x : _spreadX) {
            CharSequence _enemy = this.enemy(spawn, (x).floatValue());
            entities.add(_enemy);
          }
        }
      }
      _xblockexpression = entities;
    }
    return _xblockexpression;
  }

  public CharSequence wall(final String side) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"name\": \"Obsticle");
    _builder.append(side);
    _builder.append("\", \"dimension\": {}, \"typeInfo\": { \"type\": \"Obsticle\", \"subType\": \"");
    _builder.append(side);
    _builder.append("\" } }");
    return _builder;
  }

  public CharSequence block(final Block block) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"name\": ");
    String _javaString = GeneratorNames.javaString(block.getName());
    _builder.append(_javaString);
    _builder.append(", \"dimension\": { \"x\": ");
    String _jsonFloat = GeneratorNames.jsonFloat(block.getX());
    _builder.append(_jsonFloat);
    _builder.append(", \"y\": ");
    String _jsonFloat_1 = GeneratorNames.jsonFloat(block.getY());
    _builder.append(_jsonFloat_1);
    _builder.append(", \"width\": ");
    int _width = block.getWidth();
    _builder.append(_width);
    _builder.append(", \"height\": ");
    int _height = block.getHeight();
    _builder.append(_height);
    _builder.append(", \"relative\": true }, \"typeInfo\": { \"type\": \"Obsticle\", \"subType\": \"Block\", \"sprite\": ");
    String _javaString_1 = GeneratorNames.javaString(ArenaTemplate.BLOCK_SPRITE);
    _builder.append(_javaString_1);
    _builder.append(" } }");
    return _builder;
  }

  public CharSequence enemy(final EnemySpawn spawn, final float x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"name\": ");
    String _name = spawn.getType().getName();
    String _javaString = GeneratorNames.javaString(("Enemy " + _name));
    _builder.append(_javaString);
    _builder.append(", \"dimension\": { \"x\": ");
    String _jsonFloat = GeneratorNames.jsonFloat(x);
    _builder.append(_jsonFloat);
    _builder.append(", \"y\": ");
    String _jsonFloat_1 = GeneratorNames.jsonFloat(spawn.getY());
    _builder.append(_jsonFloat_1);
    _builder.append(", \"relative\": true }, \"velocity\": { \"x\": ");
    {
      Direction _direction = spawn.getDirection();
      boolean _equals = Objects.equals(_direction, Direction.LEFT);
      if (_equals) {
        _builder.append("-2.0");
      } else {
        _builder.append("2.0");
      }
    }
    _builder.append(", \"y\": 0.0 }, \"typeInfo\": { \"type\": \"Enemy\", \"subType\": ");
    String _javaString_1 = GeneratorNames.javaString(spawn.getType().getName());
    _builder.append(_javaString_1);
    _builder.append(", \"size\": ");
    int _size = spawn.getSize();
    _builder.append(_size);
    _builder.append(" } }");
    return _builder;
  }
}
