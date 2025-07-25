class hel {
    void f1() {
        System.out.println("My name is sakshi");
    }
}

class hel0 extends hel {
    void f1() {
        System.out.println("My name is khushi");
    }
}

public class overriding {
    public static void main(String[] args) {
        hel0 p = new hel0();
        p.f1();
    }
}
