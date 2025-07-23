class Wrapperclass {
    public static void main(String args[]) {
        int x = Integer.parseInt("123");
        Integer x1 = Integer.valueOf("10110", 2);
        int y = x1.intValue();
        System.out.println(x);
        System.out.println(y);
        Double d = Double.valueOf("56");
        double z = d.doubleValue();
        System.out.println(z);
    }
}
// in double only 1 argument is passed in valueOf function