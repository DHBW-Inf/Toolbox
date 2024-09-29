package de.tinf.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Using an Executor to manage threads
 * and create a thread pool.
 */
public class MyExecutorService {
    private final ExecutorService executor;

    public MyExecutorService(int threadCount) {
        // Create a thread pool with a fixed number of threads
        executor = Executors.newFixedThreadPool(threadCount);
    }

    public void executeTask(Runnable task) {
        executor.execute(task); // Pass the task to the Executor
    }

    public void shutdown() {
        executor.shutdown(); // Shut down the Executor safely
    }
}
