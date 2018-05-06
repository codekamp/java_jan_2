package jumpper.entities;

import java.awt.*;

abstract public class Entity {
    private int x;
    private int y;
    private int xVel = 0;
    private int yVel = 0;
    private int xAcc = 0;
    private int yAcc = 0;
    private int width;
    private int height;
    private Image image;
    private boolean visible = true;

//    private Rectangle rect = new Rectangle();

    public Entity(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        this.x += this.xVel;
        this.y += this.yVel;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void increaseX(int delta) {
        this.x += delta;
    }

    public void increaseY(int delta) {
        this.y += delta;
    }

    public void descreaseX(int delta) {
        this.x -= delta;
    }

    public void descreaseY(int delta) {
        this.y -= delta;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxVel() {
        return xVel;
    }

    public void setxVel(int xVel) {
        this.xVel = xVel;
    }

    public int getyVel() {
        return yVel;
    }

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }

    public int getxAcc() {
        return xAcc;
    }

    public void setxAcc(int xAcc) {
        this.xAcc = xAcc;
    }

    public int getyAcc() {
        return yAcc;
    }

    public void setyAcc(int yAcc) {
        this.yAcc = yAcc;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isCollidingWith(Entity e) {
        return visible && e.visible
                && ((x >= e.x && x <= e.x + e.width) || (e.x >= x && e.x <= x + width))
                && ((y >= e.y && y <= e.y + e.height) || (e.y >= y && e.y <= y + height));
    }

//    public boolean isCollidingWith(Entity e) {
//        this.updateRect();
//        e.updateRect();
//
//        return visible && e.visible && this.rect.intersects(e.rect);
//    }
//
//    private void updateRect() {
//        this.rect.setBounds(this.x, this.y, this.width, this.height);
//    }
}