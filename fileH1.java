import java.io.*;

public class fileH1 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        // System.out.println(f.exists());
        // System.out.println(f.canWrite());
        // System.out.println(f.length());
        
        System.out.println(f.exists());
        System.out.println(f.canWrite());
        System.out.println(f.length()); 
    }

}
