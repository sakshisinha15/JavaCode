import java.util.*;

//show hows the  online compiler give the test cases;
public class patterms1 {

    static void pat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pat4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pat5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pat8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pat9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pat10->combination of pat9 and 8

    static void pat11(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pat12(int n) {
        for (int i = 0; i < n; i++) {
            int start = 1;
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pat13(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void pat14(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();

        }
    }

    static void pat15(int n) {
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            // ch++;
            System.out.println();
        }
    }

    static void pat16(int n) {
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }
            // ch++;
            System.out.println();
        }
    }

    static void pat17(int n) {
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    static void pat18(int n) {
        // space
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch1 = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch1);
                if (j <= breakpoint) {
                    ch1++;
                } else {
                    ch1--;
                }

            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pat19(int n) {
        for (int i = 0; i < n; i++) {
            // for (char ch = 'E' - i; ch <= 'E'; ch++) {
            // System.out.print(ch);
            // }
            System.out.println();
        }
    }

    static void pat20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat21(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            for (int j = n; j < 2 * n - 1; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                for (int l = 1; l <= i + 1; l++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void pat22(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {

            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space = space + 2;
            System.out.println();
        }
    }

    static void pat23(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space = space - 2;
            System.out.println();
        }
    }

    static void pat24(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                space = space - 2;
            } else {
                space = space + 2;
            }
        }
    }

    static void pat25(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pat26(int n) {
        int s = n;
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == 0 || i == 2 * n - 2 || j == 0 || j == 2 * n - 2) {
                    System.out.print(n);
                } else {
                    System.out.print(n - 1);
                }
            }
            System.out.println();
        }
    }

    static void pat27(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            // patterms1.pat23(n);
            patterms1.pat27(n);
        }
    }

}
