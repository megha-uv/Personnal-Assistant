import javax.swing.*;
import java.awt.*;

public class UpdateProf
{
    JFrame f=new JFrame("LOGIN");
    JButton b1 = new JButton("SUBMIT");
    JComboBox d,d1;
    JLabel k1;
    UpdateProf()
    {
        String s1[] = {" ","NAME","AGE","DESIGNATION","MAIL ID","MOBILE NUMBER"};

        f.setSize(400,400);
        JLabel k1=new JLabel(new ImageIcon("D:\\final.jpg"));
        f.add(k1);

        JLabel k=new JLabel("UPDATE YOUR PROFILE");
        k.setFont(new Font("Verdana",Font.BOLD,36));
        k.setLocation(450,0);
        k.setSize(750,150);
        k1.add(k);

        JLabel l=new JLabel("WHICH PART OF YOUR PROFILE DO YOU WANT TO UPDATE?");
        l.setFont(new Font("Verdana",Font.ITALIC,25));
        l.setLocation(150,150);
        l.setSize(800,150);
        l.setForeground(Color.WHITE);
        k1.add(l);

        d=new JComboBox(s1);
        d.setBounds(1000,200,200,50);
        k1.add(d);

        JLabel l1=new JLabel("ENTER THE UPDATED DETAIL: ");
        l1.setFont(new Font("Verdana",Font.ITALIC,20));
        l1.setLocation(350,250);
        l1.setSize(800,150);
        l1.setForeground(Color.WHITE);
        k1.add(l1);

        JTextField d=new JTextField();
        d.setSize(200,30);
        d.setLocation(670,315);
        k1.add(d);

        JButton b7=new JButton("SUBMIT");
        b7.setFont(new Font("Verdana",Font.PLAIN,20));
        b7.setForeground(Color.black);
        b7.setBounds(650, 450, 150, 50);
        k1.add(b7);

        f.setLayout(new FlowLayout());
        f.setVisible(true);

    }


    public static void main(String[] args) {
        UpdateProf n=new UpdateProf();
    }


}
