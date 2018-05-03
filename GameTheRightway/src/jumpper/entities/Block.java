package jumpper.entities;

import jumpper.Resources;

import java.awt.*;

public class Block extends Entity {

    public Block(int x, int y, int xVel, int yVel) {
        super(x, y, 20, 50);

        this.setxVel(xVel);
        this.setyVel(yVel);
        this.setImage(Resources.getBlockImage());
    }
}