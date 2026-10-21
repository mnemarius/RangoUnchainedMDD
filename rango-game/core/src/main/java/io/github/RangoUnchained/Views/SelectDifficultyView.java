package io.github.RangoUnchained.Views;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import io.github.RangoUnchained.Controllers.GameController;
import io.github.RangoUnchained.Modes.Difficulty;
import io.github.RangoUnchained.Modes.DifficultyAdjustedMode;
import io.github.RangoUnchained.Modes.GameModeDefinition;
import io.github.RangoUnchained.Modes.Generated.GeneratedEdition;
import io.github.RangoUnchained.Views.Utils.BaseScreen;
import io.github.RangoUnchained.Views.Utils.ButtonFactory;
import io.github.RangoUnchained.Views.Utils.LabelFactory;

/**
 * Lets the player choose the difficulty of a mode before playing it, from easiest to hardest. The
 * difficulties are generated from the game mode model of the edition (see {@link GeneratedEdition});
 * the chosen one applies to every level of the mode.
 */
public class SelectDifficultyView extends BaseScreen {

    private final GameModeDefinition mode;

    public SelectDifficultyView(GameModeDefinition mode) {
        super(GameController.getInstance());
        this.mode = mode;
    }

    @Override
    public void show() {
        super.show();
        createUI();
    }

    private void createUI() {
        Table table = new Table();
        table.top().padTop(20);
        table.defaults().center();

        for (final Difficulty difficulty : GeneratedEdition.difficulties()) {
            ButtonFactory.createDefaultButton(difficulty.title,
                () -> SelectModeLevelView.open(game, new DifficultyAdjustedMode(mode, difficulty)), table);
        }

        Table mainTable = new Table();
        mainTable.setFillParent(true);
        LabelFactory.createLabel(mode.title(), getSkin(), "titleFont", Color.BLACK, TITLE_PADDING, mainTable);
        LabelFactory.createLabel("Choose difficulty", getSkin(), "defaultFont", Color.BLACK, 10, mainTable);
        mainTable.top().add(table).expandY().row();
        mainTable.add(ButtonFactory.createButton("Back", getSkin(), game, () -> game.setView(new MainMenuView()),
            "customLoginStyle")).width(BUTTON_WIDTH).height(BUTTON_HEIGHT).padBottom(BUTTON_PADDING).padTop(20).row();
        stage.addActor(mainTable);
    }
}
