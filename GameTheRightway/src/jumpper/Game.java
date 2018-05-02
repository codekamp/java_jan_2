package jumpper;

import javax.swing.*;

public class Game {

    public String title;

    public static final int width = 800;
    public static final int height = 450;

    public static GamePanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Game.panel = new GamePanel();

        frame.add(Game.panel);
        frame.pack();
        frame.setVisible(true);
    }
}