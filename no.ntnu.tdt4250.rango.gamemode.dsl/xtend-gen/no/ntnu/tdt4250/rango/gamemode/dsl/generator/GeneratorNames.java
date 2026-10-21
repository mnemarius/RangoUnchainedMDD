package no.ntnu.tdt4250.rango.gamemode.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.BallSpawn;
import no.ntnu.tdt4250.rango.gamemode.Block;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.Material;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Target;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * What the templates of the generator share: where the generated files go in the game, and how model
 * values are written as Java, JSON and XML.
 */
@SuppressWarnings("all")
public class GeneratorNames {
  /**
   * The source folder of the game's core module that receives the generated Java code.
   */
  public static final String JAVA_FOLDER = "core/src/generated/java/";

  /**
   * The package of the generated Java code.
   */
  public static final String PACKAGE = "io.github.RangoUnchained.Modes.Generated";

  /**
   * The folder of the game's assets that receives the arena resources.
   */
  public static final String ARENA_FOLDER = "assets/modes/";

  /**
   * The Android resource file that receives the product name.
   */
  public static final String ANDROID_VALUES = "android/res/values/edition.xml";

  public static String className(final GameMode mode) {
    String _firstUpper = StringExtensions.toFirstUpper(mode.getName());
    return (_firstUpper + "Mode");
  }

  public static String javaFile(final String className) {
    String _replace = GeneratorNames.PACKAGE.replace(".", "/");
    String _plus = (GeneratorNames.JAVA_FOLDER + _replace);
    String _plus_1 = (_plus + "/");
    String _plus_2 = (_plus_1 + className);
    return (_plus_2 + ".java");
  }

  /**
   * The arena resource of a mode as the game loads it, relative to the assets folder.
   */
  public static String arenaResource(final GameMode mode) {
    String _name = mode.getName();
    String _plus = ("modes/" + _name);
    return (_plus + ".json");
  }

  public static String arenaFile(final GameMode mode) {
    String _arenaResource = GeneratorNames.arenaResource(mode);
    return ("assets/" + _arenaResource);
  }

  /**
   * A Java constant name for a ball type: PricklyPear becomes BALL_PRICKLY_PEAR.
   */
  public static String constant(final NamedElement element) {
    String _upperCase = element.getName().replaceAll("([a-z0-9])([A-Z])", "$1_$2").toUpperCase();
    return ("BALL_" + _upperCase);
  }

  public static String title(final Edition edition) {
    String _elvis = null;
    String _title = edition.getTitle();
    if (_title != null) {
      _elvis = _title;
    } else {
      String _name = edition.getName();
      _elvis = _name;
    }
    return _elvis;
  }

  public static String javaString(final String value) {
    String _elvis = null;
    if (value != null) {
      _elvis = value;
    } else {
      _elvis = "";
    }
    String _convertToJavaString = Strings.convertToJavaString(_elvis);
    String _plus = ("\"" + _convertToJavaString);
    return (_plus + "\"");
  }

  public static String javaFloat(final float value) {
    String _string = Float.toString(value);
    return (_string + "f");
  }

  public static String jsonFloat(final float value) {
    return Float.toString(value);
  }

  /**
   * Text that can go into a Java comment.
   */
  public static String comment(final String value) {
    String _elvis = null;
    if (value != null) {
      _elvis = value;
    } else {
      _elvis = "";
    }
    return _elvis.replace("*/", "* /");
  }

  /**
   * Text that can go into an Android string resource.
   */
  public static String xmlText(final String value) {
    String _elvis = null;
    if (value != null) {
      _elvis = value;
    } else {
      _elvis = "";
    }
    return _elvis.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\'", "\\\'").replace("\"", "\\\"");
  }

  public static boolean balls(final Target target) {
    return (Objects.equals(target, Target.ALL) || Objects.equals(target, Target.BALLS));
  }

  public static boolean player(final Target target) {
    return (Objects.equals(target, Target.ALL) || Objects.equals(target, Target.PLAYER));
  }

  /**
   * The waves of a mode; none if its balls are all placed at the start.
   */
  public static List<Wave> waves(final GameMode mode) {
    List<Wave> _xblockexpression = null;
    {
      final SpawnStrategy spawning = mode.getSpawning();
      List<Wave> _xifexpression = null;
      if ((spawning instanceof WaveSchedule)) {
        _xifexpression = ((WaveSchedule)spawning).getWaves();
      } else {
        _xifexpression = Collections.<Wave>unmodifiableList(CollectionLiterals.<Wave>newArrayList());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  /**
   * The materials a mode's arena is built from: its floor, its walls and its blocks.
   */
  public static Set<Material> materials(final GameMode mode) {
    Set<Material> _xblockexpression = null;
    {
      final Arena arena = mode.getArena();
      Material _floor = arena.getFloor();
      Material _walls = arena.getWalls();
      final Function1<Block, Material> _function = (Block it) -> {
        return it.getMaterial();
      };
      Iterable<Material> _map = IterableExtensions.<Block, Material>map(Iterables.<Block>filter(arena.getObstacles(), Block.class), _function);
      final Iterable<Material> surfaces = Iterables.<Material>concat(Collections.<Material>unmodifiableList(CollectionLiterals.<Material>newArrayList(_floor, _walls)), _map);
      _xblockexpression = IterableExtensions.<Material>toSet(IterableExtensions.<Material>filterNull(surfaces));
    }
    return _xblockexpression;
  }

  /**
   * The horizontal positions of the balls of a spawn: spread out sideways around the spawn position,
   * the same way the game's spawner spreads out the balls of a wave.
   */
  public static List<Float> spreadX(final BallSpawn spawn) {
    int _max = Math.max(spawn.getCount(), 0);
    final Function1<Integer, Float> _function = (Integer i) -> {
      float _x = spawn.getX();
      int _count = spawn.getCount();
      int _minus = (_count - 1);
      float _divide = (_minus / 2f);
      float _minus_1 = ((i).intValue() - _divide);
      float _multiply = (_minus_1 * 8f);
      float _plus = (_x + _multiply);
      return Float.valueOf(Math.max(3f, Math.min(97f, _plus)));
    };
    return IterableExtensions.<Float>toList(IterableExtensions.<Integer, Float>map(new ExclusiveRange(0, _max, true), _function));
  }

  /**
   * A percentage for a comment, with at most one decimal: 12.5, 20, 6.7.
   */
  public static String percent(final float value) {
    String _xblockexpression = null;
    {
      int _round = Math.round((value * 10));
      final double rounded = (_round / 10.0);
      String _xifexpression = null;
      double _rint = Math.rint(rounded);
      boolean _equals = (rounded == _rint);
      if (_equals) {
        _xifexpression = String.valueOf(((int) rounded));
      } else {
        _xifexpression = String.valueOf(rounded);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  /**
   * The upper end of the roll that drops the entry at the given index of a drop table.
   */
  public static int threshold(final DropTable table, final int index) {
    final Function2<Integer, Drop, Integer> _function = (Integer sum, Drop entry) -> {
      int _weight = entry.getWeight();
      return Integer.valueOf(((sum).intValue() + _weight));
    };
    return (int) IterableExtensions.<Drop, Integer>fold(IterableExtensions.<Drop>take(table.getEntries(), (index + 1)), Integer.valueOf(0), _function);
  }
}
