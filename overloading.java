class hello {

    void f1() {
        System.out.println("adding");
    }

    void f1(int x, int y) {
        System.out.println(x + y);
    }

    void f1(int x) {
        System.out.println(x);
    }
}

public class overloading {
    public static void main(String[] args) {
        hello h = new hello();
        h.f1();
        h.f1(4, 5);
        h.f1(4);

    }
}
