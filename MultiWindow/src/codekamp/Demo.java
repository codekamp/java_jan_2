package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo implements ActionListener {

    public JLabel l1;
    public JButton b1;

    public static void main(String[] args) {

        Demo.createNewWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.b1) {
            if(this.l1.getForeground() == Color.RED) {
                this.l1.setForeground(Color.GREEN);
            } else {
                this.l1.setForeground(Color.RED);
            }
        } else {
            Demo.createNewWindow();
        }
    }

    private static void createNewWindow() {
        JFrame f1 = new JFrame();
        JPanel p1 =new JPanel();

        f1.setSize(500, 400);

        Demo d1 = new Demo();
        d1.l1 = new JLabel("Hello World!");
        d1.b1 = new JButton("Change color");
        JButton b2 = new JButton("New Window");

        p1.add(d1.l1);
        p1.add(d1.b1);
        p1.add(b2);

        d1.b1.addActionListener(d1);
        b2.addActionListener(d1);


        f1.add(p1);

        f1.setVisible(true);
    }
}