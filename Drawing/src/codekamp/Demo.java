package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo implements KeyListener {
    private int xVel = 2;
    private int yVel = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(800, 450));
        p.setFocusable(true);

        Demo d1 = new Demo();

        p.addKeyListener(d1);

        frame.add(p);

        frame.pack();
        frame.setVisible(true);


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }

        p.requestFocus();

        Graphics g = p.getGraphics();
        g.setColor(Color.GREEN);


        int x = 0;
        int y = 100;

        while (true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }

            x += d1.xVel;
            y += d1.yVel;

            g.clearRect(0, 0, 800, 450);
            g.fillArc(x, y, 100, 100, 0, 360);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.xVel = 0;
            this.yVel = 2;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            this.xVel = 0;
            this.yVel = -2;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.xVel = -2;
            this.yVel = 0;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.xVel = 2;
            this.yVel = 0;
        } else {
            System.out.println("Some faltu key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}