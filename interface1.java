interface i1 {
    int x = 6;

    void f1();

    static void f2() {
        System.out.println("i1");
        System.out.println("Hello" + x);
    }
}

interface i2 extends i1 {
    int y = 2;
    int x = 9;

    void f3();

    static void f2() {
        System.out.println("i2");
        System.out.println("Hello" + x);
    }
}

class c1 implements i2 {
    static void f2() {
        System.out.println("c1");
        System.out.println("Hello" + x);
    }

    public void f1() {
        // System.out.println();
    }

    public void f3() {

    }

}

class interface1 {
    public static void main(String[] args) {
        // i2.f2();
        // c1 c = new c1();
        // c1.f2();
        // System.out.println(c.y);
        i1.f2();
    }
}