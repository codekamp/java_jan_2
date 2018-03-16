package codekamp;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Demo {

    private static Animal a1;

    public static void main(String[] a) {

        Random r = new Random();
        int randomInt = r.nextInt(4);


        if (randomInt == 0) {
            Demo.a1 = new Dog();
        } else if(randomInt == 1) {
            Demo.a1 = new Cat();
        } else if(randomInt == 2) {
            Demo.a1 = new Elephant();
        } else {
            Demo.a1 = new Lion();
        }

//        At complile time function search starts from data type of variable

        // At runtime function search starts from data type of object

//        System.out.println(randomInt);
//        Demo.doubleTap();
//        Demo.swipeUp();

//        Animal a2 = new Dog();

//        ((Dog)a2).chaseTale();

//        if(Demo.a1 instanceof Dog) {
//            ((Dog)Demo.a1).chaseTale();
//        } else if(Demo.a1 instanceof Cat) {
//            ((Dog)Demo.a1).chaseTale();
//            System.out.println("Cat is there");
//        }

        Animal xyz = new Cat();

        xyz.talk();
    }

    public static void doubleTap() {
        Demo.a1.talk();
    }

    public static void swipeUp() {
        Demo.a1.doFavoriteThing();
    }
}