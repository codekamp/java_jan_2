package jumpper.screens;

import jumpper.Game;
import jumpper.Resources;

import java.awt.*;

public class GameOverScreen extends Screen {

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.setColor(Color.GREEN);
        g.drawString("Game Over", 100, 100);
        g.drawString("Press any key to continue", 100, 200);
    }

    @Override
    public void onKeyPress(int keyCode) {
        Game.panel.setCurrentScreen(new StageOneScreen());
    }
}