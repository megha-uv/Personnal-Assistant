import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    public class Adminlog
    {

        /*CREATING OBJECT FOR FRAME AND BUTTONS*/
        JFrame f=new JFrame("LOGIN");
        JButton b1 = new JButton("SUBMIT");

        Adminlog()
        {
            /*SETTING SIZE OF FRAME AND BACKGROUND IMAGE*/
            f.setSize(500,500);
            JLabel k1=new JLabel(new ImageIcon("D:\\final.jpg"));
            f.add(k1);

            /*LABEL FOR TITLE OF LOGIN PAGE*/
            JLabel k=new JLabel(" WELCOME TO ADMIN LOGIN PAGE");
            k.setFont(new Font("Verdana",Font.BOLD,36));
            k.setLocation(400,0);
            k.setSize(750,150);
            k1.add(k);

            /*LABEL AND TEXTBOX FOR USERNAME*/
            JLabel l=new JLabel("USERNAME");
            l.setFont(new Font("Verdana",Font.ITALIC,25));
            l.setLocation(550,150);
            l.setSize(500,150);
            l.setForeground(Color.WHITE);
            k1.add(l);

            JTextField d=new JTextField();
            d.setSize(200,30);
            d.setLocation(750,210);
            k1.add(d);

            /*LABEL ADN TEXTBOX FOR PASSWORD*/
            JLabel l1=new JLabel("PASSWORD");
            l1.setFont(new Font("Verdana",Font.ITALIC,25));
            l1.setLocation(550,250);
            l1.setSize(500,150);
            l1.setForeground(Color.WHITE);
            k1.add(l1);

            JTextField d1=new JTextField();
            d1.setSize(200,30);
            d1.setLocation(750,310);
            k1.add(d1);

            /*SETTING THE SUBMIT BUTTON'S FONT,COLOR*/
            b1.setFont(new Font("Verdana",Font.PLAIN,20));
            b1.setForeground(Color.black);
            b1.setBounds(650, 450, 150, 50);
            k1.add(b1);

            /*SETTING LAYOUT*/
            f.setLayout(new FlowLayout());
            f.setVisible(true);
        }

        /*DRIVER CODE*/
        public static void main(String[] args) {
            Adminlog n=new Adminlog();
        }

    }


