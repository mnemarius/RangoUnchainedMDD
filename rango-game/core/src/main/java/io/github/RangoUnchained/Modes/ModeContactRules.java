package io.github.RangoUnchained.Modes;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.MaterialComponent;
import io.github.RangoUnchained.Model.Components.ModeBallComponent;
import io.github.RangoUnchained.Model.Components.TriggerComponent;
import io.github.RangoUnchained.Model.ContactStrategies.ContactStrategy;
import io.github.RangoUnchained.Model.Entities.BallEntity;
import io.github.RangoUnchained.Model.Entities.Entity;
import io.github.RangoUnchained.Model.Entities.FloorEntity;
import io.github.RangoUnchained.Model.Entities.ObstacleEntity;
import io.github.RangoUnchained.Model.Entities.PlayerEntity;
import io.github.RangoUnchained.Model.Entities.PowerUpEntity;
import io.github.RangoUnchained.Model.Entities.ProjectileEntity;
import io.github.RangoUnchained.Model.Entities.TriggerEntity;
import io.github.RangoUnchained.Model.Systems.ContactSystem;
import io.github.RangoUnchained.Model.Systems.ContactSystem.CollisionEvent;

/**
 * The contact strategies of a game mode. They replace the fixed strategies of the campaign
 * (ball splitting, power-up spawning, damage, pick-up and scoring) by the rules of the mode.
 */
public class ModeContactRules implements ContactStrategy {

    /** Rebounds faster than this, in metres per second, are capped so springy materials stay playable. */
    private static final float MAX_REBOUND_SPEED = 15f;

    private final ModeSession session;

    public ModeContactRules(ModeSession session) {
        this.session = session;
    }

    @Override
    public void setContactStrategies() {
        ContactSystem contacts = LevelController.getInstance().getSystem(ContactSystem.class);
        contacts.subscribe(BallEntity.class, ProjectileEntity.class,
            event -> session.pop(find(event, BallEntity.class)), null);
        contacts.subscribe(BallEntity.class, PlayerEntity.class,
            event -> session.touch(find(event, BallEntity.class)), null);
        contacts.subscribe(PlayerEntity.class, PowerUpEntity.class,
            event -> session.caught(find(event, PowerUpEntity.class)), null);
        contacts.subscribe(TriggerEntity.class, BallEntity.class, this::enterTrigger, null);
        contacts.subscribe(TriggerEntity.class, PlayerEntity.class, this::enterTrigger, null);
        contacts.subscribe(BallEntity.class, ObstacleEntity.class, null, this::reboundFromMaterial);
    }

    private void enterTrigger(CollisionEvent event) {
        TriggerEntity trigger = find(event, TriggerEntity.class);
        Entity other = event.entityA == trigger ? event.entityB : event.entityA;
        TriggerComponent component = (TriggerComponent) trigger.getComponent(TriggerComponent.class);
        ModeBallComponent modeBall = (ModeBallComponent) other.getComponent(ModeBallComponent.class);
        if (modeBall != null && modeBall.isPopped()) {
            return;
        }
        if ((other instanceof BallEntity && component.balls) || (other instanceof PlayerEntity && component.player)) {
            component.action.enter(other);
        }
    }

    /** Walls and blocks made of a material speed up or slow down the balls rebounding from them. */
    private void reboundFromMaterial(CollisionEvent event) {
        ObstacleEntity obstacle = find(event, ObstacleEntity.class);
        if (obstacle instanceof FloorEntity || obstacle instanceof TriggerEntity) {
            return; // the floor bounce is handled by the physics system, triggers do not block
        }
        MaterialComponent material = (MaterialComponent) obstacle.getComponent(MaterialComponent.class);
        if (material == null || material.getBounce() == 1f) {
            return;
        }
        BodyComponent bodyComponent = (BodyComponent) find(event, BallEntity.class).getComponent(BodyComponent.class);
        Body body = bodyComponent.getBody();
        Vector2 velocity = body.getLinearVelocity().cpy().scl(material.getBounce());
        body.setLinearVelocity(velocity.limit(MAX_REBOUND_SPEED));
    }

    private static <T extends Entity> T find(CollisionEvent event, Class<T> type) {
        return type.isInstance(event.entityA) ? type.cast(event.entityA) : type.cast(event.entityB);
    }
}
