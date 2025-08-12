import java.util.*;

public class Bmaths {
    static void Dextraction(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }

    static void countD(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

    static void countD2(int n) {
        // m-2 to calculate the count of the digit

        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);
    }

    static void Reversenum(int n) {
        int rnum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            rnum = rnum * 10 + digit;
        }
        System.out.println(rnum);
    }

    static void Palindrome(int n) {
        int x = n;
        int rnum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            rnum = rnum * 10 + digit;
        }
        if (rnum == x) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static void Armstrongnumber(int n) {
        int x = n;
        int sum = 0;
        int count = 0;

        while (n > 0) {
            int y = n % 10;
            count++;
            n = n / 10;
        }

        n = x;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, count);
            n = n / 10;
        }

        if (sum == x) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not a armstrongnumber");
        }
    }

    static void divisor(int n) {
        System.out.println("The divisor are:-");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void divisor2(int n) {
        System.out.println("The divisor are:-");
        // 6*6<=36
        // 7*7<=36 false
        // T.C->O(sqrt(n))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if ((n / i) != i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    static void prime(int n) {
        // BRUTE FORCE->t.c(o(n))
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }
    }

    static void prime2(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if ((n / i) != i) {
                    cnt++;
                }
            }
        }
        if (cnt == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }
    }

    static void HCF(int n, int x) {
        // brute
        System.out.println("The HCF is :-");
        int gcd = 1;
        for (int i = 1; i <= Math.min(n, x); i++) {
            if (n % i == 0 && x % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    static void HCF2(int n, int x) {
        // euclidean algo
        while (n > 0 && x > 0) {
            if (n > x) {
                n = n % x;
            } else {
                x = x % n;
            }
        }
        if (n == 0) {
            System.out.println(x);

        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Bmaths b = new Bmaths();
        // b.Dextraction(n);
        // b.countD(n);
        // b.countD2(n);
        // b.Reversenum(n);
        // b.Palindrome(n);
        // b.Armstrongnumber(n);
        // b.divisor(n);
        // b.prime(n);
        // b.prime2(n);
        // b.HCF(n, x);
        b.HCF2(n, x);
    }

}
