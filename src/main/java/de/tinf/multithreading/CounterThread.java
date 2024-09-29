package de.tinf.multithreading;

/**
 * Class that uses the Counter class in parallel threads.
 */
public class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); //Enter the critical / synchronized section
        }
    }
}

