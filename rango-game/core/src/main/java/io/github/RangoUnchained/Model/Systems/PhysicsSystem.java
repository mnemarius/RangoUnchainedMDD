package io.github.RangoUnchained.Model.Systems;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.BounceComponent;
import io.github.RangoUnchained.Model.Components.ModeEnemyComponent;
import io.github.RangoUnchained.Model.Components.SpriteComponent;
import io.github.RangoUnchained.Model.ContactStrategies.*;
import io.github.RangoUnchained.Model.Entities.EnemyEntity;
import io.github.RangoUnchained.Model.Entities.Entity;
import io.github.RangoUnchained.Model.Entities.FloorEntity;
import io.github.RangoUnchained.Model.Systems.ContactSystem.CollisionEvent;
import io.github.RangoUnchained.Views.Utils.Constants;

/**
 * System responsible for syncing physics bodies with sprite positions
 */
public class PhysicsSystem implements Systems, ContactStrategy {

    private World world;
    private ComponentFilter filter = new ComponentFilter();

    public PhysicsSystem() {
        world = new World(new Vector2(0, -10), true);

        filter
        .require(BodyComponent.class)
        .require(SpriteComponent.class);
    }

    public void setContactStrategies(){
        ContactSystem centralContactListener = LevelController.getInstance().getSystem(ContactSystem.class);
        centralContactListener.subscribe(
        EnemyEntity.class, FloorEntity.class,
        null, // For beginContact
        this::handleEnemyFloorCollision);

    }

    @Override
    public void updateEntity(Entity entity, float delta) {
        Sprite sprite = ((SpriteComponent) entity.getComponent(SpriteComponent.class)).getSprite();
        Body body = ((BodyComponent) entity.getComponent(BodyComponent.class)).getBody();

        // Convert physics (meters) position to screen (pixels) position
        float screenX = ((body.getPosition().x * Constants.PPM) - sprite.getWidth() / 2f);
        float screenY = ((body.getPosition().y * Constants.PPM) - sprite.getHeight() / 2f);

        sprite.setPosition(screenX, screenY);
    }

    private void handleEnemyFloorCollision(CollisionEvent collisionEvent) {
        EnemyEntity enemy;

        if (collisionEvent.entityA instanceof EnemyEntity) {
            enemy = (EnemyEntity) collisionEvent.entityA;
        } else {
            enemy = (EnemyEntity) collisionEvent.entityB;
        }

        BodyComponent enemyBodyComponent = (BodyComponent) enemy.getComponent(BodyComponent.class);
        Body enemyBody = enemyBodyComponent.getBody();

        Vector2 currentVelocity = enemyBody.getLinearVelocity();

        // in game modes, the enemy type tunes the bounce
        float bounceScale = 1f;
        float horizontalSpeed = 5f;
        ModeEnemyComponent modeEnemy = (ModeEnemyComponent) enemy.getComponent(ModeEnemyComponent.class);
        if (modeEnemy != null) {
            bounceScale = modeEnemy.kind.bounce;
            horizontalSpeed = modeEnemy.kind.speed;
        }

        final float  STANDARDYVELOCITY = (float)((BounceComponent) enemy.getComponent(BounceComponent.class)).getType() * bounceScale;
        final float  STANDARDXVELOCITY = horizontalSpeed;

        final float YTRESHOLD = -10;
        final float MAXIMUMXTRESHOLD = horizontalSpeed;
        final float MINIMUMXTRESHOLD = 1;

        if (currentVelocity.y > YTRESHOLD) {
            enemyBody.setLinearVelocity(new Vector2(currentVelocity.x,STANDARDYVELOCITY));
        }

        currentVelocity = enemyBody.getLinearVelocity();

        //if enemy bounces too much to the sides
        if (Math.abs(currentVelocity.x) > MAXIMUMXTRESHOLD) {
            // if to the left
            if (currentVelocity.x<0){
                enemyBody.setLinearVelocity(new Vector2(-STANDARDXVELOCITY,currentVelocity.y));

            // if to the right
            } else {
                enemyBody.setLinearVelocity(new Vector2(STANDARDXVELOCITY,currentVelocity.y));

            }
        } else if (Math.abs(currentVelocity.x) < MINIMUMXTRESHOLD){
            // keep drifting the way the enemy leans; an enemy going straight up picks a side at random
            float side = currentVelocity.x < 0 ? -1 : currentVelocity.x > 0 ? 1 : MathUtils.randomSign();
            enemyBody.setLinearVelocity(new Vector2(side * STANDARDXVELOCITY/2,currentVelocity.y));

        }
    }

    public World getWorld() {
        return world;
    }

    @Override
    public boolean filter(Entity entity) {
        return (filter.matches(entity));
    }
}
