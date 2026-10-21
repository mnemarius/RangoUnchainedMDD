package io.github.RangoUnchained.Model.Components;

import io.github.RangoUnchained.Modes.EnemyKind;

/**
 * Component marking a enemy of a game mode: its kind, its size class and whether it has been popped.
 */
public class ModeEnemyComponent implements Component {

    public final EnemyKind kind;
    public final int size;
    private boolean popped;

    public ModeEnemyComponent(EnemyKind kind, int size) {
        this.kind = kind;
        this.size = size;
    }

    public boolean isPopped() {
        return popped;
    }

    /** Marks the enemy as popped. A enemy can touch the tongue more than once before it is removed. */
    public void setPopped() {
        popped = true;
    }
}
