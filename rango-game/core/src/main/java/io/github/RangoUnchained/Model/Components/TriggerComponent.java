package io.github.RangoUnchained.Model.Components;

import io.github.RangoUnchained.Model.Entities.Entity;

/**
 * Component of a trigger (jump pad, teleporter): what it acts on and what it does.
 */
public class TriggerComponent implements Component {

    /** What a trigger does to an entity that enters it. */
    public interface Action {
        void enter(Entity entity);
    }

    public final boolean enemies;
    public final boolean player;
    public final Action action;

    public TriggerComponent(boolean enemies, boolean player, Action action) {
        this.enemies = enemies;
        this.player = player;
        this.action = action;
    }
}
