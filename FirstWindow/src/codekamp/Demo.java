package codekamp;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(500, 300);

        JPanel p1 = new JPanel();
        f1.add(p1);

        JTextField t1 = new JTextField();
        t1.setText("Username");

        JTextField t2 = new JTextField("Password");

        JButton b1 = new JButton("Login");
        JButton b2 = new JButton("signup");

        b1.setForeground(Color.red);
        b2.setForeground(Color.yellow);


        b1.addActionListener(new Cat());
        b2.addActionListener(new Dog());




        JLabel l1 = new JLabel("Enter username:");
        JLabel l2 = new JLabel("Enter password:");

        l1.setForeground(new Color(22, 255, 22));

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);


        f1.setVisible(true);

        CodeKampButton b3 = new CodeKampButton();
        b3.addActionListner(new Cat());
    }


    public void login(String username, String password) {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}