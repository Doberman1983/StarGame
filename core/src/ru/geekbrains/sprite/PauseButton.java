package ru.geekbrains.sprite;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.base.ScaledButton;
import ru.geekbrains.math.Rect;
import ru.geekbrains.screen.GameScreen;

public class PauseButton extends ScaledButton {

    private static final float MARGIN = 0.05f;
    private GameScreen screen;

    public PauseButton(TextureAtlas atlas, GameScreen screen) {
        super(atlas.findRegion("pause"));
        this.screen = screen;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        setBottom(worldBounds.getTop() - 0.2f);
        setRight(worldBounds.getRight() - 0.02f);
    }

    @Override
    public void action() {
        screen.toggle(true);


    }
}
