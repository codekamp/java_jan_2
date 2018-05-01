package jumpper;


import jumpper.screens.Screen;
import jumpper.screens.WelcomeScreen;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    public Screen currentScreen;

    public GamePanel() {
        this.setPreferredSize(new Dimension(Game.width, Game.height));
    }

    @Override
    public void addNotify() {
        super.addNotify();


        this.currentScreen = new WelcomeScreen();
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                continue;
            }

            // update
            // draw

            Graphics g = this.getGraphics();

            this.currentScreen.update();
            this.currentScreen.draw(g);
            g.dispose();
        }
    }
}