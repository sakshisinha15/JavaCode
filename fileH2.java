import java.io.*;

public class fileH2 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        FileOutputStream t1 = new FileOutputStream(f);
        t1.write('C');
        t1.close();
    }

}
