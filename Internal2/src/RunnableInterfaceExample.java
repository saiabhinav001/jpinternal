// Class implementing Runnable to create a custom thread
class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set the thread name
    public MyRunnable(String name) {
        this.threadName = name;
    }

    // Overriding the run method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: Step " + i);
            try {
                Thread.sleep(500); // Pauses execution for 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has completed execution.");
    }
}

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        // Creating instances of the Runnable implementation
        MyRunnable runnable1 = new MyRunnable("Thread-1");
        MyRunnable runnable2 = new MyRunnable("Thread-2");

        // Creating Thread objects and associating them with the Runnable instances
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Starting the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread execution completed.");
    }
}
