class Area{
    static void fun1(){
        System.out.println("Area1");
    }
    static void fun2(){
        System.out.println("Area2");
    }
}

public class Java1{
    static void fun1(){
        System.out.println("A");
    }
    static void fun2(){
        System.out.println("B");
    }
    public static void main(String[] args){
        System.out.println("C");
        fun1();
        fun2();
        Area.fun1();
        Area.fun2();
    }
}
