# Release Notes 

> Release Date: Sept 29, 2024
>
> Introducing multithreading utilities

| Class Name          | Purpose                                               | Extends / Implements     |
|---------------------|-------------------------------------------------------|--------------------------|
| `MyThread`          | Demonstrates multithreading by extending `Thread`.    | Extends `Thread`         |
| `MyRunnable`        | Demonstrates multithreading using `Runnable`.         | Implements `Runnable`    |
| `MyExecutorService` | Manages thread execution using a fixed thread pool.   | Utilizes `ExecutorService` |
| `Counter`           | Demonstrates synchronized counter operations.         | N/A                      |
| `CounterThread`     | Increments a shared `Counter` instance in parallel.   | Extends `Thread`         |
| `MyCallable`        | Demonstrates `Callable` by returning a calculated value. | Implements `Callable<Integer>` |
