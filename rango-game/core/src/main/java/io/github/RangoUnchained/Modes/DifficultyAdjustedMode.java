package io.github.RangoUnchained.Modes;

/**
 * A game mode played at a difficulty tier: the generated mode, with its values multiplied by the
 * factors of the difficulty. The rest of the game sees an ordinary {@link GameModeDefinition}, so the
 * generated modes do not depend on difficulties at all.
 */
public final class DifficultyAdjustedMode extends GameModeDefinition {

    private final GameModeDefinition mode;
    private final Difficulty difficulty;

    public DifficultyAdjustedMode(GameModeDefinition mode, Difficulty difficulty) {
        this.mode = mode;
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    @Override
    public String id() {
        return mode.id();
    }

    @Override
    public String title() {
        return mode.title() + " (" + difficulty.title + ")";
    }

    @Override
    public String description() {
        return mode.description();
    }

    @Override
    public int levelCount() {
        return mode.levelCount();
    }

    @Override
    public String levelTitle(int level) {
        return mode.levelTitle(level);
    }

    @Override
    public String arenaFile(int level) {
        return mode.arenaFile(level);
    }

    /** The player keeps at least one heart, and healing can always bring it back to its starting health. */
    @Override
    public PlayerSpec player() {
        PlayerSpec player = mode.player();
        float factor = difficulty.factor(Difficulty.PLAYER_HEALTH);
        int health = Math.max(1, Math.round(player.health * factor));
        int maxHealth = player.maxHealth > 0 ? Math.max(health, Math.round(player.maxHealth * factor)) : 0;
        return new PlayerSpec(player.character, health, maxHealth,
            player.speed * difficulty.factor(Difficulty.PLAYER_SPEED), player.tongueTime, player.cooldown,
            player.graceTime);
    }

    @Override
    public float gravity() {
        return mode.gravity();
    }

    @Override
    public EnemyKind enemyKind(String name) {
        EnemyKind kind = mode.enemyKind(name);
        if (kind == null) {
            return null;
        }
        return new EnemyKind(kind.name, kind.sprite, kind.scale, kind.bounce,
            kind.speed * difficulty.factor(Difficulty.ENEMY_SPEED));
    }

    @Override
    public String powerUpSprite(String name) {
        return mode.powerUpSprite(name);
    }

    @Override
    public float materialBounce(String material) {
        return mode.materialBounce(material);
    }

    @Override
    public void buildArena(int level, ArenaBuilder arena) {
        mode.buildArena(level, arena);
    }

    @Override
    public int waveCount(int level) {
        return mode.waveCount(level);
    }

    @Override
    public boolean loopsWaves(int level) {
        return mode.loopsWaves(level);
    }

    @Override
    public float waveDelay(int level, int wave) {
        return mode.waveDelay(level, wave) * difficulty.factor(Difficulty.WAVE_DELAY);
    }

    @Override
    public void spawnWave(int level, int wave, int cycle, Spawner spawner) {
        mode.spawnWave(level, wave, cycle, spawner);
    }

    @Override
    public void onEnemyPopped(EnemyState enemy, ModeContext context) {
        mode.onEnemyPopped(enemy, new AdjustedContext(context));
    }

    @Override
    public void onEnemyTouchesPlayer(EnemyState enemy, ModeContext context) {
        mode.onEnemyTouchesPlayer(enemy, context);
    }

    @Override
    public void onPowerUpCaught(String powerUp, ModeContext context) {
        mode.onPowerUpCaught(powerUp, context);
    }

    @Override
    public boolean isWon(ModeStats stats) {
        return mode.isWon(stats);
    }

    @Override
    public boolean isLost(ModeStats stats) {
        return mode.isLost(stats);
    }

    /** The round as seen by the rules of a pop: points and drop chances are scaled, the rest is passed on. */
    private final class AdjustedContext implements ModeContext {

        private final ModeContext context;

        AdjustedContext(ModeContext context) {
            this.context = context;
        }

        @Override
        public void addScore(float points) {
            context.addScore(points * difficulty.factor(Difficulty.ENEMY_POINTS));
        }

        @Override
        public boolean chance(float percent) {
            return context.chance(Math.min(100f, percent * difficulty.factor(Difficulty.DROP_CHANCE)));
        }

        @Override
        public float speedBonus(float maxFactor, float duration) {
            return context.speedBonus(maxFactor, duration);
        }

        @Override
        public float random() {
            return context.random();
        }

        @Override
        public void split(EnemyState enemy, String kind, int fragments, float spacing, float launchSpeed) {
            context.split(enemy, kind, fragments, spacing, launchSpeed);
        }

        @Override
        public void dropPowerUp(String powerUp, EnemyState from) {
            context.dropPowerUp(powerUp, from);
        }

        @Override
        public void damage(int amount) {
            context.damage(amount);
        }

        @Override
        public void heal(int amount) {
            context.heal(amount);
        }

        @Override
        public void shield(float duration, String icon) {
            context.shield(duration, icon);
        }

        @Override
        public void changeSpeed(float factor, float duration, String icon) {
            context.changeSpeed(factor, duration, icon);
        }

        @Override
        public void poison(int amount, float interval, float duration, String icon) {
            context.poison(amount, interval, duration, icon);
        }
    }
}
