package io.github.RangoUnchained.Model.Factories;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.EnemyComponent;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.BounceComponent;
import io.github.RangoUnchained.Model.Components.Component;
import io.github.RangoUnchained.Model.Components.ContactComponent;
import io.github.RangoUnchained.Model.Components.HealthComponent;
import io.github.RangoUnchained.Model.Components.ModeEnemyComponent;
import io.github.RangoUnchained.Model.Components.SpriteComponent;
import io.github.RangoUnchained.Model.Components.StatComponent;
import io.github.RangoUnchained.Model.Entities.EnemyEntity;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData;
import io.github.RangoUnchained.Modes.EnemyKind;
import io.github.RangoUnchained.Modes.ModeSession;
import io.github.RangoUnchained.Views.Utils.Constants;

public class EnemyFactory {

    public static EnemyEntity create(EntityData entityData) {

        EnemyEntity enemy = new EnemyEntity();

        enemy.addComponent(createBodyComponent(entityData,enemy));
        enemy.addComponent(createBounceComponent(entityData));
        enemy.addComponent(createHealthComponent(entityData));
        enemy.addComponent(createSpriteComponent(entityData));
        enemy.addComponent(createStatComponent(entityData));
        enemy.addComponent(createEnemyComponent(entityData));
        enemy.addComponent(createContactComponent(entityData));

        EnemyKind kind = modeKind(entityData);
        if (kind != null) {
            enemy.addComponent(new ModeEnemyComponent(kind, entityData.typeInfo.size));
        }

        return enemy;
    }

    private static final int BIGENEMYRADIUS = 64;
    private static final int MEDIUMENEMYRADIUS = 48;
    private static final int SMALLENEMYRADIUS = 32;

    private static final int BIGENEMYPOPPED = 0;
    private static final int MEDIUMENEMYPOPPED = 1;
    private static final int SMALLENEMYPOPPED = 2;

    private static final float SMALLPULSE = 0.005f;
    private static final float MEDIUMPULSE = 0.01f;
    private static final float BIGPULSE = 0.03f;


    private static Component createBodyComponent(EntityData entityData, EnemyEntity enemy){

        //calculate radius
        int size = entityData.typeInfo.size;
        float radius = size == 3  ? BIGENEMYRADIUS : size == 2  ? MEDIUMENEMYRADIUS : SMALLENEMYRADIUS;
        radius = radius * scale(entityData);
        radius = radius / Constants.PPM;

        //retrieve world, x and y
        float x = entityData.dimension.x;
        float y = entityData.dimension.y;

        World world = LevelController.getInstance().getWorld();


        BodyComponent body = BodyFactory.createBody(world, x, y, BodyDef.BodyType.DynamicBody, BodyFactory.createCircleFixture(radius/2,EntityFactory.CATEGORY_ENEMY,EntityFactory.MASK_ENEMY),false);
        if (entityData.velocity != null) {
            body.getBody().setLinearVelocity(entityData.velocity);
        }
        body.getBody().setAngularDamping(0f);

        float pulse = size==3 ? BIGPULSE : size==2 ? MEDIUMPULSE :SMALLPULSE;
        body.getBody().applyAngularImpulse(pulse, true);
        body.getBody().setUserData(enemy);
        return body;
    }

    private static Component createStatComponent(EntityData entityData){
        int size = entityData.typeInfo.size;
        int timesPopped = size == 3 ? BIGENEMYPOPPED : size == 2 ? MEDIUMENEMYPOPPED : SMALLENEMYPOPPED;
        StatComponent statComp = new StatComponent();
        statComp.setTimesPopped(timesPopped);
        return statComp;
    }

    private static Component createSpriteComponent(EntityData entityData){
        String spritePath;


        EnemyKind kind = modeKind(entityData);
        spritePath = kind != null ? kind.sprite : entityData.typeInfo.type + "/" + entityData.typeInfo.subType + ".png";


        int size = entityData.typeInfo.size;
        float radius = size == 3  ? BIGENEMYRADIUS : size == 2  ? MEDIUMENEMYRADIUS : SMALLENEMYRADIUS;

        radius = radius * scale(entityData);
        return new SpriteComponent(spritePath, radius, radius);
    }

    private static Component createBounceComponent(EntityData entityData){
        int size = entityData.typeInfo.size;
        int bounceType = size == 3 ? BounceComponent.HIGH : size == 2 ? BounceComponent.MEDIUM : BounceComponent.LOW;
        return new BounceComponent(bounceType);
    }

    private static Component createEnemyComponent(EntityData entityData){

        int enemyType = entityData.typeInfo.subType.equals("Armedillo") ? EnemyComponent.ARMEDILLOTYPE :
        entityData.typeInfo.subType.equals("Cactus") ? EnemyComponent.CACTUSTYPE:
        entityData.typeInfo.subType.equals("Tumbleweed") ? EnemyComponent.TUMBLEWEEDTYPE:
        entityData.typeInfo.subType.equals("Bomb") ? EnemyComponent.BOMB: -1;
        return new EnemyComponent(enemyType);
    }

    private static Component createContactComponent(EntityData entityData){
        ContactComponent contactComponent = new ContactComponent();
        contactComponent.setContactLock(80);
        return contactComponent;
    }

    /** The kind of the enemy in the game mode being played, or null when a campaign level is played. */
    private static EnemyKind modeKind(EntityData entityData) {
        ModeSession session = ModeSession.active();
        return session == null ? null : session.getMode().enemyKind(entityData.typeInfo.subType);
    }

    private static float scale(EntityData entityData) {
        EnemyKind kind = modeKind(entityData);
        return kind == null ? 1f : kind.scale;
    }

    private static Component createHealthComponent(EntityData entityData){
        return new HealthComponent(entityData.typeInfo.size);
    }
}
