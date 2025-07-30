import java.util.*;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    boolean issufficiet(int w) {
        if (bal > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amt, String g1) {
        bal = bal - amt;
        System.out.println(g1 + " transaction successfull");
        System.out.println(g1 + " current Balance is " + bal);

    }
}

class Customer implements Runnable {
    Account x1;
    String r1;

    Customer(Account j1, String k1) {
        x1 = j1;
        r1 = k1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        synchronized (x1) {
            System.out.println("Enter amount to withdraw for:" + r1 + ":");
            int amt = s1.nextInt();
            if (x1.issufficiet(amt)) {
                x1.withdraw(amt, r1);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

}

public class threadsyn {
    public static void main(String[] args) {
        Account a = new Account(5000);
        Customer c1 = new Customer(a, "Amit");
        Customer c2 = new Customer(a, "Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
