package io.github.RangoUnchained.Model.Components;

import io.github.RangoUnchained.Modes.BallKind;

/**
 * Component marking a ball of a game mode: its kind, its size class and whether it has been popped.
 */
public class ModeBallComponent implements Component {

    public final BallKind kind;
    public final int size;
    private boolean popped;

    public ModeBallComponent(BallKind kind, int size) {
        this.kind = kind;
        this.size = size;
    }

    public boolean isPopped() {
        return popped;
    }

    /** Marks the ball as popped. A ball can touch the tongue more than once before it is removed. */
    public void setPopped() {
        popped = true;
    }
}
