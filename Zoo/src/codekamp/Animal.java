package codekamp;

import java.util.Iterator;

public class Animal implements Iterable<String> {

    public String name;
    public String breed;
    public String color;
    public String hobby;

    public Animal() {
        System.out.println("Animal Class kaa Constructor");
    }

    public Animal(int a) {
        System.out.println("Animal Class kaa Constructor");
    }

    public void talk() {
        System.out.println("animal talking");
    }

    // data type of this is Class inside which the function is defined.

    public void hello() {
        System.out.println("Hello");
    }

    public void doFavoriteThing() {
        System.out.println("animal doing its' favorite thing");
    }

    public void walkLeft() {
        System.out.println("walking to left");
    }

    @Override
    public Iterator<String> iterator() {
        return new AnimalIterator(this);
    }
}