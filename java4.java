class A {
    private int x;
    private static int y;

    void fun1() {
        y = 45;
        x = 5;
    }

    void dun2() {
        System.out.println(x);
    }

    void fun12() {
        y = 452;
    }
}

class java4 {
    public static void main(String args[]) {
        A a1 = new A();
        A a2 = new A();
        a1.fun1();
        a2.dun2();
        // a1.fun12();
        // a2.dun2();
    }
}