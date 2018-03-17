package codekamp;

public class Cat extends Animal {

    public String name;
    public static int count = 0;

    // 1. non static
    // 2. same name as Class name
    // 3. no return data type

    // 4. Only parameterless constructor can be inherited and that too...
    //    ... if child class has no constructor

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

    public Cat(String name) {
        this.name = name;
    }
}