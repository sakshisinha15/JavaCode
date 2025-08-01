import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class gui2 extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    gui2(String s1) {
        super(s1);

    }

    gui2() {

    }

    void setComponents() {
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Font f1 = new Font("Times New Roman", Font.BOLD, 30);
        Font f2 = new Font("Callibri", Font.BOLD, 12);
        l1 = new JLabel("Welcome to Coding Seekho Institute");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l1.setFont(f1);
        l1.setForeground(Color.RED);
        // b1.setBackground(Color.RED);
        l2.setFont(f2);
        l2.setForeground(Color.RED);
        l3.setFont(f2);
        l3.setForeground(Color.RED);
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("Autofil");
        b3 = new JButton("Add");
        b1.setCursor(c1);
        b2.setCursor(c1);
        b3.setCursor(c1);
        b1.setBackground(Color.RED);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.RED);
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(100, 50, 600, 45);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 300, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
    }

    public static void main(String[] args) {
        gui2 g = new gui2("Welcome to coding seekho ");
        g.setVisible(true);
        g.setSize(700, 700);
        g.setComponents();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s1.equals("coding") && s2.equals("Seekho")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("Login Unsucessful");
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            t1.setText("coding");
            t2.setText("Seekho");
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText("Addition is " + c);
            } catch (Exception e4) {
                l4.setText("Plz enter a nnumber only ");
            }
        }
    }
}
