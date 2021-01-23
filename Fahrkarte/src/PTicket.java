import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PTicket {
      JFrame frame;
      JLabel label;
      JLabel label1;
      ImageIcon icon;
      PTicket(){
    	  frame = new JFrame();
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  frame.setLayout(null);
    	  frame.setSize(165,180);
    	  frame.setTitle("Printed Ticket");
    	  frame.setBackground(Color.green);
    	  frame.getContentPane().setBackground(Color.green);
    	  
    	  icon = new ImageIcon("src/ticket-icon.png");
    	  
    	  label = new JLabel();
    	  label.setBounds(15,0,165,180);
    	  label.setIcon(icon);
    	  frame.add(label);
    	  
    	  label1 = new JLabel("Enjoy your travel");
    	  label1.setBounds(30,20,165,25);
    	  label1.setFont(new Font(null,Font.ITALIC,12));
    	  frame.add(label1);
    	  
    	  frame.setVisible(true);
      }
}
