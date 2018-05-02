package jumpper.screens;

import java.awt.*;

abstract public class Screen {
    abstract public void update();
    abstract public void draw(Graphics g);

    public void onClick(int x, int y) {

    }

    public void onKeyPress(int keyCode) {

    }
}