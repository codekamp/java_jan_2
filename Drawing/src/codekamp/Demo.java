package codekamp;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 450);

        JPanel p = new JPanel();
        frame.add(p);

        frame.setVisible(true);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }

        Graphics g = p.getGraphics();
//
//        g.setColor(Color.RED);
//        g.fillRect(10, 100, 50, 150);

        g.setColor(Color.GREEN);


        int x = 0;
        int y = 100;

        int xVel = 2;
        int yVel = 2;
        while (true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {

            }

            x += xVel;
            y += yVel;

            g.clearRect(0, 0, 800, 450);
            g.fillArc(x, y, 100, 100, 0, 360);
        }
    }
}