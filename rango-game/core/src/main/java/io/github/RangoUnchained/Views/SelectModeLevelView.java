package io.github.RangoUnchained.Views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import io.github.RangoUnchained.Controllers.GameController;
import io.github.RangoUnchained.Modes.GameModeDefinition;
import io.github.RangoUnchained.Modes.ModeProgress;
import io.github.RangoUnchained.Views.Utils.BaseScreen;
import io.github.RangoUnchained.Views.Utils.ButtonFactory;
import io.github.RangoUnchained.Views.Utils.LabelFactory;
import io.github.RangoUnchained.Views.Utils.ScrollUtil;

/**
 * Lists the levels of a game mode with several levels. The levels unlocked so far (see
 * {@link ModeProgress}) can be played; the last of them is marked as the one to continue with.
 */
public class SelectModeLevelView extends BaseScreen {

    private final GameModeDefinition mode;

    public SelectModeLevelView(GameModeDefinition mode) {
        super(GameController.getInstance());
        this.mode = mode;
    }

    /** Opens a mode: a mode of one level starts at once, a mode of several shows its levels. */
    public static void open(GameController game, GameModeDefinition mode) {
        game.setView(mode.levelCount() > 1 ? new SelectModeLevelView(mode) : new GamePlayView(mode, 0));
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

        int unlocked = ModeProgress.unlocked(mode);
        for (int i = 0; i < mode.levelCount(); i++) {
            final int level = i;
            table.row();
            if (level == unlocked - 1 && level > 0) {
                LabelFactory.createLabel("(Continue)", getSkin(), "defaultFont", Color.BLACK, 0, table);
                table.row();
            }
            TextButton button = ButtonFactory.createButton((level + 1) + ". " + mode.levelTitle(level), getSkin(), game,
                () -> game.setView(new GamePlayView(mode, level)), "customLoginStyle");
            if (level >= unlocked) {
                button.setDisabled(true);
                button.setTouchable(Touchable.disabled);
                button.setColor(0.5f, 0.5f, 0.5f, 1);
            }
            table.add(button).width(300).height(60).center().padBottom(20);
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
        LabelFactory.createLabel(mode.title(), getSkin(), "titleFont", Color.BLACK, TITLE_PADDING, mainTable);
        mainTable.top().add(scrollPane).expandY().width(WORLD_WIDTH - 400).fill().row();
        mainTable.add(ButtonFactory.createButton("Back", getSkin(), game, () -> game.setView(new MainMenuView()),
            "customLoginStyle")).width(BUTTON_WIDTH).height(BUTTON_HEIGHT).padBottom(BUTTON_PADDING).padTop(20).row();
        stage.addActor(mainTable);
    }
}
