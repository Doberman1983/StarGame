package ru.geekbrains.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.base.ScaledButton;
import ru.geekbrains.math.Rect;
import ru.geekbrains.screen.GameScreen;

public class ResumeButton extends ScaledButton {

    private GameScreen screen;

    public ResumeButton(TextureAtlas atlas, GameScreen screen) {
        super(atlas.findRegion("resume"));
        this.screen = screen;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.2f);
        setLeft(0.0f-getHalfWidth());
        setBottom(0.0f-getHalfHeight());
    }

    @Override
    public void action() {
        screen.toggle(false);
    }
}
