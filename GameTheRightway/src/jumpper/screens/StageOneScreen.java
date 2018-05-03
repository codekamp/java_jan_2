package jumpper.screens;

import jumpper.Game;
import jumpper.Resources;
import jumpper.entities.Block;
import jumpper.entities.Entity;

import java.awt.*;

public class StageOneScreen extends Screen {

    private static final int GRASS_Y_CORD = Game.HEIGHT - 45;
    private static final int BLOCK_STARTING_X_CORD = 980;
    private static final int BLOCK_GAP = 200;
    private static final int BLOCK_Y_CORD = GRASS_Y_CORD - 50;
    private static final int BLOCK_X_VEL = -5;

    public  StageOneScreen() {
        this.entities.add(new Block(BLOCK_STARTING_X_CORD, BLOCK_Y_CORD, BLOCK_X_VEL, 0));
        this.entities.add(new Block(BLOCK_STARTING_X_CORD + BLOCK_GAP, BLOCK_Y_CORD, BLOCK_X_VEL, 0));
        this.entities.add(new Block(BLOCK_STARTING_X_CORD + 2*BLOCK_GAP, BLOCK_Y_CORD, BLOCK_X_VEL, 0));
        this.entities.add(new Block(BLOCK_STARTING_X_CORD + 3*BLOCK_GAP, BLOCK_Y_CORD, BLOCK_X_VEL, 0));
        this.entities.add(new Block(BLOCK_STARTING_X_CORD + 4*BLOCK_GAP, BLOCK_Y_CORD, BLOCK_X_VEL, 0));
    }

    @Override
    public void update() {
        super.update();

        for (Entity e: this.entities) {
            if(e.getX() <= - e.getWidth()) {
                e.setX(BLOCK_STARTING_X_CORD);
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Resources.getSkyColor());
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, GRASS_Y_CORD, null);
        super.draw(g);
    }


}