package threads.extending;

public class ThreadDeno {
    public static void main(String[] args) {
        // Create a thread using the MyThread class
        MyThread thread1 = new MyThread("Ram");
        MyThread thread2 = new MyThread("Shayam");
        MyThread thread3 = new MyThread("Geeta");
        MyThread thread4 = new MyThread("Seeta");

        thread1.setPriority(Thread.MAX_PRIORITY);
        // thread2.setPriority(Thread.NORM_PRIORITY);
        // thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(Thread.MIN_PRIORITY);

        // Start the threads
        System.out.println("Starting threads...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Threads have finished execution.");
    }
}
