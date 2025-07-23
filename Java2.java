class Mahesh{
    int x;//instance(object) member variable
    int y;//instance(object) member variable
    void fun1(){ //instance(object) member function
        System.out.println("fun1");
    }
    void fun2(){
        System.out.println("fun2");
    }
}
public class Java2{
    public static void main(String args[]){
          Mahesh mh=new Mahesh();
          Mahesh mh1=new Mahesh();
          mh.x=5;
          //mh.y=10;
          System.out.println(mh.y);
          System.out.println(mh.x);
          //Mahesh mh1=new Mahesh();
          mh1.x=51;
          System.out.println(mh1.y);
          System.out.println(mh1.x);
          mh.fun1();
          mh.fun2();
    }
}