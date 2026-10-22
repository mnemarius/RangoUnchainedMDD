package io.github.RangoUnchained.Modes;

import java.util.HashMap;
import java.util.Map;

/**
 * A difficulty tier of the edition: the factors it multiplies the modelled values of every mode by.
 * The difficulties are generated from the game mode model into {@code GeneratedEdition}, and
 * {@link DifficultyAdjustedMode} applies them to the mode being played.
 */
public final class Difficulty {

    public static final String ENEMY_SPEED = "enemy.speed";
    public static final String ENEMY_POINTS = "enemy.points";
    public static final String PLAYER_HEALTH = "player.health";
    public static final String PLAYER_SPEED = "player.speed";
    public static final String DROP_CHANCE = "drop.chance";
    public static final String WAVE_DELAY = "wave.delay";

    /** The tier as written in the model: easy, medium or hard. */
    public final String tier;
    /** The name shown in the menu. */
    public final String title;
    private final Map<String, Float> factors = new HashMap<String, Float>();

    public Difficulty(String tier, String title) {
        this.tier = tier;
        this.title = title;
    }

    /** Sets the factor of one kind of value; returns this difficulty, for the generated code. */
    public Difficulty with(String target, float factor) {
        factors.put(target, factor);
        return this;
    }

    /** What the given kind of value is multiplied by; 1 for values the difficulty does not change. */
    public float factor(String target) {
        Float factor = factors.get(target);
        return factor == null ? 1f : factor;
    }
}
