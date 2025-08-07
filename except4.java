import java.io.*;

//compile time exception
public class except4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
        System.out.println("Hello A");
        throw new IOException();
        // System.out.println("Hello B");// unreachable line
    }

}
