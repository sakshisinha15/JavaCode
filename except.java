public class except {
    public static void main(String[] args) {
        // System.out.println("A");
        // try {
        // System.out.println(5 / 0);
        // } catch (ArithmeticException n1) {
        // System.out.println(n1.getMessage());
        // }
        // System.out.println("B");
        // String s1 = null;
        // try {
        // System.out.println(s1.length());
        // } catch (NullPointerException c) {
        // System.out.println(c.getMessage());
        // }
        // or
        String s1 = null;
        try {
            System.out.println(5 / 0);
            System.out.println(s1.length());
        } catch (ArithmeticException n1) {
            System.out.println(n1.getMessage());
        } catch (NullPointerException c) {
            System.out.println(c.getMessage());
        }
        System.out.println("A");
        System.out.println("B");

    }
}
