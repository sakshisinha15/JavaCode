public class cla {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        // System.out.println(args[4]);
        for (int i = 0; i < args.length; i++) {
            System.out.println(Integer.parseInt(args[i]));
        }
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
