class Process1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process 1: " + i);
        }
    }
}

class Process2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process 2: " + i);
        }
    }
}

public class Multithred {
    public static void main(String[] args) {
        Process1 p = new Process1();
        Process2 p1 = new Process2();
        Thread t = new Thread(p);
        Thread t1 = new Thread(p1);
        t.start();
        t1.start();

    }
}
