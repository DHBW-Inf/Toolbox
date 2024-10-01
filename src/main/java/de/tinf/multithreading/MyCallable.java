package de.tinf.multithreading;

import java.util.concurrent.Callable;

/**
 * Implementation of a Callable that performs a calculation
 * and returns a result.
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            Thread.sleep(200); //simulate a long-running task
        }
        return sum;
    }
}
