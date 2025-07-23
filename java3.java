// How to access private static member in main class without creating the object for it
class Demo{
    private static int x;
    static void f1(){
        x=5;
    }
}
class java3{
    public static void main(String args[]){
        Demo.f1();
    }
}
// How to access private static member in main class by creating the object for it
class Demo{
    private static int x;
    void f1(){
        x=5;
    }
}
class java3{
    public static void main(String args[]){
        Demo d1=new Demo();
        d1.f1();
    }
}