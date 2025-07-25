class Example {
    int x;
    int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        // int x=2;
        // int y=3; if this we use then in sout we use this.x to print the value i.e
        // inside f1;
        System.out.println(x);
        System.out.println(y);
    }
}

class Example1 extends Example {
    int x, y;

    void f3(int x, int y) {
        super.x = x;// parent wale ko assign karne ko
        super.y = y;// parent wale ko assignkarne ko
    }

    void f4() {

        System.out.println(super.x);
        System.out.println(super.y);
    }
}

public class thiss {
    public static void main(String[] args) {
        // Example e = new Example();
        // e.f1(5, 4);
        // e.display();
        Example1 e1 = new Example1();
        e1.f3(7, 9);
        e1.f4();
    }
}
