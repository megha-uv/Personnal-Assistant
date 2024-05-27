import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration2 implements ActionListener
{
    JLabel l4 = new JLabel("WHAT'S YOUR WAKE UP TIME ?");
    Registration2() {
        JFrame f=new JFrame("NEXT");
        f.setSize(400,400);
        JLabel k1=new JLabel(new ImageIcon("D:\\final.jpg"));
        f.add(k1);
        JLabel l3 = new JLabel("FEW MORE QUESTIONS..");
        l3.setFont(new Font("Verdana",Font.BOLD,30));
        l3.setForeground(Color.black);
        l3.setLocation(100, 0);
        l3.setSize(500, 150);
        k1.add(l3);
        l4.setFont(new Font("Verdana",Font.ITALIC,25));
        l4.setForeground(Color.WHITE);
        l4.setLocation(150, 100);
        l4.setSize(500, 150);
        k1.add(l4);
        JTextField d3 = new JTextField();
        d3.setSize(200, 30);
        d3.setLocation(1000, 153);
        d3.setLocation(1000,153);
        k1.add(d3);
        JLabel l5 = new JLabel("WHAT TIME DO YOU PREFER TO HAVE MORNING COFFEE ?");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Verdana",Font.ITALIC,25));
        l5.setLocation(150, 200);
        l5.setSize(820, 150);
        k1.add(l5);
        JTextField d4 = new JTextField();
        d4.setSize(200, 30);
        d4.setLocation(1000, 253);
        k1.add(d4);
        JLabel l6 = new JLabel("WHAT TIME DO YOU PREFER TO HAVE BREAKFAST ?");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Verdana",Font.ITALIC,25));
        l6.setLocation(150, 300);
        l6.setSize(750, 150);
        k1.add(l6);
        JTextField d5 = new JTextField();
        d5.setSize(200, 30);
        d5.setLocation(1000, 353);
        k1.add(d5);
        JLabel l7 = new JLabel("WHAT TIME DO YOU PREFER TO HAVE YOUR MORNING BREAK ?");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Verdana",Font.ITALIC,25));
        l7.setLocation(150, 400);
        l7.setSize(850, 150);
        k1.add(l7);
        JTextField d6 = new JTextField();
        d6.setSize(200, 30);
        d6.setLocation(1000, 453);
        k1.add(d6);
        JLabel l8 = new JLabel("WHAT TIME DO YOU PREFER TO HAVE YOUR LUNCH BREAK ?");
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Verdana",Font.ITALIC,25));
        l8.setLocation(150, 500);
        l8.setSize(850, 150);
        k1.add(l8);
        JTextField d7 = new JTextField();
        d7.setSize(200, 30);
        d7.setLocation(1000, 553);
        k1.add(d7);
        JButton b1 = new JButton("NEXT");
        b1.setFont(new Font("Verdana",Font.PLAIN,20));
        b1.setForeground(Color.black);
        b1.setBounds(650, 630, 150, 50);
        b1.addActionListener(this);
        k1.add(b1);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Registration3 n=new Registration3();
    }
    public static void main(String[] args) {
        Registration2 n=new Registration2();
    }

}
