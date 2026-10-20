package io.github.RangoUnchained.Model.Factories;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.ContactComponent;
import io.github.RangoUnchained.Model.Components.SpriteComponent;
import io.github.RangoUnchained.Model.Components.TriggerComponent;
import io.github.RangoUnchained.Model.Entities.TriggerEntity;
import io.github.RangoUnchained.Views.Utils.Constants;

public class TriggerFactory {

    /**
     * Creates a trigger: a static sensor that reports contacts but does not stop anything.
     *
     * @param x centre in pixels
     * @param y centre in pixels
     */
    public static TriggerEntity create(float x, float y, float width, float height, String sprite,
            TriggerComponent trigger) {
        TriggerEntity entity = new TriggerEntity();

        FixtureDef fixture = BodyFactory.createBoxFixture(width / Constants.PPM, height / Constants.PPM,
            EntityFactory.CATEGORY_OBSTACLE, (short) (EntityFactory.CATEGORY_PLAYER | EntityFactory.CATEGORY_BALL));
        fixture.isSensor = true;
        BodyComponent body = BodyFactory.createBody(LevelController.getInstance().getWorld(), x, y,
            BodyDef.BodyType.StaticBody, fixture, true);
        body.getBody().setUserData(entity);

        SpriteComponent spriteComponent = new SpriteComponent(sprite, width, height);
        spriteComponent.getSprite().setPosition(x - width / 2f, y - height / 2f);

        entity.addComponent(body);
        entity.addComponent(spriteComponent);
        entity.addComponent(new ContactComponent());
        entity.addComponent(trigger);
        return entity;
    }
}
