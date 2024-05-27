import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.*; 
import javax.swing.JPasswordField; 
public class ResetPassword implements ActionListener {  Connection con = Database.connectdb();  PreparedStatement ps =null; 
 ResultSet rs = null; 
 JFrame f; 
 JLabel k1,k; 
  
 public ResetPassword() throws SQLException {  initComponents(); 
 Database.connectdb(); 
  
  
 JButton b1 = new JButton("PROCEED"); 
 JTextField d ,d1 = new JTextField(); 
  
 k1 = new JLabel(new ImageIcon("D:\\final.jpg"));  f = new JFrame("CHANGE PASSWORD");
 JPasswordField password =new JPasswordField(); 
  
 f.setSize(500, 500); 
 f.add(k1); 
 /*LABEL FOR TITLE*/ 
 k = new JLabel(" ENTER THE FOLLOWING DETAILS TO CHANGE YOUR PASSWORD ");  k.setFont(new Font("Verdana", Font.BOLD, 30)); 
 k.setLocation(100, 0); 
 k.setSize(1500, 150); 
 k1.add(k); 
 /*LABEL AND TEXTBOX FOR NAME*/ 
 JLabel l = new JLabel("NEW PASSWORD"); 
 l.setFont(new Font("Verdana", Font.ITALIC, 25)); 
 l.setForeground(Color.WHITE); 
 l.setLocation(350, 100); 
 l.setSize(500, 150); 
 k1.add(l); 
 d = new JTextField(); 
 d.setSize(200, 30); 
 d.setLocation(700, 156); 
 k1.add(d); 
 /*LABEL AND TEXTBOX FOR PHONE NUMBER*/ 
 JLabel l1 = new JLabel("CONFIRM NEW PASSWORD"); 
 l1.setFont(new Font("Verdana", Font.ITALIC, 25)); 
 l1.setForeground(Color.WHITE); 
 l1.setLocation(350, 200); 
 l1.setSize(500, 150);
 k1.add(l1); 
 d1.setSize(200, 30); 
 d1.setLocation(700, 256); 
 k1.add(d1); 
 f.setLayout(new FlowLayout()); 
 f.setVisible(true); 
 b1.setFont(new Font("Verdana", Font.PLAIN, 20)); 
 b1.setForeground(Color.black); 
 b1.addActionListener(this); 
 b1.setBounds(650, 636, 150, 50); 
 k1.add(b1); 
 f.setLayout(new FlowLayout()); 
 f.setVisible(true); 
 @Override 
 public void actionPerformed(ActionEvent e) { 
  
 UPDATE REGISTRATION SET Location =d.getString(), WHERE MAILID=Sring n;  JLabel l3 = new JLabel("YOUR PASSWORD HAS BEEN UPDATED");  l3.setFont(new Font("Verdana", Font.ITALIC, 25)); 
 l3.setForeground(Color.WHITE); 
 l3.setLocation(350, 200); 
 l3.setSize(500, 150); 
 k1.add(l3); 
 f.setLayout(new FlowLayout()); 
 f.setVisible(true); 
 }
 public static void main (String[]args){ 
 java.awt.EventQueue.invokeLater(new Runnable() { 
 public void run() { 
 try { 
 new ResetPassword().setVisible(true); 
 } catch (SQLException ex) { 
 Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);  } 
 } 
 }); 
 try { 
 ResetPassword n = new ResetPassword(); 
 } catch (SQLException ex) { 
 Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);  } 
 } 
 ResetPassword(String text) { 
 throw new UnsupportedOperationException("Not supported yet."); //To change body of  generated methods, choose Tools | Templates. 
 } 
 private void initComponents() { 
 throw new UnsupportedOperationException("Not supported yet."); //To change body of  generated methods, choose Tools | Templates. 
 } 
 private void setVisible(boolean b) { 
 throw new UnsupportedOperationException("Not supported yet."); //To change body of  generated methods, choose Tools | Templates. 
}
