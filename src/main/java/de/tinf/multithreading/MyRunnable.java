package de.tinf.multithreading;

/**
 * Implementation of the Runnable interface,
 * where the run method contains the parallel code.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // This part of the code will be executed in parallel
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Runnable) runs: " + i);
            try {
                Thread.sleep(500); // Thread sleeps for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

