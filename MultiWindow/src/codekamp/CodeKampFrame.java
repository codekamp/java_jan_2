package codekamp;

import com.sun.tools.javac.jvm.Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeKampFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private JButton newWindowButton;
    private JLabel helloLabel;

    private CodeKampFrame[] children = new CodeKampFrame[10];
    private int index = -1;

    public CodeKampFrame() {
        JPanel p = new JPanel();
        this.add(p);
        this.changeColorButton = new JButton("Change Color");
        this.newWindowButton = new JButton("New Window");
        this.helloLabel = new JLabel("Hello World!");

        p.add(this.helloLabel);
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);
        this.setSize(500, 400);

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.changeColorButton) {
            this.changeLabelColor();
        } else {
            CodeKampFrame f1 = new CodeKampFrame();
            f1.setVisible(true);
            this.index++;
            this.children[index] = f1;
        }
    }





    private void changeLabelColor() {
        for(int i = 0; i <= this.index; i++) {
            this.children[i].changeLabelColor();
        }

        if (this.helloLabel.getForeground() == Color.RED) {
            this.helloLabel.setForeground(Color.GREEN);
        } else {
            this.helloLabel.setForeground(Color.RED);
        }
    }
}