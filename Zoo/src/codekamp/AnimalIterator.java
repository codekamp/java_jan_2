package codekamp;

import java.util.Iterator;
import java.util.function.Consumer;

public class AnimalIterator implements Iterator<String> {

    private Animal animal;
    private int index;

    public AnimalIterator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean hasNext() {
        return index < 3;
    }

    @Override
    public String next() {
        index++;
        switch (index) {
            case 1:
                return this.animal.name;
            case 2:
                return this.animal.breed;
            case 3:
                return this.animal.color;
            default:
                return null;
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {

    }
}