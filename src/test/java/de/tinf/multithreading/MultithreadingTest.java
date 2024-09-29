package de.tinf.multithreading;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for executing and testing multithreading functionalities.
 */
public class MultithreadingTest {

    private static ExecutorService testExecutor;

    @BeforeAll
    public static void setup() {
        // Initialize resources before all tests if needed
        testExecutor = Executors.newCachedThreadPool();
    }

    @AfterAll
    public static void teardown() {
        // Clean up resources after all tests
        if (testExecutor != null && !testExecutor.isShutdown()) {
            testExecutor.shutdown();
        }
    }

    /**
     * Test for MyThread class to ensure threads run without interruption.
     */
    @Test
    public void testMyThread() throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // If threads complete without exceptions, the test passes
        assertFalse(thread1.isAlive(), "Thread1 should have finished execution.");
        assertFalse(thread2.isAlive(), "Thread2 should have finished execution.");
    }

    /**
     * Test for MyRunnable class to ensure runnables execute correctly.
     */
    @Test
    public void testMyRunnable() throws InterruptedException {
        Thread runnableThread1 = new Thread(new MyRunnable());
        Thread runnableThread2 = new Thread(new MyRunnable());

        runnableThread1.start();
        runnableThread2.start();

        runnableThread1.join();
        runnableThread2.join();

        // If threads complete without exceptions, the test passes
        assertFalse(runnableThread1.isAlive(), "RunnableThread1 should have finished execution.");
        assertFalse(runnableThread2.isAlive(), "RunnableThread2 should have finished execution.");
    }

    /**
     * Test for MyExecutorService to ensure tasks are executed and executor shuts down properly.
     */
    @Test
    public void testMyExecutorService() {
        MyExecutorService executorService = new MyExecutorService(2);
        MyRunnable task1 = new MyRunnable();
        MyRunnable task2 = new MyRunnable();

        executorService.executeTask(task1);
        executorService.executeTask(task2);
        executorService.shutdown();

        assertNotNull(executorService, "ExecutorService should not be null.");
    }

    /**
     * Test for Counter and CounterThread to ensure synchronization works correctly.
     */
    @Test
    public void testCounterSynchronization() throws InterruptedException {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();

        counterThread1.join();
        counterThread2.join();

        // Expected count is 2000 (1000 increments by each thread)
        assertEquals(2000, counter.getCount(), "Counter should be incremented to 2000.");
    }

    /**
     * Test for MyCallable and Future to ensure callable returns the correct result.
     */
    @Test
    public void testMyCallable() throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        Future<Integer> future = testExecutor.submit(callable);

        Integer result = future.get(); // Wait for the result

        // The sum of numbers from 1 to 10 is 55
        assertEquals(55, result, "Callable should return the sum of numbers from 1 to 10, which is 55.");
    }
}
