package codekamp;

public class Demo implements Runnable {


    public static int unsoldFlats = 10;
    volatile public static int unsoldGfFlats = 2;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo());
        t1.setName("Tom");
        t1.start();

        Demo.countDogs();
        Demo.entryInRegister();
    }

    public static void countDogs() {
        for(int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Dog number " + i + ", thread: " + Thread.currentThread().getName());
        }
    }


    public static void countCats() {
        for(int i = 1; i <= 45; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Cat number " + i + ", thread: " + Thread.currentThread().getName());
        }
    }

    synchronized public static void entryInRegister() {
        for(int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("entry by: " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Demo.countCats();
        Demo.entryInRegister();
    }
}