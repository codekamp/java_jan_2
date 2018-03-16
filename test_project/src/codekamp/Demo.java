package codekamp;

import codekamp.abc.Elephant;

public class Demo {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "pluto";
        d1.age = 5;

        Dog d2 = new Dog();
        d2.name = "Mars";
        d2.age = 3;


        d1.chaseTale(10);

        Elephant e = new Elephant();
        e.talk();

        codekamp.xyz.Elephant e1 = new codekamp.xyz.Elephant();
        e1.talk();



//        String s1 = "Hello world!";
//
//        int i = 99;
//
//        System.out.println(d1);
//        System.out.println(d2);
//
//
//        System.out.println(s1);
//        System.out.println(i);
//
//        d1.toString();

    }
}