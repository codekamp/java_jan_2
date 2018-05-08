package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 07/05/18.
 */
public class LoginScreen implements ActionListener {
    private JButton loginButton;
    private JTextField passwordField;
    private JTextField usernameField;
    private JPanel panel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public LoginScreen() {
        this.loginButton.addActionListener(this);
    }

    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
