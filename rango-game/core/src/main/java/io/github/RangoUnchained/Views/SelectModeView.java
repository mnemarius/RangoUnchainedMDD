package io.github.RangoUnchained.Views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import io.github.RangoUnchained.Controllers.GameController;
import io.github.RangoUnchained.Modes.GameModeDefinition;
import io.github.RangoUnchained.Modes.Generated.GeneratedEdition;
import io.github.RangoUnchained.Views.Utils.BaseScreen;
import io.github.RangoUnchained.Views.Utils.ButtonFactory;
import io.github.RangoUnchained.Views.Utils.LabelFactory;
import io.github.RangoUnchained.Views.Utils.ScrollUtil;

/**
 * Lists the game modes of the edition. The list is generated from the game mode model of the
 * edition (see {@link GeneratedEdition}).
 */
public class SelectModeView extends BaseScreen {

    public SelectModeView() {
        super(GameController.getInstance());
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
        table.add().expandX();
        table.center().row();

        for (final GameModeDefinition mode : GeneratedEdition.modes()) {
            table.row();
            ButtonFactory.createDefaultButton(mode.title(), () -> game.setView(new GamePlayView(mode)), table);
            table.row();
            LabelFactory.createLabel(mode.description(), getSkin(), "defaultFont", Color.BLACK, 0, table);
            table.row();
        }
        ScrollPane scrollPane = ScrollUtil.createStyledScrollPane(table);

        Gdx.app.postRunnable(() -> {
            scrollPane.layout();
            scrollPane.setScrollY(0);
            scrollPane.updateVisualScroll();
        });

        Table mainTable = new Table();
        mainTable.setFillParent(true);
        LabelFactory.createLabel("Game Modes", getSkin(), "titleFont", Color.BLACK, TITLE_PADDING, mainTable);
        mainTable.top().add(scrollPane).expandY().width(WORLD_WIDTH - 400).fill().row();
        mainTable.add(ButtonFactory.createButton("Back", getSkin(), game, () -> game.setView(new MainMenuView()),
            "customLoginStyle")).width(BUTTON_WIDTH).height(BUTTON_HEIGHT).padBottom(BUTTON_PADDING).padTop(20).row();
        stage.addActor(mainTable);
    }
}
