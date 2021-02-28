package villanueva;

/**
 * An instance of this class prints an odd number every .1 seconds
 */
public class Odds implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
