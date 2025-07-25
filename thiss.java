class Example {
    private int x;
    private int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        // int x=2;
        // int y=3; if this we use then in sout we use this.x to print the value i.e
        // inside f1;
        System.out.println(this.x);
        System.out.println(this.y);
    }
}

public class thiss {
    public static void main(String[] args) {
        Example e = new Example();
        e.f1(5, 4);
        e.display();
    }
}
