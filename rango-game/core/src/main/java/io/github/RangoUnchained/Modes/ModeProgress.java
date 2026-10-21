package io.github.RangoUnchained.Modes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

/**
 * How far the player has come in each game mode: the levels unlocked so far. The first level of a
 * mode is always unlocked; winning a level unlocks the next. Progress is kept per mode id in the
 * preferences of the game, so it survives restarts.
 */
public final class ModeProgress {

    private static final String PREFERENCES = "rango-mode-progress";

    private ModeProgress() {
    }

    /** The number of unlocked levels of the mode: at least 1, at most all of them. */
    public static int unlocked(GameModeDefinition mode) {
        int unlocked = preferences().getInteger(mode.id(), 1);
        return Math.max(1, Math.min(unlocked, mode.levelCount()));
    }

    /** Whether the given level (counting from 0) can be played. */
    public static boolean isUnlocked(GameModeDefinition mode, int level) {
        return level < unlocked(mode);
    }

    /** Records that the given level (counting from 0) was won, which unlocks the next one. */
    public static void complete(GameModeDefinition mode, int level) {
        int unlocked = Math.min(level + 2, mode.levelCount());
        if (unlocked > unlocked(mode)) {
            Preferences preferences = preferences();
            preferences.putInteger(mode.id(), unlocked);
            preferences.flush();
        }
    }

    private static Preferences preferences() {
        return Gdx.app.getPreferences(PREFERENCES);
    }
}
