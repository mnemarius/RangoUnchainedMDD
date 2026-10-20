package io.github.RangoUnchained.Modes;

import com.badlogic.gdx.Gdx;

/**
 * Converts the arena-relative positions of game mode models into pixels. (0%, 0%) is the left end of
 * the floor's surface, (100%, 100%) the right end of the roof, whatever the size of the screen.
 */
public final class ArenaGeometry {

    /** The top of the floor obstacle (centre 50 px, 200 px high). */
    public static final float FLOOR_TOP = 150f;
    /** Half the width of a side wall. */
    public static final float WALL = 16f;
    /** Half the height of the roof. */
    public static final float ROOF = 25f;

    private ArenaGeometry() {
    }

    public static float x(float percent) {
        float left = WALL;
        float right = Gdx.graphics.getWidth() - WALL;
        return left + (right - left) * clamp(percent) / 100f;
    }

    public static float y(float percent) {
        float bottom = FLOOR_TOP;
        float top = Gdx.graphics.getHeight() - ROOF;
        return bottom + (top - bottom) * clamp(percent) / 100f;
    }

    private static float clamp(float percent) {
        return Math.max(0f, Math.min(100f, percent));
    }
}
