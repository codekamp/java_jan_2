package codekamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dog implements ActionListener, ButtonListner {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Signup button clicked");
    }

    public void buttonClicked() {
        System.out.println("button clicked");
    }

    public void buttonDoubleClicked(int a) {

    }
}