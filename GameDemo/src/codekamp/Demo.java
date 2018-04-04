package codekamp;

import codekamp.xyz.something.Hello;
import codekamp.xyz.something.Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(800, 450));

        frame.add(p);

        frame.pack();
        frame.setVisible(true);


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }

        Graphics g = p.getGraphics();

        g.setColor(Color.red);
        g.setFont(new Font("Georgia", Font.BOLD, 20));
        g.drawString("Hello world!", 100, 100);


        // 1 2 3 4 5 4 3 2   1 2 3 4 5 4 3 2
        Image grassImage =  null;
        Image p1 = null;
        Image p2 = null;
        Image p3 = null;
        Image p4 = null;
        Image p5 = null;
        try {
//            URL imageUrl = new URL("c://downloads/GameDemo/src/codekamp/images/grass.png");
            URL imageUrl = Demo.class.getResource("images/grass.png");
            URL player1Url = Demo.class.getResource("images/run_anim1.png");
            URL player2Url = Demo.class.getResource("images/run_anim2.png");
            URL player3Url = Demo.class.getResource("images/run_anim3.png");
            URL player4Url = Demo.class.getResource("images/run_anim4.png");
            URL player5Url = Demo.class.getResource("images/run_anim5.png");
            grassImage = ImageIO.read(imageUrl);
            p1 = ImageIO.read(player1Url);
            p2 = ImageIO.read(player2Url);
            p3 = ImageIO.read(player3Url);
            p4 = ImageIO.read(player4Url);
            p5 = ImageIO.read(player5Url);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Image[] playerImages = {p1, p2, p3, p4, p5, p4, p3, p2};

        int index = 0;
        int counter = 0;

        g.setColor(new Color(146, 212, 255));
        while (true) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {

            }

            counter++;

            if(counter == 2) {
                index++;
                counter = 0;
            }

//            index = index % 8;
//
//            index %= 8;

            if(index == 8) {
                index = 0;
            }


            g.fillRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImages[index], 364, 315, null);
        }
    }


}