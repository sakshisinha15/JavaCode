
// //default
// class Demo {
//     int x, y;

//     Demo() {
//         System.out.println("Constructor 1 executed");
//     }

// }

// public class contruct {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//     }
// }
//parametrized constructor 
class Demo {
    int x, y;

    Demo(int p, int q) {
        x = p;
        y = q;
        System.out.println("Constructor 1 executed and the value is " + (x + y));
    }

    Demo(int f) {

    }

    Demo() {

    }
}

public class contruct {
    public static void main(String[] args) {
        Demo d = new Demo(5, 6);
        Demo d1 = new Demo(10, 5);
        Demo d2 = new Demo();
        Demo d3 = new Demo(6); 
    }
}