class Nokia{
    private int mic;
    private int cam;
    void setValue(){
        mic=2;
        cam=3;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
class classesandobject{
    public static void main(String args[]){
        Nokia n=new Nokia();
        n.display();
        n.setValue();
        n.display();
    }
}