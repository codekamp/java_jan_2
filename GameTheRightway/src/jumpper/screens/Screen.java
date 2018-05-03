package jumpper.screens;

import jumpper.entities.Entity;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

abstract public class Screen {

    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity e: this.entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for (Entity e: this.entities) {
            if(e.isVisible()) {
                g.drawImage(e.getImage(), e.getX(), e.getY(), null);
            }
        }
    }

    public void onClick(int x, int y) {

    }

    public void onKeyPress(int keyCode) {

    }
}