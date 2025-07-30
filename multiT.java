import java.util.*;

class Amount {
    int bal;

    Amount(int b) {
        bal = b;
    }

    public boolean isSufficientBal(int withdraw) {
        if (bal > withdraw) {
            return true;
        } else {
            return false;
        }
    }

    public void withdrawal(int wb) {
        bal = bal - wb;
        System.out.println("Withdrawl Successful");
        System.out.println("Current Bal is: " + bal);
    }
}

class Customer implements Runnable {
    Amount h1;
    String name;

    Customer(Amount g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        synchronized (h1) {
            Scanner sc = new Scanner(System.in);
            System.out.println(name + ",Enter amount :");
            int amt = sc.nextInt();
            if (h1.isSufficientBal(amt)) {
                System.out.println(name + " ");
                h1.withdrawal(amt);
            } else {
                System.out.println(name + "Insufficient Balance");

            }
        }

    }
}

class multiT {
    public static void main(String[] args) {
        Amount a1 = new Amount(1000);
        Customer c = new Customer(a1, "Payal");
        Customer c1 = new Customer(a1, "Sakshi");
        Thread t = new Thread(c);
        Thread t1 = new Thread(c1);
        t.start();
        t1.start();

    }
}