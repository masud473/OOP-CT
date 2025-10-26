class VLCVideo implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++)
            System.out.println("Video is Running by " + Thread.currentThread().getName());
    }
}

class VLCMusic implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++)
            System.out.println("Music is Running by" + Thread.currentThread().getName());
    }
}

class VLCTimer implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++)
            System.out.println("Timer is Running by" + Thread.currentThread().getName());
    }
}

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new VLCMusic());
        Thread t2 = new Thread(new VLCVideo());
        Thread t3 = new Thread(new VLCTimer());

        t1.start();
        t2.start();
        t3.start();
    }
}