package no.ntnu.tdt4250.rango.gamemode.dsl.generator;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Target;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
   * The mode a level belongs to.
   */
  public static GameMode mode(final Level level) {
    EObject _eContainer = level.eContainer();
    return ((GameMode) _eContainer);
  }

  /**
   * The arena resource of a level as the game loads it, relative to the assets folder.
   */
  public static String arenaResource(final Level level) {
    String _name = GeneratorNames.mode(level).getName();
    String _plus = ("modes/" + _name);
    String _plus_1 = (_plus + "-");
    int _number = level.getNumber();
    String _plus_2 = (_plus_1 + Integer.valueOf(_number));
    return (_plus_2 + ".json");
  }

  public static String arenaFile(final Level level) {
    String _arenaResource = GeneratorNames.arenaResource(level);
    return ("assets/" + _arenaResource);
  }

  /**
   * The name of a level in the menus: its title, or else its number.
   */
  public static String levelTitle(final Level level) {
    String _elvis = null;
    String _title = level.getTitle();
    if (_title != null) {
      _elvis = _title;
    } else {
      int _number = level.getNumber();
      String _plus = ("Level " + Integer.valueOf(_number));
      _elvis = _plus;
    }
    return _elvis;
  }

  /**
   * A Java constant name for an enemy type: PricklyPear becomes ENEMY_PRICKLY_PEAR.
   */
  public static String constant(final NamedElement element) {
    String _upperCase = element.getName().replaceAll("([a-z0-9])([A-Z])", "$1_$2").toUpperCase();
    return ("ENEMY_" + _upperCase);
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

  public static boolean enemies(final Target target) {
    return (Objects.equals(target, Target.ALL) || Objects.equals(target, Target.ENEMIES));
  }

  public static boolean player(final Target target) {
    return (Objects.equals(target, Target.ALL) || Objects.equals(target, Target.PLAYER));
  }

  /**
   * The waves of a level; none if its enemies are all placed at the start.
   */
  public static List<Wave> waves(final Level level) {
    List<Wave> _xblockexpression = null;
    {
      final SpawnStrategy spawning = level.getSpawning();
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
