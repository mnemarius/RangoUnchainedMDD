package io.github.RangoUnchained.Model.Components;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;

/**
 * Component representing a sprite for an entity.
 */
public class SpriteComponent implements Component {

    private final Sprite sprite;
    private Texture texture;
    private final String path;

    /**
     * Constructs a {@link SpriteComponent} from an image path with a specified size.
     *
     * @param path   path to the texture
     * @param width  width of the sprite
     * @param height height of the sprite
     */
    public SpriteComponent(String path, float width, float height) {
        this.path = path;
        System.out.println(path);

        texture = new Texture(Gdx.files.internal(path));
        texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);


        sprite = new Sprite(texture);
        sprite.setColor(Color.WHITE);
        sprite.setSize(width, height);
        sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
    }

    /**
     * Constructs a {@link SpriteComponent} from a texture region.
     *
     * @param region texture region to use
     * @param width  width of the sprite
     * @param height height of the sprite
     * @param path   original asset path
     */
    public SpriteComponent(TextureRegion region, float width, float height, String path) {

        sprite = new Sprite(region);
        sprite.setColor(Color.WHITE);
        sprite.setSize(width, height);
        sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
        this.path = path;
    }

    public Sprite getSprite(){
        return sprite;
    }

    public String getPath() {
        return path;
    }

    /**
     * Repeats the texture across the sprite instead of stretching it, scaled so that one tile fits the
     * sprite's shorter side. Used for the blocks of game mode arenas, whose textures are seamless tiles.
     * Textures whose sides are not powers of two cannot repeat on OpenGL ES 2, so those are left
     * stretched on mobile.
     */
    public void tile() {
        if (texture == null) return;
        int textureWidth = texture.getWidth();
        int textureHeight = texture.getHeight();
        boolean powerOfTwo = MathUtils.isPowerOfTwo(textureWidth) && MathUtils.isPowerOfTwo(textureHeight);
        if (!powerOfTwo && Gdx.app.getType() != Application.ApplicationType.Desktop) return;

        float width = sprite.getWidth();
        float height = sprite.getHeight();
        float scale = Math.min(width / textureWidth, height / textureHeight);
        texture.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);
        sprite.setRegion(0, 0, Math.round(width / scale), Math.round(height / scale));
        sprite.setSize(width, height);
        sprite.setOrigin(width / 2, height / 2);
    }

}
