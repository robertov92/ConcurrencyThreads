package villanueva;

/**
 * An instance of this class prints message every .5 seconds
 */
public class RandomMessage implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Hello from random");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
