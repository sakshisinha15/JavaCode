public class except3 {
    public static void main(String[] args) {

        int cb = 10000;
        int wb = 14000;
        try {
            if (cb < wb) {
                throw new ArithmeticException("Insuffiencient Balance");
            }
            cb = cb - wb;
            System.out.println("Transaction Successful");
            System.out.println("Current Balance is: " + cb);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
            System.out.println("Curent balance is " + cb);
        }
    }
}