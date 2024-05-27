import java.awt.BorderLayout; 
 import java.awt.FlowLayout; 
 import java.awt.LayoutManager; 
 import java.awt.event.ActionEvent; 
 import java.awt.event.ActionListener; 
 import javax.swing.JButton; 
 import javax.swing.JFrame; 
 import javax.swing.JOptionPane; 
 import javax.swing.JPanel; 
 import javax.swing.JLabel; 
 import javax.swing.*; 
public class Notification { 
 public static void main(String[] args) { 
 createWindow(); 
 } 
 private static void createWindow() { 
 JFrame frame = new JFrame("Notification"); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 createUI(frame); 
 frame.setSize(560, 200); 
 frame.setLocationRelativeTo(null); 
 frame.setVisible(true); 
 } 
 private static void createUI(final JFrame frame){ 
 JPanel panel = new JPanel(); 
 LayoutManager layout = new FlowLayout(); 
 panel.setLayout(layout); 
 JLabel l1 = new JLabel(new ImageIcon("c:\\coffee.jpg"));  panel.add(l1); 
 JButton button = new JButton("Know your Schedule"); 
 button.addActionListener(new ActionListener() { 
 @Override 
 public void actionPerformed(ActionEvent e) { 
 JOptionPane.showMessageDialog(frame, "Its Coffee timee!!");  } 
 }); 
 panel.add(button); 
 frame.getContentPane().add(panel, BorderLayout.CENTER);  } 
}
