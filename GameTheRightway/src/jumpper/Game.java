package jumpper;

import javax.swing.*;

public class Game {

    public String title;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public static GamePanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game.panel = new GamePanel();
        frame.add(Game.panel);
        frame.pack();
        frame.setVisible(true);
    }
}