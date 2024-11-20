class MyRunnable1 implements Runnable {
    private String threadName;

    public void MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println(threadName + " started running: Step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " thread has interrupted");
            }
        }
        System.out.println(threadName + " has completed execution");
    }
}

public class MultipleThreadsExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread-1"));
        Thread thread2 = new Thread(new MyRunnable("Thread-2"));
        Thread thread3 = new Thread(new MyRunnable("Thread-3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
