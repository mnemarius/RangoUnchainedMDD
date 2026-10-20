package io.github.RangoUnchained.Model.Components;

/**
 * Component naming the power-up of a game mode that an entity carries.
 */
public class ModePowerUpComponent implements Component {

    public final String name;
    private boolean taken;

    public ModePowerUpComponent(String name) {
        this.name = name;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken() {
        taken = true;
    }
}
