import java.util.*;

public class recursionprac {
    static void print1ton(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print1ton(i + 1, n);
    }

    static void printname(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("saskshi");
        printname(i + 1, n);
    }

    static void printnto1(int i, int n) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        printnto1(i - 1, n);
    }

    static void sum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum(i - 1, sum + i);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void reversearray(int l, int r, int arr[]) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reversearray(l + 1, r - 1, arr);
    }

    static void reversearray2(int i, int n, int arr[]) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reversearray2(i + 1, n, arr);
    }

    static boolean reversestring(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return reversestring(i + 1, s);
    }

    static int fibanooci(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibanooci(n - 1);
        int slast = fibanooci(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // recursionprac.print1ton(1, n);
        // recursionprac.printname(1, n);
        // recursionprac.printnto1(n, 0);
        // recursionprac.sum(n, 0);
        // System.out.println(recursionprac.factorial(n));
        // int arr[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // recursionprac.reversearray2(0, n, arr);
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }
        // String s = "Naman";
        // System.out.println(recursionprac.reversestring(0, s));
        System.out.println(recursionprac.fibanooci(n));
    }
}
