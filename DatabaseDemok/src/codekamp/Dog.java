package codekamp;

/**
 * Created by cerebro on 31/05/18.
 */
public class Dog {
    public String name;

    static {
        System.out.println("hello Dog!");
    }

    static {
        System.out.println("yet another code block");
    }

    public static void randomFunc() {
        System.out.println("Totally Random Function");
    }

    // belongs to whole Dog class and not to some individual
    public static class Jupiter {
        public String name;

        public void talk() {
            System.out.println("Object of Jupiter class and my name is " + this.name);
        }

        public static void jump() {
            System.out.println("Jupiter is jumping");
        }
    }

    // belongs to individual objects of Dog class
    public class Mars {
        public String name;

        public void talk() {
            System.out.print("Object of Mars class and my name is " + this.name);
            System.out.println(". I belong to " + Dog.this.name);
        }

        // We can't create static methods inside non static nested classes
//        public static void jump() {
//            System.out.println("Mars is jumping " + this.name);
//        }
    }
}
