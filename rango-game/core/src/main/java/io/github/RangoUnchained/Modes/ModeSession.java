package io.github.RangoUnchained.Modes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Components.BodyComponent;
import io.github.RangoUnchained.Model.Components.Component;
import io.github.RangoUnchained.Model.Components.HealthComponent;
import io.github.RangoUnchained.Model.Components.ModeBallComponent;
import io.github.RangoUnchained.Model.Components.ModePowerUpComponent;
import io.github.RangoUnchained.Model.Components.SpeedComponent;
import io.github.RangoUnchained.Model.Components.TriggerComponent;
import io.github.RangoUnchained.Model.Entities.BallEntity;
import io.github.RangoUnchained.Model.Entities.Entity;
import io.github.RangoUnchained.Model.Entities.PlayerEntity;
import io.github.RangoUnchained.Model.Entities.PowerUpEntity;
import io.github.RangoUnchained.Model.Factories.TriggerFactory;
import io.github.RangoUnchained.Model.level.GameLevel;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData.Dimension;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData.TypeInfo;
import io.github.RangoUnchained.Views.Utils.Constants;

/**
 * A round of a game mode in progress. The session runs what the generated
 * {@link GameModeDefinition} decides: it schedules the waves, carries out the effects on the player,
 * moves things through teleporters, and keeps the statistics that win and lose conditions check.
 */
public class ModeSession implements ModeContext, ModeStats, Spawner, ArenaBuilder {

    private static final float TELEPORT_COOLDOWN = 1f;
    private static final String SHIELD = "shield";
    private static final String SPEED = "speed";
    private static final String POISON = "poison";

    private final GameModeDefinition mode;
    private final Random random = new Random();

    private float elapsed;
    private int popped;
    private int wavesCleared;
    private int nextWave;
    private int cycle;
    private boolean waveRunning;
    private boolean wavesFinished;
    private float calm;
    /** Frames to wait before counting balls: spawn requests are carried out on the next frame. */
    private int settleFrames = 2;
    private float grace;

    private final List<TimedEffect> effects = new ArrayList<TimedEffect>();
    private final Map<String, Vector2> teleporters = new HashMap<String, Vector2>();
    private final List<Teleport> teleports = new ArrayList<Teleport>();
    private final Map<Entity, Float> teleportCooldowns = new HashMap<Entity, Float>();

    public ModeSession(GameModeDefinition mode) {
        this.mode = mode;
    }

    /** The session of the mode being played, or null when a campaign level is played. */
    public static ModeSession active() {
        return LevelController.getInstance().getModeSession();
    }

    public GameModeDefinition getMode() {
        return mode;
    }

    /** Advances the round by one frame. Called after the physics step, so bodies may be moved. */
    public void update(float delta) {
        elapsed += delta;
        if (grace > 0) {
            grace -= delta;
        }
        updateEffects(delta);
        performTeleports(delta);
        updateWaves(delta);
        if (settleFrames > 0) {
            settleFrames--;
        }
    }

    public boolean isLost() {
        return mode.isLost(this);
    }

    public boolean isWon() {
        return !isLost() && mode.isWon(this);
    }

    // ------------------------------------------------------------------ waves

    private void updateWaves(float delta) {
        if (mode.waveCount() == 0 || wavesFinished) {
            return;
        }
        if (!waveRunning) {
            calm += delta;
            if (calm >= mode.waveDelay(nextWave)) {
                mode.spawnWave(nextWave, cycle, this);
                waveRunning = true;
                settleFrames = 2;
                calm = 0;
            }
        } else if (settleFrames == 0 && ballsAlive() == 0) {
            waveRunning = false;
            wavesCleared++;
            nextWave++;
            if (nextWave >= mode.waveCount()) {
                if (mode.loopsWaves()) {
                    nextWave = 0;
                    cycle++;
                } else {
                    wavesFinished = true;
                }
            }
        }
    }

    // ------------------------------------------------------------------ contacts

    /** The tongue has hit a ball. */
    public void pop(BallEntity ball) {
        ModeBallComponent modeBall = (ModeBallComponent) ball.getComponent(ModeBallComponent.class);
        if (modeBall == null || modeBall.isPopped()) {
            return;
        }
        modeBall.setPopped();
        BallState state = stateOf(ball);
        LevelController.getInstance().handleRemovalRequests(ball);
        popped++;
        mode.onBallPopped(state, this);
    }

    /** A ball has touched the player. */
    public void touch(BallEntity ball) {
        ModeBallComponent modeBall = (ModeBallComponent) ball.getComponent(ModeBallComponent.class);
        if (modeBall == null || modeBall.isPopped()) {
            return;
        }
        mode.onBallTouchesPlayer(stateOf(ball), this);
    }

    /** The player has caught a power-up. */
    public void caught(PowerUpEntity powerUp) {
        ModePowerUpComponent modePowerUp = (ModePowerUpComponent) powerUp.getComponent(ModePowerUpComponent.class);
        if (modePowerUp == null || modePowerUp.isTaken()) {
            return;
        }
        modePowerUp.setTaken();
        LevelController.getInstance().handleRemovalRequests(powerUp);
        mode.onPowerUpCaught(modePowerUp.name, this);
    }

    private BallState stateOf(BallEntity ball) {
        ModeBallComponent modeBall = (ModeBallComponent) ball.getComponent(ModeBallComponent.class);
        Body body = bodyOf(ball);
        Vector2 position = body.getPosition();
        Vector2 velocity = body.getLinearVelocity();
        return new BallState(modeBall.kind.name, modeBall.size, position.x * Constants.PPM,
            position.y * Constants.PPM, velocity.x, velocity.y);
    }

    // ------------------------------------------------------------------ ModeStats

    @Override
    public float elapsed() {
        return elapsed;
    }

    @Override
    public int score() {
        GameLevel level = LevelController.getInstance().getLevel();
        return level == null ? 0 : level.getScore();
    }

    @Override
    public int popped() {
        return popped;
    }

    @Override
    public int wavesCleared() {
        return wavesCleared;
    }

    @Override
    public int ballsAlive() {
        GameLevel level = LevelController.getInstance().getLevel();
        if (level == null) {
            return 0;
        }
        int alive = 0;
        for (BallEntity ball : level.getEntity(BallEntity.class)) {
            ModeBallComponent modeBall = (ModeBallComponent) ball.getComponent(ModeBallComponent.class);
            if (modeBall == null || !modeBall.isPopped()) {
                alive++;
            }
        }
        return alive;
    }

    @Override
    public int playerHealth() {
        return LevelController.getInstance().getPlayerHealth();
    }

    @Override
    public boolean cleared() {
        return settleFrames == 0 && ballsAlive() == 0 && (mode.waveCount() == 0 || wavesFinished);
    }

    // ------------------------------------------------------------------ ModeContext

    @Override
    public void addScore(float points) {
        GameLevel level = LevelController.getInstance().getLevel();
        if (level != null) {
            level.scoreManager.addScore(points);
        }
    }

    @Override
    public float speedBonus() {
        return Math.max(1f, 2f - elapsed / 60f);
    }

    @Override
    public float random() {
        return random.nextFloat();
    }

    @Override
    public void split(BallState ball, String kind, int fragments, float launchSpeed) {
        if (ball.size <= 1 || fragments <= 0) {
            return;
        }
        for (int i = 0; i < fragments; i++) {
            float vx = fragments == 1 ? Math.signum(ball.vx == 0 ? 1 : ball.vx) * 2f : -2f + 4f * i / (fragments - 1);
            float offset = (i - (fragments - 1) / 2f) * 35f;
            spawnBall(kind, ball.size - 1, ball.x + offset, ball.y + 10f, vx * launchSpeed / 5f, launchSpeed);
        }
    }

    @Override
    public void burst(BallState ball, String kind, int fragments, float launchSpeed) {
        if (ball.size <= 1 || fragments <= 0) {
            return;
        }
        for (int i = 0; i < fragments; i++) {
            double angle = 2 * Math.PI * i / fragments;
            spawnBall(kind, ball.size - 1, ball.x, ball.y + 10f,
                (float) Math.cos(angle) * launchSpeed, (float) Math.sin(angle) * launchSpeed);
        }
    }

    @Override
    public void dropPowerUp(String powerUp, BallState from) {
        EntityData data = new EntityData();
        data.name = "Powerup " + powerUp;
        data.typeInfo = new TypeInfo();
        data.typeInfo.type = "Powerup";
        data.typeInfo.subType = powerUp;
        data.typeInfo.sprite = mode.powerUpSprite(powerUp);
        data.dimension = new Dimension();
        data.dimension.x = from.x;
        data.dimension.y = from.y + 50f;
        data.velocity = new Vector2(random.nextFloat() * 8f - 4f, random.nextFloat() * 3f + 3f);
        LevelController.getInstance().handleSpawnRequests(data);
    }

    @Override
    public void damage(int amount) {
        HealthComponent health = playerComponent(HealthComponent.class);
        if (health == null || health.isShieldActive() || grace > 0) {
            return;
        }
        for (int i = 0; i < amount; i++) {
            health.decreaseHealth();
        }
        grace = mode.player().graceTime;
    }

    @Override
    public void heal(int amount) {
        HealthComponent health = playerComponent(HealthComponent.class);
        if (health == null) {
            return;
        }
        health.addHealth(amount);
        int max = mode.player().maxHealth;
        if (max > 0 && health.getHealth() > max) {
            health.setHealth(max);
        }
    }

    @Override
    public void shield(float duration, String icon) {
        start(SHIELD, icon, duration);
        HealthComponent health = playerComponent(HealthComponent.class);
        if (health != null) {
            health.setShieldActive(true);
        }
    }

    @Override
    public void changeSpeed(float factor, float duration, String icon) {
        start(SPEED, icon, duration).factor = factor;
        applySpeed();
    }

    @Override
    public void poison(int amount, float interval, float duration, String icon) {
        TimedEffect effect = start(POISON, icon, duration);
        effect.amount = amount;
        effect.interval = interval > 0 ? interval : 1f;
    }

    /** The icons of the timed effects that are active on the player, for the HUD. */
    public List<String> activeEffectIcons() {
        List<String> icons = new ArrayList<String>();
        for (TimedEffect effect : effects) {
            if (effect.icon != null && !icons.contains(effect.icon)) {
                icons.add(effect.icon);
            }
        }
        return icons;
    }

    private TimedEffect start(String kind, String icon, float duration) {
        for (TimedEffect effect : effects) {
            if (effect.kind.equals(kind) && (effect.icon == null ? icon == null : effect.icon.equals(icon))) {
                effect.remaining = duration;
                return effect;
            }
        }
        TimedEffect effect = new TimedEffect(kind, icon, duration);
        effects.add(effect);
        return effect;
    }

    private void updateEffects(float delta) {
        boolean speedChanged = false;
        boolean shielded = false;
        Iterator<TimedEffect> iterator = effects.iterator();
        while (iterator.hasNext()) {
            TimedEffect effect = iterator.next();
            effect.remaining -= delta;
            if (POISON.equals(effect.kind)) {
                effect.tick += delta;
                while (effect.tick >= effect.interval) {
                    effect.tick -= effect.interval;
                    poisonTick(effect.amount);
                }
            }
            if (effect.remaining <= 0) {
                iterator.remove();
                speedChanged |= SPEED.equals(effect.kind);
            } else {
                shielded |= SHIELD.equals(effect.kind);
            }
        }
        HealthComponent health = playerComponent(HealthComponent.class);
        if (health != null) {
            health.setShieldActive(shielded);
        }
        if (speedChanged) {
            applySpeed();
        }
    }

    private void poisonTick(int amount) {
        HealthComponent health = playerComponent(HealthComponent.class);
        if (health == null || health.isShieldActive()) {
            return;
        }
        for (int i = 0; i < amount; i++) {
            health.decreaseHealth();
        }
    }

    private void applySpeed() {
        SpeedComponent speed = playerComponent(SpeedComponent.class);
        if (speed == null) {
            return;
        }
        float factor = 1f;
        for (TimedEffect effect : effects) {
            if (SPEED.equals(effect.kind)) {
                factor *= effect.factor;
            }
        }
        speed.setCurrentSpeed(speed.getBaseSpeed() * factor);
    }

    // ------------------------------------------------------------------ Spawner

    @Override
    public void spawn(String kind, int size, int count, float x, float y, int direction) {
        for (int i = 0; i < count; i++) {
            float offset = (i - (count - 1) / 2f) * 8f;
            float spreadX = Math.max(3f, Math.min(97f, x + offset));
            spawnBall(kind, size, ArenaGeometry.x(spreadX), ArenaGeometry.y(y), direction * 2f, 0f);
        }
    }

    private void spawnBall(String kind, int size, float x, float y, float vx, float vy) {
        EntityData data = new EntityData();
        data.name = "Ball " + kind;
        data.typeInfo = new TypeInfo();
        data.typeInfo.type = "Ball";
        data.typeInfo.subType = kind;
        data.typeInfo.size = size;
        data.dimension = new Dimension();
        data.dimension.x = x;
        data.dimension.y = y;
        data.velocity = new Vector2(vx, vy);
        LevelController.getInstance().handleSpawnRequests(data);
    }

    // ------------------------------------------------------------------ ArenaBuilder

    @Override
    public void jumpPad(String name, float x, float y, final float launch, boolean balls, boolean player) {
        TriggerComponent trigger = new TriggerComponent(balls, player, entity -> {
            Body body = bodyOf(entity);
            if (body != null) {
                body.setLinearVelocity(body.getLinearVelocity().x, launch);
            }
        });
        LevelController.getInstance().addEntity(
            TriggerFactory.create(ArenaGeometry.x(x), ArenaGeometry.y(y), 96f, 24f, "Obstacles/JumpPad.png", trigger));
    }

    @Override
    public void teleporter(String name, float x, float y, final String target, boolean balls, boolean player) {
        float px = ArenaGeometry.x(x);
        float py = ArenaGeometry.y(y);
        teleporters.put(name, new Vector2(px, py));
        TriggerComponent trigger = new TriggerComponent(balls, player, entity -> requestTeleport(entity, target));
        LevelController.getInstance().addEntity(
            TriggerFactory.create(px, py, 64f, 96f, "Obstacles/Teleporter.png", trigger));
    }

    private void requestTeleport(Entity entity, String target) {
        Vector2 destination = teleporters.get(target);
        if (destination == null || teleportCooldowns.containsKey(entity)) {
            return;
        }
        teleportCooldowns.put(entity, TELEPORT_COOLDOWN);
        teleports.add(new Teleport(entity, destination));
    }

    /** Moves the bodies queued during the physics step, when Box2D allows it. */
    private void performTeleports(float delta) {
        GameLevel level = LevelController.getInstance().getLevel();
        for (Teleport teleport : teleports) {
            ModeBallComponent modeBall = (ModeBallComponent) teleport.entity.getComponent(ModeBallComponent.class);
            boolean gone = level == null || !level.getEntities().contains(teleport.entity)
                || (modeBall != null && modeBall.isPopped());
            Body body = bodyOf(teleport.entity);
            if (!gone && body != null) {
                body.setTransform(teleport.destination.x / Constants.PPM, teleport.destination.y / Constants.PPM,
                    body.getAngle());
            }
        }
        teleports.clear();
        Iterator<Map.Entry<Entity, Float>> cooldowns = teleportCooldowns.entrySet().iterator();
        while (cooldowns.hasNext()) {
            Map.Entry<Entity, Float> cooldown = cooldowns.next();
            cooldown.setValue(cooldown.getValue() - delta);
            if (cooldown.getValue() <= 0) {
                cooldowns.remove();
            }
        }
    }

    // ------------------------------------------------------------------ helpers

    private static Body bodyOf(Entity entity) {
        BodyComponent body = (BodyComponent) entity.getComponent(BodyComponent.class);
        return body == null ? null : body.getBody();
    }

    private <T extends Component> T playerComponent(Class<T> type) {
        GameLevel level = LevelController.getInstance().getLevel();
        if (level == null) {
            return null;
        }
        List<PlayerEntity> players = level.getEntity(PlayerEntity.class);
        return players.isEmpty() ? null : type.cast(players.get(0).getComponent(type));
    }

    private static final class TimedEffect {
        final String kind;
        final String icon;
        float remaining;
        float factor = 1f;
        int amount;
        float interval = 1f;
        float tick;

        TimedEffect(String kind, String icon, float remaining) {
            this.kind = kind;
            this.icon = icon;
            this.remaining = remaining;
        }
    }

    private static final class Teleport {
        final Entity entity;
        final Vector2 destination;

        Teleport(Entity entity, Vector2 destination) {
            this.entity = entity;
            this.destination = destination;
        }
    }
}
