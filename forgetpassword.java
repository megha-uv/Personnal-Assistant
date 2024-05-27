import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forgotpsswd implements ActionListener
{
    JButton b1 = new JButton("PROCEED");
    forgotpsswd() {
        JFrame f = new JFrame("FORGOT PASSWORD");
        f.setSize(500, 500);

        /*UPLOADING THE BACKGROUND PICTURE TO FILE*/
        JLabel k1 = new JLabel(new ImageIcon("D:\\final.jpg"));
        f.add(k1);

        /*LABEL FOR TITLE*/
        JLabel k = new JLabel(" ENTER THE FOLLOWING DETAILS TO CHANGE YOUR PASSWORD ");
        k.setFont(new Font("Verdana", Font.BOLD, 30));
        k.setLocation(100, 0);
        k.setSize(1500, 150);
        k1.add(k);

        /*LABEL AND TEXTBOX FOR NAME*/
        JLabel l = new JLabel("EMAIL ID");
        l.setFont(new Font("Verdana", Font.ITALIC, 25));
        l.setForeground(Color.WHITE);
        l.setLocation(350, 100);
        l.setSize(500, 150);
        k1.add(l);

        JTextField d = new JTextField();
        d.setSize(200, 30);
        d.setLocation(600, 156);
        k1.add(d);

        /*LABEL AND TEXTBOX FOR AGE*/
        JLabel l1 = new JLabel("PHONE NUMBER");
        l1.setFont(new Font("Verdana", Font.ITALIC, 25));
        l1.setForeground(Color.WHITE);
        l1.setLocation(350, 200);
        l1.setSize(500, 150);
        k1.add(l1);

        b1.setFont(new Font("Verdana",Font.PLAIN,20));
        b1.setForeground(Color.black);
        b1.setBounds(650, 436, 150, 50);
        b1.addActionListener(this);
        k1.add(b1);

        JTextField d1=new JTextField();
        d1.setSize(200,30);
        d1.setLocation(600,256);
        k1.add(d1);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(b1.isEnabled())
        {
            ResetPassword n=new ResetPassword();
        }
    }

    public static void main(String[] args) {
        forgotpsswd n=new forgotpsswd();
    }
}
