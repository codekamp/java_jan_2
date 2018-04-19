package codekamp;

import codekamp.xyz.something.Hello;
import codekamp.xyz.something.Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;

public class Demo implements KeyListener, MouseListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static AudioClip jumpAudio;
    private static boolean paused = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(800, 450));
        p.setFocusable(true);

        Demo d = new Demo();
        p.addKeyListener(d);
        p.addMouseListener(d);

        frame.add(p);

        frame.pack();
        frame.setVisible(true);


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        p.requestFocus();
        Graphics g = p.getGraphics();

        g.setColor(Color.red);
        g.setFont(new Font("Georgia", Font.BOLD, 20));
        g.drawString("Hello world!", 100, 100);


        // 1 2 3 4 5 4 3 2   1 2 3 4 5 4 3 2
        Image grassImage;
        Image p1;
        Image p2;
        Image p3;
        Image p4;
        Image p5;
        Image jumpImage;
        Image pImage;
        Image blockImage;
        try {
//            URL imageUrl = new URL("c://downloads/GameDemo/src/codekamp/images/grass.png");
            URL imageUrl = Demo.class.getResource("images/grass.png");
            URL player1Url = Demo.class.getResource("images/run_anim1.png");
            URL player2Url = Demo.class.getResource("images/run_anim2.png");
            URL player3Url = Demo.class.getResource("images/run_anim3.png");
            URL player4Url = Demo.class.getResource("images/run_anim4.png");
            URL player5Url = Demo.class.getResource("images/run_anim5.png");
            URL jumpUrl = Demo.class.getResource("images/jump.png");
            URL blockUrl = Demo.class.getResource("images/block.png");
            grassImage = ImageIO.read(imageUrl);
            p1 = ImageIO.read(player1Url);
            p2 = ImageIO.read(player2Url);
            p3 = ImageIO.read(player3Url);
            p4 = ImageIO.read(player4Url);
            p5 = ImageIO.read(player5Url);
            jumpImage = ImageIO.read(jumpUrl);
            blockImage = ImageIO.read(blockUrl);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to load images. seems installation is corrupt. Please reinstall.");
            return;
        }

        URL jumpAudioUrl = Demo.class.getResource("sounds/onjump.wav");
        Demo.jumpAudio = Applet.newAudioClip(jumpAudioUrl);

        URL hitAudioUrl = Demo.class.getResource("sounds/hit.wav");
        AudioClip hitAudio = Applet.newAudioClip(hitAudioUrl);

        Image[] playerImages = {p1, p2, p3, p4, p5, p4, p3, p2};

        int playerXCord = 364;
        int index = 0;
        int counter = 0;
        int block1XCord = 900;
        int block2XCord = 1100;
        int block3XCord = 1300;
        int block4XCord = 1500;
        int block5XCord = 1700;

        boolean block1Visible = true;
        boolean block2Visible = true;
        boolean block3Visible = true;
        boolean block4Visible = true;
        boolean block5Visible = true;

        Color skyBlue = new Color(146, 212, 255);
        g.setFont(new Font("Arial", Font.BOLD, 25));

        int score = 0;

        while (true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {

            }

            if(Demo.paused) {
                continue;
            }

            if (playerXCord < 0) {
                g.setColor(Color.RED);
                g.drawString("Game Over. Press any key to restart", 200, 100);
                break;
            }

            counter++;

            block1XCord -= 5;
            block2XCord -= 5;
            block3XCord -= 5;
            block4XCord -= 5;
            block5XCord -= 5;

            if (block1XCord < -20) {
                if (block1Visible) {
                    score += 10;
                }
                block1XCord = 980;
                block1Visible = true;
            }


            if (block2XCord < -20) {
                if (block2Visible) {
                    score += 10;
                }
                block2XCord = 980;
                block2Visible = true;
            }

            if (block3XCord < -20) {
                if(block3Visible) {
                    score += 10;
                }
                block3XCord = 980;
                block3Visible = true;
            }

            if (block4XCord < -20) {
                if(block4Visible) {
                    score += 10;
                }
                block4XCord = 980;
                block4Visible = true;
            }

            if (block5XCord < -20) {
                if(block5Visible) {
                    score += 10;
                }
                block5XCord = 980;
                block5Visible = true;
            }

            if (counter == 2) {
                index++;
                counter = 0;
            }

            if (index == 8) {
                index = 0;
            }

            pImage = playerImages[index];

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord = Demo.playerYCord + Demo.playerYVel;

            if (Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
            }

            if (Demo.playerYCord < 315) {
                pImage = jumpImage;
            }

            if (block1Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block1XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 100;
                block1Visible = false;
            }


            if (block2Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block2XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 100;
                block2Visible = false;
            }


            if (block3Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block3XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 100;
                block3Visible = false;
            }


            if (block4Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block4XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 100;
                block4Visible = false;
            }


            if (block5Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block5XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 100;
                block5Visible = false;
            }


            g.setColor(skyBlue);
            g.fillRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);

            if (block1Visible) {
                g.drawImage(blockImage, block1XCord, 355, null);
            }
            if (block2Visible) {
                g.drawImage(blockImage, block2XCord, 355, null);
            }

            if (block3Visible) {
                g.drawImage(blockImage, block3XCord, 355, null);
            }
            if (block4Visible) {
                g.drawImage(blockImage, block4XCord, 355, null);
            }
            if (block5Visible) {
                g.drawImage(blockImage, block5XCord, 355, null);
            }
            g.drawImage(pImage, playerXCord, Demo.playerYCord, null);
            g.setColor(Color.BLACK);
            g.fillRect(50, 50, 50, 50);
            g.drawString("total score: " + score, 600, 50);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (Demo.playerYCord == 315 && e.getKeyCode() == KeyEvent.VK_SPACE) {
            Demo.jumpAudio.play();
            Demo.playerYVel = -18;
            Demo.playerYAcc = 1;
        } else {
            System.out.println("some other key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private static boolean areColliding(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2) {
        boolean xOverLapping = (x1 > x2 && x1 < x2 + w2) || (x2 > x1 && x2 < x1 + w1);
        boolean yOverLapping = (y1 > y2 && y1 < y2 + h2) || (y2 > y1 && y2 < y1 + h1);

        return xOverLapping && yOverLapping;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();
        if(clickX > 50 && clickX < 100 && clickY > 50 && clickY < 100) {

            Demo.paused = !Demo.paused;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}