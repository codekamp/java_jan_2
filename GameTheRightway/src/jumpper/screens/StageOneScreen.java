package jumpper.screens;

import jumpper.Game;

import java.awt.*;

public class StageOneScreen extends Screen {

    private Color ballColor = Color.WHITE;
    private int xCord = 0;
    private int yCord = 0;

    @Override
    public void update() {
        if(this.ballColor == Color.WHITE) {
            this.ballColor = Color.RED;
        } else {
            this.ballColor = Color.WHITE;
        }
        this.xCord++;
        this.yCord++;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, Game.width, Game.height);
        g.setColor(this.ballColor);
        g.fillArc(this.xCord, this.yCord, 100, 100, 0, 360);
    }

    @Override
    public void onClick(int x, int y) {

    }
}