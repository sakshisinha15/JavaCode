class Process1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process 1: " + i);
        }
    }
}

class Process2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Process 2: " + i);
        }
    }
}

public class multithred2 {
    public static void main(String[] args) {
        Process1 p = new Process1();
        Process2 p1 = new Process2();
        p.start();
        p1.start();

    }
}
