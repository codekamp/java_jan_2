package jumpper;


import jumpper.screens.Screen;
import jumpper.screens.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable, MouseListener, KeyListener {

    private Screen currentScreen;

    public GamePanel() {
        this.setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        this.setFocusable(true);
        this.addMouseListener(this);
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        Resources.load();
        this.currentScreen = new WelcomeScreen();
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        Image bigImage = new BufferedImage(Game.WIDTH, Game.HEIGHT, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                continue;
            }

            // update
            // draw

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGrahics = bigImage.getGraphics();

            imageGrahics.clearRect(0, 0, Game.WIDTH, Game.HEIGHT);
            this.currentScreen.update();
            this.currentScreen.draw(imageGrahics);

            panelGraphics.drawImage(bigImage, 0, 0, null);
            imageGrahics.dispose();
            panelGraphics.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // do nothing
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.currentScreen.onClick(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // do nothing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // do nothing
    }

    public void setCurrentScreen(Screen s) {
        this.currentScreen = s;
        System.gc();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // do nothing
    }
}