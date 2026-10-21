package io.github.RangoUnchained.Modes;

/**
 * A snapshot of a enemy, handed to the generated rules when it is popped or touches the player.
 * Positions are in pixels (the centre of the enemy), velocities in metres per second.
 */
public final class EnemyState {

    public final String kind;
    public final int size;
    public final float x;
    public final float y;
    public final float vx;
    public final float vy;

    public EnemyState(String kind, int size, float x, float y, float vx, float vy) {
        this.kind = kind;
        this.size = size;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
}
