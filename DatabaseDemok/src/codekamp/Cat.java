package codekamp;

/**
 * Created by cerebro on 31/05/18.
 */
public class Cat {
    public String name;

    public void talk() {
        System.out.println("Meow Meow. I am " + this.name);
        this.jump();
    }

    public void jump() {
        System.out.println("Cat is jumping");
    }
}
