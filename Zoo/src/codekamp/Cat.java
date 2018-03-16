package codekamp;

public class Cat extends Animal {

    // 1. non static
    // 2. same name as Class name
    // 3. no return data type

    public void talk() {
        System.out.println("Meow Meow!");
        this.doFavoriteThing();
        super.doFavoriteThing();
    }

    public void doFavoriteThing() {
        System.out.println("Climb Tree");
    }

    public int add(int a, int b) {
        //this
        //super
        return a + b;
    }
}