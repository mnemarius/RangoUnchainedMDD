package io.github.RangoUnchained.Modes;

/**
 * Puts balls into the arena. Positions are percentages of the arena (see {@link ArenaGeometry}).
 */
public interface Spawner {

    /**
     * Spawns {@code count} balls of a kind and size around a position, spread out sideways.
     *
     * @param direction {@link GameModeDefinition#LEFT} or {@link GameModeDefinition#RIGHT}
     */
    void spawn(String kind, int size, int count, float x, float y, int direction);
}
