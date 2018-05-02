package jumpper.screens;

import jumpper.Game;

import java.awt.*;

public class WelcomeScreen extends Screen {

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, Game.width, Game.height);
        g.setColor(Color.red);
        g.fillRect(100, 100, 100, 50);
        g.fillRect(100, 180, 100, 50);
        g.fillRect(100, 260, 100, 50);

        g.setColor(Color.BLUE);
        g.drawString("Play", 120, 120);
        g.drawString("Settings", 120, 200);
        g.drawString("Exit", 120, 280);
    }

    @Override
    public void onClick(int x, int y) {
        if(x < 100 || x > 200) {
            return;
        }

        if(y >= 100 && y <= 150) {
            // play button clicked

            Game.panel.setCurrentScreen(new StageOneScreen());
        }
    }
}