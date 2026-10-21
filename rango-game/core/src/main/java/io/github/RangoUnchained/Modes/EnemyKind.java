package io.github.RangoUnchained.Modes;

/**
 * The tuning of a enemy type: what the physics and the rendering of a enemy need to know about it.
 * Its behaviour (popping, contact) lives in the generated {@link GameModeDefinition}.
 */
public final class EnemyKind {

    public final String name;
    public final String sprite;
    public final float scale;
    public final float bounce;
    public final float speed;

    public EnemyKind(String name, String sprite, float scale, float bounce, float speed) {
        this.name = name;
        this.sprite = sprite;
        this.scale = scale;
        this.bounce = bounce;
        this.speed = speed;
    }
}
