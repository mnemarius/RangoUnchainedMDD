package io.github.RangoUnchained.Modes;

/**
 * Puts enemies into the arena. Positions are percentages of the arena (see {@link ArenaGeometry}).
 */
public interface Spawner {

    /**
     * Spawns {@code count} enemies of a kind and size around a position, spread out sideways and moving
     * in the given direction at the speed of their kind.
     *
     * @param direction {@link GameModeDefinition#LEFT} or {@link GameModeDefinition#RIGHT}
     */
    void spawn(String kind, int size, int count, float x, float y, int direction);
}
