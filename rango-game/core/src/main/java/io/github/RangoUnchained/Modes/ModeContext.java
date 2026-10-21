package io.github.RangoUnchained.Modes;

/**
 * What the generated rules of a mode can do to the round in progress.
 */
public interface ModeContext {

    void addScore(float points);

    /**
     * The score multiplier of a speed bonus: maxFactor at the start of the round, falling evenly
     * to 1 once duration seconds have passed.
     */
    float speedBonus(float maxFactor, float duration);

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
