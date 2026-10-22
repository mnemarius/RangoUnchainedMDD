package io.github.RangoUnchained.Modes;

/**
 * A game mode of the edition: the rules its rounds are played by, and the levels it is played in.
 * Each level is one round with its own arena and enemies; winning a level unlocks the next.
 * <p>
 * Concrete game modes are not written by hand. They are generated from game mode models (the
 * {@code .rango} files of the game mode DSL) into the package {@code Modes.Generated}, together
 * with the arena resources they load from {@code assets/modes}. This class is the contract between
 * the generated code and the hand-written runtime ({@link ModeSession}). The tutorial is the one way
 * of playing that is not a game mode: it stays hand-written.
 * <p>
 * Levels are numbered from 0 in the methods below.
 */
public abstract class GameModeDefinition {

    /** Direction constants for {@link Spawner#spawn}. */
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    /** The identifier of the mode, unique in the edition. */
    public abstract String id();

    /** The name shown in the menu. */
    public abstract String title();

    /** A one-line explanation shown in the menu. */
    public abstract String description();

    /** The number of levels of the mode; at least 1. */
    public abstract int levelCount();

    /** The name of the given level shown in the menu. */
    public abstract String levelTitle(int level);

    /**
     * The arena resource of the given level: background, walls, blocks, the player and the enemies
     * placed at the start.
     */
    public abstract String arenaFile(int level);

    public abstract PlayerSpec player();

    /** Downward acceleration in the arena, in metres per second squared. */
    public abstract float gravity();

    /** The enemy type with the given name, or null if the mode does not know it. */
    public abstract EnemyKind enemyKind(String name);

    /** The image of the power-up with the given name. */
    public abstract String powerUpSprite(String name);

    /** Adds the obstacles that are not plain blocks (jump pads, teleporters) to the arena of the given level. */
    public abstract void buildArena(int level, ArenaBuilder arena);

    /** The number of waves of the given level; 0 if all its enemies are placed at the start. */
    public abstract int waveCount(int level);

    public abstract boolean loopsWaves(int level);

    /** Seconds of calm before the given wave (0-based) of the given level starts. */
    public abstract float waveDelay(int level, int wave);

    /** Spawns the given wave (0-based) of the given level in the given round of the waves (0 the first time). */
    public abstract void spawnWave(int level, int wave, int cycle, Spawner spawner);

    /** Applies what happens when the tongue pops a enemy: score, fragments and drops. */
    public abstract void onEnemyPopped(EnemyState enemy, ModeContext context);

    /** Applies what a enemy does to the player it touches. */
    public abstract void onEnemyTouchesPlayer(EnemyState enemy, ModeContext context);

    /** Applies the effects of a power-up the player has caught. */
    public abstract void onPowerUpCaught(String powerUp, ModeContext context);

    public abstract boolean isWon(ModeStats stats);

    public abstract boolean isLost(ModeStats stats);
}
