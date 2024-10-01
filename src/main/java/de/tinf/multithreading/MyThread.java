package de.tinf.multithreading;

/**
 * Class that extends the Thread class
 * and provides the code for parallel execution in the run method.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // This part of the code will be executed in parallel
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " runs: " + i);
            try {
                Thread.sleep(1000); // Thread sleeps for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

