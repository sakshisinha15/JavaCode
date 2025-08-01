public class except2 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (NullPointerException ns) {

        } finally {
            System.out.println("Z");
        }
        System.out.println("A");
        String s1 = null;
        try {
            System.out.println(s1.length());
        } catch (ArithmeticException e1) {

        } catch (ArrayIndexOutOfBoundsException e2) {

        } finally {
            System.out.println("B");
        }
        System.out.println("C");
    }
}
