package io.github.RangoUnchained.Modes;

/**
 * How the player character plays in a mode.
 */
public final class PlayerSpec {

    public final String character;
    public final int health;
    /** The most hearts healing can bring the player to; 0 for no limit. */
    public final int maxHealth;
    public final float speed;
    /** Seconds the tongue stays out. */
    public final float tongueTime;
    /** Seconds between two shots. */
    public final float cooldown;
    /** Seconds the player cannot be damaged again after taking damage. */
    public final float graceTime;

    public PlayerSpec(String character, int health, int maxHealth, float speed, float tongueTime,
            float cooldown, float graceTime) {
        this.character = character;
        this.health = health;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.tongueTime = tongueTime;
        this.cooldown = cooldown;
        this.graceTime = graceTime;
    }

    /** Converts seconds to the frames counted by the game's systems, which run at 60 frames per second. */
    public static int frames(float seconds) {
        return Math.max(1, Math.round(seconds * 60f));
    }
}
