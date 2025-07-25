//SINGLE INHERITANCE
class Nokia {
    private int x, y;

    Nokia(int p, int q) {
        x = p;
        y = q;
        System.out.println("Paarent's constructor called");
    }

    void f1() {
        System.out.println("Parent class function 1  executed");
    }

    void f2() {
        System.out.println("Parent class function 2 executed");
    }
}

class Nokia2 extends Nokia {
    int z;

    void f3() {
        System.out.println("Child class executed");
    }

    Nokia2() {
        super(5, 6);
        System.out.println("Child's constructor called");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Nokia2 n = new Nokia2();
        n.f1();
        n.f2();
        n.f3();
    }
}
