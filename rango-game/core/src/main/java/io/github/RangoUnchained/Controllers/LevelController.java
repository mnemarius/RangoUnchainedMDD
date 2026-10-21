package io.github.RangoUnchained.Controllers;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import io.github.RangoUnchained.Model.Components.HealthComponent;
import io.github.RangoUnchained.Model.Components.PowerUpComponent;
import io.github.RangoUnchained.Model.ContactStrategies.ContactStrategies;
import io.github.RangoUnchained.Model.Entities.EnemyEntity;
import io.github.RangoUnchained.Model.Entities.Entity;
import io.github.RangoUnchained.Model.Entities.PlayerEntity;
import io.github.RangoUnchained.Model.Systems.AudioSystem;
import io.github.RangoUnchained.Model.Systems.HealthSystem;
import io.github.RangoUnchained.Model.Systems.InputSystem;
import io.github.RangoUnchained.Model.Systems.PhysicsSystem;
import io.github.RangoUnchained.Model.Systems.PowerUpSystem;
import io.github.RangoUnchained.Model.Systems.Systems;
import io.github.RangoUnchained.Model.level.RemovalQueue;
import io.github.RangoUnchained.Model.level.SpawnQueue;
import io.github.RangoUnchained.Model.Systems.SystemManager;
import io.github.RangoUnchained.Model.level.GameFileHandler;
import io.github.RangoUnchained.Model.level.GameLevel;
import io.github.RangoUnchained.Model.level.GameLevel.LevelData.EntityData;
import io.github.RangoUnchained.Modes.GameModeDefinition;
import io.github.RangoUnchained.Modes.ModeContactRules;
import io.github.RangoUnchained.Modes.ModeProgress;
import io.github.RangoUnchained.Modes.ModeSession;

public class LevelController {

    private static LevelController levelController;

    public boolean completed = false;
    private GameLevel level;
    private SystemManager systemManager;
    private SpawnQueue spawnQueue;
    private RemovalQueue removalQueue;
    private boolean isActive = true;
    /** The game mode being played, or null when the tutorial or a multiplayer level is played. */
    private ModeSession modeSession;


    private LevelController () {
    }

    public static LevelController getInstance(){
        if (levelController == null) {
            levelController = new LevelController();
        }
        return levelController;
    }

    public static void resetInstance() {
        if (levelController != null) {
            levelController.dispose();
            levelController = null;
        }
    }

    /** adds entity to level */
    public void addEntity(Entity e) {
        level.addEntity(e);
    }

    public void handleRemovalRequests(Entity entity) {
       removalQueue.addRemovalRequest(entity);
    }

    public void handleSpawnRequests(EntityData entityData) {
        spawnQueue.addSpawnRequest(entityData, getWorld());
    }


    public void excecuteSpawnQueue() {
        level.spawn(spawnQueue.retrieveSpawningEntities(),1);
    }

    public void excecuteRemovelQueue() {
        level.removeEntities(removalQueue.getRemovalEntities(getWorld()));
    }

    // Initializes systems with entities
    public void initializeSystems(int levelNumber) {
        this.isActive = true;
        this.modeSession = null;
        this.systemManager = new SystemManager();
        this.level = new GameLevel(levelNumber);
        this.spawnQueue = new SpawnQueue();
        this.removalQueue = new RemovalQueue();
        ContactStrategies ContactStrategies = new ContactStrategies();

        getSystem(PhysicsSystem.class).setContactStrategies();
        getSystem(HealthSystem.class).setContactStrategies();
        getSystem(PowerUpSystem.class).setContactStrategies();
        getSystem(AudioSystem.class).setContactStrategies();

        level.initializeCheckpoint();
    }

    /**
     * Initializes systems for a round of a game mode: one of its levels, counting from 0. The rules of
     * the mode replace the fixed contact strategies of the tutorial and multiplayer levels; game modes
     * keep no checkpoints.
     */
    public void initializeMode(GameModeDefinition mode, int levelNumber) {
        this.isActive = true;
        this.systemManager = new SystemManager();
        getWorld().setGravity(new Vector2(0, -mode.gravity()));
        this.modeSession = new ModeSession(mode, levelNumber);
        this.spawnQueue = new SpawnQueue();
        this.removalQueue = new RemovalQueue();
        this.level = new GameLevel(mode, levelNumber);

        getSystem(PhysicsSystem.class).setContactStrategies();
        getSystem(AudioSystem.class).setContactStrategies();
        new ModeContactRules(modeSession).setContactStrategies();

        mode.buildArena(levelNumber, modeSession);
    }

    /** The game mode being played, or null when the tutorial or a multiplayer level is played. */
    public ModeSession getModeSession() {
        return modeSession;
    }

    /**updates all entities with the appropiate systems */
    public void update(float delta) {
        if (modeSession != null) {
            excecuteRemovelQueue();
            excecuteSpawnQueue();
            systemManager.update(level.getEntities(), delta);
            level.getTimer().update(delta);
            modeSession.update(delta);
            return;
        }

        excecuteRemovelQueue();
        excecuteSpawnQueue();
        checkpoint(delta);

        systemManager.update(level.getEntities(), delta);
        level.getTimer().update(delta);
    }

    public boolean isGameOver() {
        if (getLevel() == null) {
            return false;
        }
        if (modeSession != null) {
            if (modeSession.isWon()) {
                ModeProgress.complete(modeSession.getMode(), modeSession.getLevel());
                return true;
            }
            return modeSession.isLost();
        }
        if (hasDied()){
            level.resetCheckpoint();
            return true;
        }

        if (isCompleted()){
            int levelNumber = getLevel().levelNumber;
            if (levelNumber >= GameFileHandler.getInstance().getProgress()) {
                GameFileHandler.getInstance();
                GameFileHandler.setProgress(levelNumber+1);
            }
            level.resetCheckpoint();
            return true;
        }
        return false;
    }

    private boolean hasDied(){
        return (getPlayerHealth()<= 0);
    }

    public boolean isCompleted(){
        if (level == null) {
            return false;
        }
        if (modeSession != null) {
            return modeSession.isWon();
        }
        int levelNumber = getLevel().levelNumber;
        if (levelNumber == 0 &&! completed){
            return false;
        }
        return (level.getEntity(EnemyEntity.class).size() == 0);
    }

    public void step(float f, int i, int j) {
        systemManager.getWorld().step(f, i, j);
    }

    public ArrayList<Entity> getEntities(){
        return level.getEntities();
    }

    public World getWorld() {
        return systemManager.getWorld();
    }

    public AudioSystem getAudioSystem(){return systemManager != null ? systemManager.getSystem(AudioSystem.class) : null;}

    public <T extends Systems> T getSystem(Class<T> systemClass) {
        if (!isActive || systemManager == null) return null;
        return systemManager.getSystem(systemClass);
    }

    /**methdod for shooting, called from view */
    public void handleShoot() {
        if (level == null || level.getEntities() == null) {
            return;
        }

        InputSystem inputSystem = getSystem(InputSystem.class);
        if (inputSystem != null) {
            inputSystem.handleShoot(level.getEntities());
        }
    }

    public int getScore() {
        if (level == null) {
            return 0;
        }
        return level.scoreManager.getScore();
    }

    public GameLevel getLevel() {
        return this.level;
    }

    public int getPlayerHealth(){
        if (level == null){return 0;}
        ArrayList<PlayerEntity> entities= level.getEntity(PlayerEntity.class);
        if (entities.size()<=0){return 0;}

        int health = ((HealthComponent)(entities.get(0).getComponent(HealthComponent.class))).getHealth();
        return health;
    }

    public ArrayList<Integer> getPlayerActivePowerup(){
        ArrayList<Integer> list = new ArrayList<>();
        if (level == null){return list;}
        ArrayList<PlayerEntity> entities= level.getEntity(PlayerEntity.class);
        if (entities.size()<=0){return list;}

        list.addAll(((PowerUpComponent)(entities.get(0).getComponent(PowerUpComponent.class))).getActivePowerUps().keySet());
        return list;
    }

    public void checkpoint(float delta) {
        level.checkpoint(delta);
    }

    public void dispose() {
        isActive = false;
        modeSession = null;

        if (level != null) {
            level.dispose();
            level = null;
        }
        if (systemManager != null) {
            systemManager.dispose();
            systemManager = null;
        }
    }
}
