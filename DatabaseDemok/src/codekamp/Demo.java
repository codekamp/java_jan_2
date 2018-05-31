package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 31/05/18.
 */

public class Demo {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Dog.randomFunc();
//
//        Dog d1 = new Dog();
//        d1.name = "Tomy";
//
//        Dog d2 = new Dog();
//        d2.name = "John";
//
//        Dog.Jupiter j1 = new Dog.Jupiter();
//        j1.name = "Amit";
//
//        Dog.Mars m1 = d1.new Mars();
//        m1.name = "Suresh";
//
//        Dog.Mars m2 = d1.new Mars();
//        m2.name = "Ramesh";
//
//        Dog.Mars m3 = d2.new Mars();
//        m3.name = "Dinesh";
//
//        m1.talk();
//        m2.talk();
//        m3.talk();
//
        Cat c1 = new Cat(){
            @Override
            public void talk() {
                System.out.println("cat cat");
            }

            public Cat hello() {
                System.out.println("Just Saying hello");
                return this;
            }

            public void world() {
                System.out.println("Just saying world");
            }
        }.hello();


        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        JButton b = new JButton();

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Sqlite browser https://sqlitebrowser.org/
        // https://bitbucket.org/xerial/sqlite-jdbc/downloads/sqlite-jdbc-3.23.1.jar

//        c1.name = "Julie";
//        c1.talk();
//        c1.hello();
    }
}
