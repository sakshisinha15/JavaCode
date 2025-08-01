import javax.swing.*;

public class gui1 extends JFrame {
    gui1(String s1) {
        super(s1);

    }

    gui1() {

    }

    void setComponents() {
        JLabel l1 = new JLabel("Welcome");
        JTextField f = new JTextField();
        setLayout(null);
        l1.setBounds(200, 100, 100, 30);
        f.setBounds(200, 200, 100, 30);
        add(f);
        add(l1);

    }

    public static void main(String[] args) {
        gui1 g = new gui1("Welcome to coding seekho ");
        g.setVisible(true);
        g.setSize(700, 700);
        g.setComponents();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
