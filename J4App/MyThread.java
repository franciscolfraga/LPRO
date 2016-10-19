
/**
 *
 * @author francisco
 */
public class MyThread extends Thread implements Runnable {

    private final String name;

    MyThread(String name) {
        this.name = name;
        System.out.println("My " + name + " created.");
    }

    @Override
    public void run() {
        try {

            for (int i = 1; i < 11; i++) {
                System.out.println("My " + name + " count: " + i);
                Thread.sleep(500);
            }
            System.out.println("My " + name + " is over.");

        } catch (InterruptedException e) {
            System.out.println("My " + name + " interrupted.");
        }

    }
}
