package jumpper;

import javax.swing.*;

public class Game {

    public static final int width = 800;
    public static final int height = 450;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}