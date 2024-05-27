import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration1 implements ActionListener
{
    JButton b1 = new JButton("NEXT");
    Registration1()
    {
        /*CREATING BASIC FORM*/
        JFrame f=new JFrame("REGISTRATION FORM");
        f.setSize(500,500);

        /*UPLOADING THE BACKGROUND PICTURE TO FILE*/
        JLabel k1=new JLabel(new ImageIcon("D:\\final.jpg"));
        f.add(k1);

        /*LABEL FOR TITLE*/
        JLabel k=new JLabel(" PLEASE SHARE YOUR DETAILS WITH US TO KNOW MORE ABOUT YOU");
        k.setFont(new Font("Verdana",Font.BOLD,30));
        k.setLocation(100,0);
        k.setSize(1500,150);
        k1.add(k);

        /*LABEL AND TEXTBOX FOR NAME*/
        JLabel l=new JLabel("NAME");
        l.setFont(new Font("Verdana",Font.ITALIC,25));
        l.setForeground(Color.WHITE);
        l.setLocation(350,100);
        l.setSize(500,150);
        k1.add(l);

        JTextField d=new JTextField();
        d.setSize(200,30);
        d.setLocation(600,156);
        k1.add(d);

        /*LABEL AND TEXTBOX FOR AGE*/
        JLabel l1=new JLabel("AGE");
        l1.setFont(new Font("Verdana",Font.ITALIC,25));
        l1.setForeground(Color.WHITE);
        l1.setLocation(350,200);
        l1.setSize(500,150);
        k1.add(l1);

        JTextField d1=new JTextField();
        d1.setSize(200,30);
        d1.setLocation(600,256);
        k1.add(d1);

        /*LABEL AND TEXTBOX FOR DESIGNAITON*/
        JLabel l2=new JLabel("DESIGNATION");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Verdana",Font.ITALIC,25));
        l2.setLocation(350,300);
        l2.setSize(500,150);
        k1.add(l2);

        JTextField d2=new JTextField();
        d2.setSize(200,30);
        d2.setLocation(600,356);
        k1.add(d2);

        /*LABEL AND TEXTBOX FOR MAILID*/
        JLabel l3=new JLabel("MAIL ID");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Verdana",Font.ITALIC,25));
        l3.setLocation(350,400);
        l3.setSize(500,150);
        k1.add(l3);

        JTextField d3=new JTextField();
        d3.setSize(200,30);
        d3.setLocation(600,456);
        k1.add(d3);

        /*LABEL AND TEXTBOX FOR MOBILE NUMBER*/
        JLabel l4=new JLabel("MOBILE NUMBER");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Verdana",Font.ITALIC,25));
        l4.setLocation(350,500);
        l4.setSize(500,150);
        k1.add(l4);

        JTextField d4=new JTextField();
        d4.setSize(200,30);
        d4.setLocation(600,556);
        k1.add(d4);

        /*SETTING FONT,LISTENER FOR SUBMIT BUTTON*/
        b1.setFont(new Font("Verdana",Font.PLAIN,20));
        b1.setForeground(Color.black);
        b1.setBounds(650, 636, 150, 50);
        b1.addActionListener(this);
        k1.add(b1);

        /*SETTING LAYOUT*/
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    /*METHOD TO LINK REGISTRATION PAGE2 WITH REGISTRATION PAGE1*/
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(b1.isEnabled())
        {
            Registration2 n=new Registration2();
        }
    }

    /*DRIVER CODE*/
    public static void main(String[] args)
    {
        Registration1 n=new Registration1();
    }

}
