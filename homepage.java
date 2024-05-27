import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
public class Home extends Canvas implements ActionListener
{
    JLabel l1=new JLabel("WELCOME BACK!");
    JButton h1=new JButton("YOUR ROUTINE FOR TODAY");
    JButton h2=new JButton("SETTINGS");
    JButton h3=new JButton("KNOW MORE ABOUT PA");
    JButton h4=new JButton("EXIT");

    JFrame f;
    Home()
    {
        LocalTime n=LocalTime.now();
        int hour =n.getHour();
        int minute=n.getMinute();
        int seconds=n.getSecond();

        JFrame f=new JFrame("HOME");
        f.setSize(500,500);

        JLabel l= new JLabel(new ImageIcon("D:\\home1.jpg"));
        f.add(l);


        l1.setFont(new Font("Geneva",Font.BOLD,50));
        l1.setLocation(300,0);
        l1.setSize(750,150);
        l1.setForeground(Color.WHITE);
        l.add(l1);

        JLabel l5=new JLabel(String.valueOf(n.getHour()));
        l5.setFont(new Font("Geneva",Font.BOLD,35));
        l5.setLocation(1200,0);
        l5.setSize(750,150);
        l5.setForeground(Color.black);
        l.add(l5);

        JLabel l51=new JLabel("::");
        l51.setFont(new Font("Geneva",Font.BOLD,35));
        l51.setLocation(1255,0);
        l51.setSize(750,150);
        l51.setForeground(Color.black);
        l.add(l51);


        JLabel l6=new JLabel(String.valueOf(n.getMinute()));
        l6.setFont(new Font("Geneva",Font.BOLD,35));
        l6.setLocation(1300,0);
        l6.setSize(750,150);
        l6.setForeground(Color.black);
        l.add(l6);

        JLabel l52=new JLabel("::");
        l52.setFont(new Font("Geneva",Font.BOLD,35));
        l52.setLocation(1355,0);
        l52.setSize(750,150);
        l52.setForeground(Color.black);
        l.add(l52);


        JLabel l7=new JLabel(String.valueOf(n.getSecond()));
        l7.setFont(new Font("Geneva",Font.BOLD,35));
        l7.setLocation(1400,0);
        l7.setSize(750,150);
        l7.setForeground(Color.black);
        l.add(l7);



        h1.setFont(new Font("Verdana",Font.PLAIN,30));
        h1.setForeground(Color.black);
        h1.addActionListener(this);
        h1.setBounds(300, 200, 550, 150);
        l.add(h1);


        h2.setFont(new Font("Verdana",Font.PLAIN,30));
        h2.setForeground(Color.black);
        h2.addActionListener(this);
        h2.setBounds(1000, 200, 550, 150);
        l.add(h2);


        h3.setFont(new Font("Verdana",Font.PLAIN,30));
        h3.setForeground(Color.black);
        h3.addActionListener(this);
        h3.setBounds(300, 500, 550, 150);
        l.add(h3);


        h4.setFont(new Font("Verdana",Font.PLAIN,30));
        h4.setForeground(Color.black);
        h4.addActionListener(this);
        h4.setBounds(1000, 500, 550, 150);
        l.add(h4);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object str=e.getSource();
        if(str == h1)
        {

        }
        if (str == h2)
        {
           Settings n=new Settings();
        }
        if (str == h3 )
        {
            KnowMore n=new KnowMore();
        }
        if (str ==  h4) {
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

    }
    public static void main(String[] args) {
        Home n=new Home();
    }
