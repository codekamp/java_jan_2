package jumpper.screens;

import jumpper.Game;
import jumpper.GamePanel;
import jumpper.Resources;
import jumpper.entities.Block;
import jumpper.entities.Player;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;

public class StageOneScreen extends Screen {

    private static final int GRASS_Y = Game.HEIGHT - 45;
    private static final int BLOCK_STARTING_X = 980;
    private static final int BLOCK_GAP = 200;
    private static final int BLOCK_Y = GRASS_Y - 50;
    private static final int BLOCK_X_VEL = -5;

    private static final int PLAYER_STARTING_X = Game.WIDTH/2 - Player.WIDTH/2;
    private static final int PLAYER_GROUND_Y = GRASS_Y - 90;

    private List<Block> blocks = new ArrayList<Block>();
    private Player player;

    public  StageOneScreen() {
        this.player = new Player(PLAYER_STARTING_X, PLAYER_GROUND_Y);

        this.blocks.add(new Block(BLOCK_STARTING_X, BLOCK_Y, BLOCK_X_VEL, 0));
        this.blocks.add(new Block(BLOCK_STARTING_X + BLOCK_GAP, BLOCK_Y, BLOCK_X_VEL, 0));
        this.blocks.add(new Block(BLOCK_STARTING_X + 2*BLOCK_GAP, BLOCK_Y, BLOCK_X_VEL, 0));
        this.blocks.add(new Block(BLOCK_STARTING_X + 3*BLOCK_GAP, BLOCK_Y, BLOCK_X_VEL, 0));
        this.blocks.add(new Block(BLOCK_STARTING_X + 4*BLOCK_GAP, BLOCK_Y, BLOCK_X_VEL, 0));

        this.entities.add(this.player);
        this.entities.addAll(this.blocks);
    }

    @Override
    public void update() {
        super.update();

        if(player.getY() >= PLAYER_GROUND_Y) {
            player.setY(PLAYER_GROUND_Y);
            this.player.land();
        }

        for (Block b: blocks) {
            if(b.getX() <= - b.getWidth()) {
                b.setX(BLOCK_STARTING_X);
                b.setVisible(true);
            }

            if(b.isCollidingWith(player)) {
                b.setVisible(false);
                player.descreaseX(50);
                Resources.getHitAudio().play();
            }
        }

        if(player.getX() < 0) {
            Game.panel.setCurrentScreen(new GameOverScreen());
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Resources.getSkyColor());
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, GRASS_Y, null);
        super.draw(g);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE && player.getY() == PLAYER_GROUND_Y) {
            this.player.jump();
        }
    }
}