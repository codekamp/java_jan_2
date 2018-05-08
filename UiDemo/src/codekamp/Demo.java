package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 07/05/18.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // code to create UI

        LoginScreen s = new LoginScreen();
        frame.add(s.getPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
