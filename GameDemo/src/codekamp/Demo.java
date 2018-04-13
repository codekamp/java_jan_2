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
import java.io.IOException;
import java.net.URL;

public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static AudioClip jumpAudio;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(800, 450));
        p.setFocusable(true);
        p.addKeyListener(new Demo());

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

        Image[] playerImages = {p1, p2, p3, p4, p5, p4, p3, p2};

        int index = 0;
        int counter = 0;
        int block1XCord = 900;

        g.setColor(new Color(146, 212, 255));
        while (true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {

            }

            counter++;

            block1XCord -= 5;

            if(block1XCord < -20) {
                block1XCord = 900;
            }

            if(counter == 2) {
                index++;
                counter = 0;
            }

            if(index == 8) {
                index = 0;
            }

            pImage = playerImages[index];

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord = Demo.playerYCord  + Demo.playerYVel;

            if(Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
            }

            if(Demo.playerYCord < 315) {
                pImage = jumpImage;
            }

            g.fillRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(blockImage, block1XCord, 355, null);
            g.drawImage(pImage, 364, Demo.playerYCord, null);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(Demo.playerYCord == 315 && e.getKeyCode() == KeyEvent.VK_SPACE) {
            Demo.jumpAudio.play();
            Demo.playerYVel = -20;
            Demo.playerYAcc = 1;
        } else {
            System.out.println("some other key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}