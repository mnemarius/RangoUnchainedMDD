package io.github.RangoUnchained.Modes;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.ModeEnemyComponent;
import io.github.RangoUnchained.Model.Components.TriggerComponent;
import io.github.RangoUnchained.Model.ContactStrategies.ContactStrategy;
import io.github.RangoUnchained.Model.Entities.EnemyEntity;
import io.github.RangoUnchained.Model.Entities.Entity;
import io.github.RangoUnchained.Model.Entities.PlayerEntity;
import io.github.RangoUnchained.Model.Entities.PowerUpEntity;
import io.github.RangoUnchained.Model.Entities.ProjectileEntity;
import io.github.RangoUnchained.Model.Entities.TriggerEntity;
import io.github.RangoUnchained.Model.Systems.ContactSystem;
import io.github.RangoUnchained.Model.Systems.ContactSystem.CollisionEvent;

/**
 * The contact strategies of a game mode. They replace the fixed strategies of the campaign
 * (enemy splitting, power-up spawning, damage, pick-up and scoring) by the rules of the mode.
 */
public class ModeContactRules implements ContactStrategy {

    private final ModeSession session;

    public ModeContactRules(ModeSession session) {
        this.session = session;
    }

    @Override
    public void setContactStrategies() {
        ContactSystem contacts = LevelController.getInstance().getSystem(ContactSystem.class);
        contacts.subscribe(EnemyEntity.class, ProjectileEntity.class,
            event -> session.pop(find(event, EnemyEntity.class)), null);
        contacts.subscribe(EnemyEntity.class, PlayerEntity.class,
            event -> session.touch(find(event, EnemyEntity.class)), null);
        contacts.subscribe(PlayerEntity.class, PowerUpEntity.class,
            event -> session.caught(find(event, PowerUpEntity.class)), null);
        contacts.subscribe(TriggerEntity.class, EnemyEntity.class, this::enterTrigger, null);
        contacts.subscribe(TriggerEntity.class, PlayerEntity.class, this::enterTrigger, null);
    }

    private void enterTrigger(CollisionEvent event) {
        TriggerEntity trigger = find(event, TriggerEntity.class);
        Entity other = event.entityA == trigger ? event.entityB : event.entityA;
        TriggerComponent component = (TriggerComponent) trigger.getComponent(TriggerComponent.class);
        ModeEnemyComponent modeEnemy = (ModeEnemyComponent) other.getComponent(ModeEnemyComponent.class);
        if (modeEnemy != null && modeEnemy.isPopped()) {
            return;
        }
        if ((other instanceof EnemyEntity && component.enemies) || (other instanceof PlayerEntity && component.player)) {
            component.action.enter(other);
        }
    }

    private static <T extends Entity> T find(CollisionEvent event, Class<T> type) {
        return type.isInstance(event.entityA) ? type.cast(event.entityA) : type.cast(event.entityB);
    }
}
