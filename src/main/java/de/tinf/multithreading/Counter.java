package de.tinf.multithreading;

/**
 * Example of synchronizing a method
 * to protect access to critical sections.
 */
public class Counter {
    private int count = 0;

    // Synchronize the increment method to protect the count variable
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
