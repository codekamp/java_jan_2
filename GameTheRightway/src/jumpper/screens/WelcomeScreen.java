package jumpper.screens;

import jumpper.Game;
import jumpper.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen {

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(Resources.getWelcomeImage(), 0, 0, null);
    }

    @Override
    public void onClick(int x, int y) {
        Game.panel.setCurrentScreen(new StageOneScreen());
    }
}