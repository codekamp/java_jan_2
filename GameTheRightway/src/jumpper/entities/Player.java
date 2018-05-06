package jumpper.entities;

import jumpper.Resources;

import java.awt.*;

public class Player extends Entity {

    public static final int WIDTH = 72;
    public static final int HEIGHT = 90;

    private boolean inAir = false;

    private Image[] images = {
            Resources.getPlayerImage1(),
            Resources.getPlayerImage2(),
            Resources.getPlayerImage3(),
            Resources.getPlayerImage4(),
            Resources.getPlayerImage5(),
            Resources.getPlayerImage4(),
            Resources.getPlayerImage3(),
            Resources.getPlayerImage2(),
    };

    private int imageIndex = 0;


    public Player(int x, int y) {
        super(x, y, WIDTH, HEIGHT);
    }

    public void update() {
        super.update();

        if(inAir) {
            setImage(Resources.getPlayerJumpImage());
        } else {
            imageIndex++;
            imageIndex = imageIndex % images.length;
            setImage(images[imageIndex]);
        }
    }

    public void jump() {
        Resources.getJumpAudio().play();
        this.setyVel(-18);
        this.setyAcc(1);
        this.inAir = true;
    }

    public void land() {
        if(this.getyVel() == 0 && this.getyAcc() == 0) {
            return;
        }

        Resources.getHitAudio().play();
        this.inAir = false;
        this.setyVel(0);
        this.setyAcc(0);
    }
}