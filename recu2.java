import java.util.*;

class fun {
    // printing names for the n times using recursion
    public void f1(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Sakshi");

        f1(i + 1, n);
    }

    // printing 1 to n using recursion
    public void f2(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);

        f2(i + 1, n);
    }

    // printing n to 1 using recursion
    public void f3(int n, int i) {
        if (n < i) {
            return;
        }
        System.out.println(n);
        f3(n - 1, i);
    }

    // printing n to 1 using recursion
    public void f32(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        f32(i - 1, n);
    }
    // printing n to 1 using recursion backtraking

    public void f4(int i, int n) {
        if (i < 1) {
            return;
        }
        f4(i - 1, n);
        System.out.println(i);

    }

    // printing 1 to n using recursion
    public void f5(int i, int n) {
        if (i > n) {
            return;
        }
        f2(i + 1, n);
        System.out.println(i);
    }

    // functional function recursion
    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);

    }

    // parametrized recursion
    public void sum2(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum2(i - 1, sum + i);
    }

    // factorial using functional recursion
    public int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);

    }

    // reverse the array using 2 pinters in the recursion
    public void revarra(int l, int arr[], int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revarra(l + 1, arr, r - 1);
    }

    // reverse the array using 1 pointers in the recursion
    public void revarra2(int i, int arr[], int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revarra2(i + 1, arr, n);
    }

    boolean sPALINDROME(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return sPALINDROME(i + 1, s);
    }

    public int fibanooci(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibanooci(n - 1);
        int slast = fibanooci(n - 2);
        return last + slast;
    }
}

public class recu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        fun f = new fun();
        System.out.println("The fibonacci number is :" + f.fibanooci(n));
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // f.revarra2(0, arr, n);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i]);
        // }
        // sc.nextLine();
        // String s = sc.nextLine();
        // System.out.println(f.sPALINDROME(0, s));
        // System.out.println(f.sum(n));
        // f.sum2(n, 0);
        // System.out.println(f.fac(n));
    }
}
