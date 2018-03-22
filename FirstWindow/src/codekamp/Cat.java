package codekamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cat implements ActionListener, ButtonListner {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Login button clicked");
    }

    public void actionPerformed() {
        System.out.println("Hello world!");
    }

    @Override
    public void buttonClicked() {

    }

    @Override
    public void buttonDoubleClicked(int gap) {

    }
}