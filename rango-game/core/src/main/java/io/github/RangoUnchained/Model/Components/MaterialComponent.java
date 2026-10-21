package io.github.RangoUnchained.Model.Components;

/**
 * Component giving an obstacle a surface material, which changes how fast enemies rebound from it.
 */
public class MaterialComponent implements Component {

    private final float bounce;

    /**
     * @param bounce what the speed of a rebounding enemy is multiplied by
     */
    public MaterialComponent(float bounce) {
        this.bounce = bounce;
    }

    public float getBounce() {
        return bounce;
    }
}
