class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " Step " + i);
                Thread.sleep(500); // Pause for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) {
        // Create thread instances
        MyThread1 thread1 = new MyThread1("Thread-1");
        MyThread1 thread2 = new MyThread1("Thread-2");

        // Set thread priority
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        System.out.println("Thread-1 Priority: " + thread1.getPriority());
        System.out.println("Thread-2 Priority: " + thread2.getPriority());

        // Start threads
        thread1.start();
        thread2.start();

        // Check if threads are alive
        System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());

        // Join threads to wait for their completion
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check again if threads are alive after joining
        System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());

        System.out.println("Main thread execution completed.");
    }
}
