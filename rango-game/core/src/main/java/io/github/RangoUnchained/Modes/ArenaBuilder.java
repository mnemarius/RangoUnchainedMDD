package io.github.RangoUnchained.Modes;

/**
 * Adds triggers to the arena. Positions are percentages of the arena (see {@link ArenaGeometry}).
 */
public interface ArenaBuilder {

    void jumpPad(String name, float x, float y, float launch, boolean balls, boolean player);

    void teleporter(String name, float x, float y, String target, boolean balls, boolean player);
}
