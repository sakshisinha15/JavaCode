abstract class Abs {
    int x, y;

    void f1() {
        x = 5;
        y = 2;
    }

    Abs() {
        System.out.println("Sakshi parents constructor ");
    }

    abstract void f2();
}

class Demo extends Abs {
    int z;

    void f3() {
        z = 8;
    }

    void f2() {

    }

    Demo() {
        System.out.println("Child's constructor");
    }
}

public class abstrct {
    public static void main(String[] args) {
        Demo s = new Demo();

    }
}
