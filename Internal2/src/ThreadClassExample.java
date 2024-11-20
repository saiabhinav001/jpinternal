// Class extending Thread to create a custom thread
class MyThread extends Thread {
    private String threadName;

    // Constructor to set the thread name
    public MyThread(String name) {
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

public class ThreadClassExample {
    public static void main(String[] args) {
        // Creating thread instances
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Starting the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread execution completed.");
    }
}
