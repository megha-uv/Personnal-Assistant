import javax.swing.*;
import java.awt.*;

public class RoutineDisp
{
    RoutineDisp()
    {
        JFrame f=new JFrame("ROUTINE DISPLAY");
        f.setSize(500,500);

        JLabel l= new JLabel(new ImageIcon("D:\\home1.jpg"));
        f.add(l);

        JLabel l1=new JLabel("YOUR ROUTINES FOR TODAY ARE: ");
        l1.setFont(new Font("Geneva",Font.BOLD,50));
        l1.setLocation(300,0);
        l1.setSize(1050,150);
        l1.setForeground(Color.WHITE);
        l.add(l1);

        JButton h1=new JButton("WAKE UP:");
        h1.setFont(new Font("Verdana",Font.PLAIN,25));
        h1.setForeground(Color.black);
        //h1.addActionListener(this);
        h1.setBounds(300, 150, 350, 100);
        l.add(h1);

        JButton h2=new JButton("MORNING COFFEE TIME:");
        h2.setFont(new Font("Verdana",Font.PLAIN,25));
        h2.setForeground(Color.black);
        //h2.addActionListener(this);
        h2.setBounds(300, 260, 350,100);
        l.add(h2);

        JButton h3=new JButton("BREAKFAST : ");
        h3.setFont(new Font("Verdana",Font.PLAIN,25));
        h3.setForeground(Color.black);
        //h3.addActionListener(this);
        h3.setBounds(300, 370, 350, 100);
        l.add(h3);

        JButton h4=new JButton("MORNING BREAK : ");
        h4.setFont(new Font("Verdana",Font.PLAIN,25));
        h4.setForeground(Color.black);
        //h3.addActionListener(this);
        h4.setBounds(300, 480, 350, 100);
        l.add(h4);


        JButton h7=new JButton("LUNCH TIME : ");
        h7.setFont(new Font("Verdana",Font.PLAIN,25));
        h7.setForeground(Color.black);
        //h3.addActionListener(this);
        h7.setBounds(300, 590, 350, 100);
        l.add(h7);

        JButton h8=new JButton("EVENING BREAK : ");
        h8.setFont(new Font("Verdana",Font.PLAIN,25));
        h8.setForeground(Color.black);
        //h3.addActionListener(this);
        h8.setBounds(1000, 150, 350, 100);
        l.add(h8);

        JButton h9=new JButton("EXERCISE TIME: ");
        h9.setFont(new Font("Verdana",Font.PLAIN,25));
        h9.setForeground(Color.black);
        //h3.addActionListener(this);
        h9.setBounds(1000, 260, 350, 100);
        l.add(h9);

        JButton h10=new JButton("COFFEE TIME : ");
        h10.setFont(new Font("Verdana",Font.PLAIN,25));
        h10.setForeground(Color.black);
        //h3.addActionListener(this);
        h10.setBounds(1000,370,350,100);
        l.add(h10);

        JButton h11=new JButton("DINNER TIME : ");
        h11.setFont(new Font("Verdana",Font.PLAIN,25));
        h11.setForeground(Color.black);
        //h3.addActionListener(this);
        h11.setBounds(1000,480, 350, 100);
        l.add(h11);

        JButton h12=new JButton("BED TIME: ");
        h12.setFont(new Font("Verdana",Font.PLAIN,25));
        h12.setForeground(Color.black);
        //h3.addActionListener(this);
        h12.setBounds(1000,590, 350, 100);
        l.add(h12);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
      RoutineDisp n=new RoutineDisp();
    }
}
