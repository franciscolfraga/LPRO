
/**
 *
 * @author francisco
 */
public class J4App {

    public static void main(String[] args)
            throws InterruptedException {
        try {
            Thread t1 = new Thread(new MyThread("Thread #1"));
            t1.start();
            
            Thread.sleep(2000);

            Thread t2 = new Thread(new MyThread("Thread #2"));
            t2.start();

            while (t1.isAlive() || t2.isAlive()) {
                System.out.println("Main thread is waiting…");
                Thread.sleep(2000);
            }
            
            System.out.println("Main thread is over.");
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
