package io.github.RangoUnchained.Modes;

/**
 * A game mode of the edition: the rules of one round.
 * <p>
 * Concrete game modes are not written by hand. They are generated from game mode models (the
 * {@code .rango} files of the game mode DSL) into the package {@code Modes.Generated}, together
 * with the arena resources they load from {@code assets/modes}. This class is the contract between
 * the generated code and the hand-written runtime ({@link ModeSession}).
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

    /** The arena resource: background, walls, blocks, the player and the enemies placed at the start. */
    public abstract String arenaFile();

    public abstract PlayerSpec player();

    /** Downward acceleration in the arena, in metres per second squared. */
    public abstract float gravity();

    /** The enemy type with the given name, or null if the mode does not know it. */
    public abstract EnemyKind enemyKind(String name);

    /** The image of the power-up with the given name. */
    public abstract String powerUpSprite(String name);

    /** What enemies rebounding from the given material are sped up by; 1 for unknown materials. */
    public abstract float materialBounce(String material);

    /** Adds the obstacles that are not plain blocks (jump pads, teleporters) to the arena. */
    public abstract void buildArena(ArenaBuilder arena);

    /** The number of waves; 0 if all enemies are placed at the start. */
    public abstract int waveCount();

    public abstract boolean loopsWaves();

    /** Seconds of calm before the given wave (0-based) starts. */
    public abstract float waveDelay(int wave);

    /** Spawns the given wave (0-based) in the given round of the waves (0 the first time). */
    public abstract void spawnWave(int wave, int cycle, Spawner spawner);

    /** Applies what happens when the tongue pops a enemy: score, fragments and drops. */
    public abstract void onEnemyPopped(EnemyState enemy, ModeContext context);

    /** Applies what a enemy does to the player it touches. */
    public abstract void onEnemyTouchesPlayer(EnemyState enemy, ModeContext context);

    /** Applies the effects of a power-up the player has caught. */
    public abstract void onPowerUpCaught(String powerUp, ModeContext context);

    public abstract boolean isWon(ModeStats stats);

    public abstract boolean isLost(ModeStats stats);
}
