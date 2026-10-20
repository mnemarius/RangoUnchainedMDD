package io.github.RangoUnchained.Modes;

/**
 * What the generated rules of a mode can do to the round in progress.
 */
public interface ModeContext {

    void addScore(float points);

    /** The score multiplier of speed-bonus scoring: 2 at the start, falling to 1 after a minute. */
    float speedBonus();

    /** A random number in [0, 1). */
    float random();

    /** Breaks a popped ball into fragments one size smaller that fan out sideways. */
    void split(BallState ball, String kind, int fragments, float launchSpeed);

    /** Breaks a popped ball into fragments one size smaller that fly off in all directions. */
    void burst(BallState ball, String kind, int fragments, float launchSpeed);

    void dropPowerUp(String powerUp, BallState from);

    void damage(int amount);

    void heal(int amount);

    void shield(float duration, String icon);

    void changeSpeed(float factor, float duration, String icon);

    void poison(int amount, float interval, float duration, String icon);
}
