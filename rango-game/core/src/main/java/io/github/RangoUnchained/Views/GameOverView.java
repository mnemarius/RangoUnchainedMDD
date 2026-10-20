package io.github.RangoUnchained.Views;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import io.github.RangoUnchained.Controllers.GameController;
import io.github.RangoUnchained.Controllers.LevelController;
import io.github.RangoUnchained.Model.Firebase.FirebaseManager;
import io.github.RangoUnchained.Model.level.GameFileHandler;
import io.github.RangoUnchained.Modes.GameModeDefinition;
import io.github.RangoUnchained.Views.Utils.BaseScreen;
import io.github.RangoUnchained.Views.Utils.ButtonFactory;
import io.github.RangoUnchained.Views.Utils.HintUtil;
import io.github.RangoUnchained.Views.Utils.LabelFactory;

public class GameOverView extends BaseScreen {

    private int levelNumber;
    private int score;
    private Label scoreLabel;

    boolean completed;
    /** The game mode that was played, or null for campaign levels. */
    private GameModeDefinition mode;

    public GameOverView(int levelNumber, boolean completed) {
        super(GameController.getInstance());
        this.levelNumber = levelNumber;
        this.score = LevelController.getInstance().getScore();
        this.completed = completed;
    }

    // Constructor for game modes, whose scores are not saved to the level scoreboards
    public GameOverView(GameModeDefinition mode, boolean completed) {
        this(-1, completed);
        this.mode = mode;
    }

    @Override
    public void show() {
        super.show();
        createUI();
        if (mode != null) {
            scoreLabel.setText("Score: " + score);
            return;
        }
        saveScoreToFirebase(this.levelNumber);
    }

    private void saveScoreToFirebase(int levelNumber) {
        game.getFirebaseManager().updateScoreForLevel(GameController.getInstance().getCurrentUser(), levelNumber, score, new FirebaseManager.Callback<Boolean>() {
            @Override
            public void onSuccess(Boolean isHighscore) {
                if (isHighscore) {
                    scoreLabel.setText("New highscore! Score: " + score);
                } else {
                    scoreLabel.setText("Score: " + score);
                }
            }

            @Override
            public void onError(Exception e) {
                System.err.println("Failed to save score: " + e.getMessage());
                scoreLabel.setText("Score: " + score);
            }
        });
    }

    private void createUI() {
        String titleText = mode != null ? mode.title() + (completed ? " won" : " lost")
            : completed ? "Level Completed" : "Level Failed";

        Label titleLabel = LabelFactory.createLabel(titleText, getSkin(), "defaultFont", null);
        scoreLabel = LabelFactory.createLabel("", getSkin(), "defaultFont", null);

        Table table = new Table();
        table.setFillParent(true);
        table.center();

        // Title label
        table.add(titleLabel).center().padBottom(10);
        table.row();
        // Score label
        table.add(scoreLabel).center().padBottom(10);
        table.row();
        // Hint label
        Label hintLabel = LabelFactory.createLabel(HintUtil.getHint(), getSkin(), "defaultFont", null);
        table.add(hintLabel).center().padBottom(50);
        table.row();



        // Retry button (goes back to level selection)
        if (mode != null) {
            ButtonFactory.createDefaultButton("Play again", () -> game.setView(new GamePlayView(mode)), table);
            ButtonFactory.createDefaultButton("Game modes", () -> game.setView(new SelectModeView()), table);
        } else {
            ButtonFactory.createDefaultButton("Play again", () -> game.setView(new SelectLevelView()), table);
        }

         // Retry button (goes back to level selection)
         if (mode == null && levelNumber < 5 && (completed || GameFileHandler.getInstance().getProgress() > levelNumber)) {
            ButtonFactory.createDefaultButton("Next level", () -> game.setView(new GamePlayView(levelNumber+1)), table);
         }

        ButtonFactory.createDefaultButton("Scoreboard", () -> game.setView(new ScoreboardView()), table);

        // Back to main menu button
        ButtonFactory.createDefaultButton("Main Menu", () -> game.setView(new MainMenuView()), table);

        stage.addActor(table);
    }
}
