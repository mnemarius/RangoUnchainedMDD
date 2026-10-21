package io.github.RangoUnchained.Model.ContactStrategies;

import com.badlogic.gdx.math.Vector2;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.EnemyComponent;
import io.github.RangoUnchained.Model.Components.SpriteComponent;
import io.github.RangoUnchained.Model.Components.StatComponent;
import io.github.RangoUnchained.Model.Entities.EnemyEntity;
import io.github.RangoUnchained.Model.Entities.ProjectileEntity;
import io.github.RangoUnchained.Model.Systems.ContactSystem;
import io.github.RangoUnchained.Model.Systems.ContactSystem.CollisionEvent;
import io.github.RangoUnchained.Model.Systems.TutorialSystem;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData.Dimension;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData.TypeInfo;

public class EnemySplitting implements ContactStrategy{

    @Override
    public void setContactStrategies() {
        ContactSystem centralContactListener = LevelController.getInstance().getSystem(ContactSystem.class);
        centralContactListener.subscribe(
        EnemyEntity.class, ProjectileEntity.class,
        this::ProjectileEnemyContact, // For beginContact
        null);
    }

    public void ProjectileEnemyContact(CollisionEvent collisionEvent){

        EnemyEntity enemy;

        if (collisionEvent.entityA instanceof EnemyEntity) {
            enemy = (EnemyEntity) collisionEvent.entityA;
        } else {
            enemy = (EnemyEntity) collisionEvent.entityB;
        }

        SpriteComponent spriteComponent = (SpriteComponent) enemy.getComponent(SpriteComponent.class);
        StatComponent statComponent = (StatComponent) enemy.getComponent(StatComponent.class);

        float xPos = spriteComponent.getSprite().getX();
        float yPos = spriteComponent.getSprite().getY()+50;
        int timesPopped = statComponent.getTimesPopped();

        LevelController.getInstance().handleRemovalRequests(enemy);
        LevelController.getInstance().getSystem(TutorialSystem.class).flagEnemyKilled();
        EnemyComponent enemyComp = (EnemyComponent) enemy.getComponent(EnemyComponent.class);

        String spawnName = "Enemy " + enemyComp.getTypeName();


        int size = timesPopped == 0 ? 2:timesPopped == 1 ? 1:0;
        Vector2 newVelocity = new Vector2((0), (5));


        if (size == 0){
            return;
        }
        if (enemyComp.getTypeName().equals("Bomb")){
            spawnBombs(enemyComp.getTypeName(), xPos, yPos, size);
        }




        EntityData dataRight = new EntityData();
        dataRight.dimension = new Dimension();
        dataRight.dimension.x = xPos +50;
        dataRight.dimension.y = yPos;
        dataRight.typeInfo = new TypeInfo();
        dataRight.typeInfo.type = "Enemy";
        dataRight.typeInfo.subType = enemyComp.getTypeName();
        dataRight.typeInfo.size = size;
        newVelocity.x = 2;
        dataRight.velocity = newVelocity;
        dataRight.name = spawnName;


        EntityData dataLeft = new EntityData();
        dataLeft.dimension = new Dimension();
        dataLeft.dimension.x = xPos -20;
        dataLeft.dimension.y = yPos;
        dataLeft.typeInfo = new TypeInfo();
        dataLeft.typeInfo.type = "Enemy";
        dataLeft.typeInfo.subType = enemyComp.getTypeName();
        dataLeft.typeInfo.size = size;
        newVelocity.x = -2;
        dataLeft.velocity = newVelocity;
        dataLeft.name = spawnName;

        LevelController.getInstance().handleSpawnRequests(dataLeft);
        LevelController.getInstance().handleSpawnRequests(dataRight);

    }

    private void spawnBombs(String subType, float x, float y, int size) {
        final float speed = 6f; // base speed for all new enemies
        String baseName = "Enemy " + subType;

        for (int i = 0; i < 8; i++) {
            // angle = 0, 45, 90, ... 315 degrees
            double angleRad = Math.toRadians(45 * i);
            float vx = (float) (Math.cos(angleRad) * speed);
            float vy = (float) (Math.sin(angleRad) * speed);

            EntityData data = new EntityData();
            data.name = baseName;
            data.dimension = new Dimension();
            data.dimension.x = x;
            data.dimension.y = y;
            data.velocity = new Vector2(vx, vy);

            data.typeInfo = new TypeInfo();
            data.typeInfo.type    = "Enemy";
            data.typeInfo.subType = subType;
            data.typeInfo.size    = size;

            LevelController.getInstance().handleSpawnRequests(data);
        }
    }
}
