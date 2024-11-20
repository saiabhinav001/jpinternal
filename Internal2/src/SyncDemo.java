class SharedResource {
    void synchronizedMethod(String threadName) {
        synchronized (this) { // Synchronized block
            System.out.println(threadName + " has entered the synchronized block.");
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
            System.out.println(threadName + " is leaving the synchronized block.");
        }
    }

    synchronized void synchronizedMethodDirect(String threadName) { // Synchronized method
        System.out.println(threadName + " is executing the synchronized method.");
        try {
            Thread.sleep(1000); // Simulating some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(threadName + " is leaving the synchronized method.");
    }
}

class SyncDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            resource.synchronizedMethod("Thread-1");
            resource.synchronizedMethodDirect("Thread-1");
        });

        Thread t2 = new Thread(() -> {
            resource.synchronizedMethod("Thread-2");
            resource.synchronizedMethodDirect("Thread-2");
        });

        t1.start();
        t2.start();
    }
}

