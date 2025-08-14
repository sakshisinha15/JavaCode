class fn {
    int cnt = 0;

    public void f1() {
        System.out.println("1");
        f1();
    }

    public void f2() {
        System.out.println(cnt);
        cnt++;
        f2();
    }

    public void f3() {
        if (cnt == 3) {
            return;
        }
        System.out.println(cnt);
        cnt++;
        f3();
    }
}

public class recur1 {
    public static void main(String[] args) {
        fn f = new fn();
        f.f3();
    }
}
