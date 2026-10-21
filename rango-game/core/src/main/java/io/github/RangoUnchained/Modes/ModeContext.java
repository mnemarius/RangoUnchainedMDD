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

    /**
     * Breaks a popped enemy into fragments one size smaller, launched at launchSpeed in directions
     * spacing degrees apart and centred on straight up. A single fragment leans the way the enemy was
     * moving.
     */
    void split(EnemyState enemy, String kind, int fragments, float spacing, float launchSpeed);

    void dropPowerUp(String powerUp, EnemyState from);

    void damage(int amount);

    void heal(int amount);

    void shield(float duration, String icon);

    void changeSpeed(float factor, float duration, String icon);

    void poison(int amount, float interval, float duration, String icon);
}
