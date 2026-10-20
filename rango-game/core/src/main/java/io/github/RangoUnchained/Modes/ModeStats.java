package io.github.RangoUnchained.Modes;

/**
 * The state of the round that win and lose conditions are checked against.
 */
public interface ModeStats {

    /** Seconds since the round started. */
    float elapsed();

    int score();

    int popped();

    int wavesCleared();

    int ballsAlive();

    int playerHealth();

    /** No ball is left and none is still to come. */
    boolean cleared();
}
