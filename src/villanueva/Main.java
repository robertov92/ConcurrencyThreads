package villanueva;

/**
 * This class creates three threads and runs them concurrently
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Create objects that implement the runnable interface
            Odds odds = new Odds();
            Evens evens = new Evens();
            RandomMessage randomMessage = new RandomMessage();

            // Create 3 threads
            Thread thread1 = new Thread(odds);
            Thread thread2 = new Thread(evens);
            Thread thread3 = new Thread(randomMessage);

            // Run the threads concurrently
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception e) {
            System.out.println("Ups! Something went wrong");
        }


    }
}
