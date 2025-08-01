import java.io.IOException;

public class excpet5 {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            throw new IOException("Printer not found ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
