import java.util.Scanner;

class Even implements Runnable {
    int limit;

    Even(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int start = 2;
        while (start <= limit) {
            System.out.println("Even: " + start);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            start += 2;
        }

    }
}

class Odd implements Runnable {
    int limit;

    Odd(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int start = 1;
        while (start <= limit) {
            System.out.println("Odd: " + start);
            try {
<<<<<<< HEAD
                Thread.sleep(1000);
=======
                Thread.sleep(2000);
>>>>>>> 9c288ecc6beea9714eaa1452bd03ba00fa44f613
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            start += 2;
        }

    }
}

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        Thread t1 = new Thread(new Even(limit));
        Thread t2 = new Thread(new Odd(limit));
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        t1.start();
    }
}
