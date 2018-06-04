package codekamp;

public class Dog extends Animal {

    // First line is every constructor should be call to a parent constructor
    // directly or indirectly.

    public Dog() {
        this("adfadfaf");
        System.out.println("hello");
    }

    public Dog(String a) {
        super(30);
        System.out.println("sdfdsfdsf");
    }

    public void talk() {
        System.out.println("Wuff Wuff!");
    }

    public void chaseTale() {
        System.out.println("chasing the tale");
    }


    public void doFavoriteThing() {
        System.out.println("Chase Tale!");
    }

    public void Cat() {
        System.out.println("Dog vala Cat function");
    }
}