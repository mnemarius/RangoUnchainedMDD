package io.github.RangoUnchained.Model.Factories;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.BallComponent;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.BounceComponent;
import io.github.RangoUnchained.Model.Components.Component;
import io.github.RangoUnchained.Model.Components.ContactComponent;
import io.github.RangoUnchained.Model.Components.HealthComponent;
import io.github.RangoUnchained.Model.Components.ModeBallComponent;
import io.github.RangoUnchained.Model.Components.SpriteComponent;
import io.github.RangoUnchained.Model.Components.StatComponent;
import io.github.RangoUnchained.Model.Entities.BallEntity;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData;
import io.github.RangoUnchained.Modes.BallKind;
import io.github.RangoUnchained.Modes.ModeSession;
import io.github.RangoUnchained.Views.Utils.Constants;

public class BallFactory {

    public static BallEntity create(EntityData entityData) {

        BallEntity ball = new BallEntity();

        ball.addComponent(createBodyComponent(entityData,ball));
        ball.addComponent(createBounceComponent(entityData));
        ball.addComponent(createHealthComponent(entityData));
        ball.addComponent(createSpriteComponent(entityData));
        ball.addComponent(createStatComponent(entityData));
        ball.addComponent(createBallComponent(entityData));
        ball.addComponent(createContactComponent(entityData));

        BallKind kind = modeKind(entityData);
        if (kind != null) {
            ball.addComponent(new ModeBallComponent(kind, entityData.typeInfo.size));
        }

        return ball;
    }

    private static final int BIGBALLRADIUS = 64;
    private static final int MEDIUMBALLRADIUS = 48;
    private static final int SMALLBALLRADIUS = 32;

    private static final int BIGBALLPOPPED = 0;
    private static final int MEDIUMBALLPOPPED = 1;
    private static final int SMALLBALLPOPPED = 2;

    private static final float SMALLPULSE = 0.005f;
    private static final float MEDIUMPULSE = 0.01f;
    private static final float BIGPULSE = 0.03f;


    private static Component createBodyComponent(EntityData entityData, BallEntity ball){

        //calculate radius
        int size = entityData.typeInfo.size;
        float radius = size == 3  ? BIGBALLRADIUS : size == 2  ? MEDIUMBALLRADIUS : SMALLBALLRADIUS;
        radius = radius * scale(entityData);
        radius = radius / Constants.PPM;

        //retrieve world, x and y
        float x = entityData.dimension.x;
        float y = entityData.dimension.y;

        World world = LevelController.getInstance().getWorld();


        BodyComponent body = BodyFactory.createBody(world, x, y, BodyDef.BodyType.DynamicBody, BodyFactory.createCircleFixture(radius/2,EntityFactory.CATEGORY_BALL,EntityFactory.MASK_BALL),false);
        if (entityData.velocity != null) {
            body.getBody().setLinearVelocity(entityData.velocity);
        }
        body.getBody().setAngularDamping(0f);

        float pulse = size==3 ? BIGPULSE : size==2 ? MEDIUMPULSE :SMALLPULSE;
        body.getBody().applyAngularImpulse(pulse, true);
        body.getBody().setUserData(ball);
        return body;
    }

    private static Component createStatComponent(EntityData entityData){
        int size = entityData.typeInfo.size;
        int timesPopped = size == 3 ? BIGBALLPOPPED : size == 2 ? MEDIUMBALLPOPPED : SMALLBALLPOPPED;
        StatComponent statComp = new StatComponent();
        statComp.setTimesPopped(timesPopped);
        return statComp;
    }

    private static Component createSpriteComponent(EntityData entityData){
        String spritePath;


        BallKind kind = modeKind(entityData);
        spritePath = kind != null ? kind.sprite : entityData.typeInfo.type + "/" + entityData.typeInfo.subType + ".png";


        int size = entityData.typeInfo.size;
        float radius = size == 3  ? BIGBALLRADIUS : size == 2  ? MEDIUMBALLRADIUS : SMALLBALLRADIUS;

        radius = radius * scale(entityData);
        return new SpriteComponent(spritePath, radius, radius);
    }

    private static Component createBounceComponent(EntityData entityData){
        int size = entityData.typeInfo.size;
        int bounceType = size == 3 ? BounceComponent.HIGH : size == 2 ? BounceComponent.MEDIUM : BounceComponent.LOW;
        return new BounceComponent(bounceType);
    }

    private static Component createBallComponent(EntityData entityData){

        int ballType = entityData.typeInfo.subType.equals("Armedillo") ? BallComponent.ARMEDILLOTYPE :
        entityData.typeInfo.subType.equals("Cactus") ? BallComponent.CACTUSTYPE:
        entityData.typeInfo.subType.equals("Tumbleweed") ? BallComponent.TUMBLEWEEDTYPE:
        entityData.typeInfo.subType.equals("Bomb") ? BallComponent.BOMB: -1;
        return new BallComponent(ballType);
    }

    private static Component createContactComponent(EntityData entityData){
        ContactComponent contactComponent = new ContactComponent();
        contactComponent.setContactLock(80);
        return contactComponent;
    }

    /** The kind of the ball in the game mode being played, or null when a campaign level is played. */
    private static BallKind modeKind(EntityData entityData) {
        ModeSession session = ModeSession.active();
        return session == null ? null : session.getMode().ballKind(entityData.typeInfo.subType);
    }

    private static float scale(EntityData entityData) {
        BallKind kind = modeKind(entityData);
        return kind == null ? 1f : kind.scale;
    }

    private static Component createHealthComponent(EntityData entityData){
        return new HealthComponent(entityData.typeInfo.size);
    }
}
