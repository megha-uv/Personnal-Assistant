import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings implements ActionListener
{
    JButton h1=new JButton("CHANGE PASSWORD");
    JButton h2=new JButton("UPDATE ROUTINE");
    JButton h3=new JButton("MODIFY USER PROFILE");
    JButton h4=new JButton("EXIT");
    JFrame f;
    Settings()
    {
        JFrame f=new JFrame("SETTINGS");
        f.setSize(500,500);

        JLabel l= new JLabel(new ImageIcon("D:\\home1.jpg"));
        f.add(l);

        JLabel l1=new JLabel("SETTINGS");
        l1.setFont(new Font("Geneva",Font.BOLD,50));
        l1.setLocation(300,0);
        l1.setSize(750,150);
        l1.setForeground(Color.WHITE);
        l.add(l1);


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
            forgotpsswd n=new forgotpsswd();
        }
        if(str == h2)
        {
            UpdateRoutine m=new UpdateRoutine();
        }
        if(str == h3)
        {
            UpdateProf n=new UpdateProf();
        }
        if(str == h4)
        {
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        Settings n=new Settings();
    }


}
