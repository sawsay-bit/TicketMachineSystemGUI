import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WeekTicket implements ActionListener {
     JFrame frame;
     JLabel label;
     JButton button;
     JButton button1;
     JButton button2;
     WeekTicket(){
    	 frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(null);
    	 frame.setSize(300,200);
    	 frame.setTitle("WeekTicket");
    	 frame.getContentPane().setBackground(Color.black);
    	 frame.setBackground(Color.red);
    	 
    	 label = new JLabel("WEEK TICKET");
    	 label.setBounds(60,30,170,30);
    	 label.setFont(new Font(null,Font.BOLD,13));
    	 label.setForeground(Color.cyan);
    	 frame.add(label);
    	 
    	 button = new JButton("Buy");
    	 button.setBounds(30,60,60,25);
    	 button.setFont(new Font(null,Font.BOLD,12));
    	 button.setForeground(Color.cyan);
    	 button.addActionListener(this);
    	 frame.add(button);
    	 
    	 button1 = new JButton("Back");
    	 button1.setBounds(80,60,60,25);
    	 button1.setFont(new Font(null,Font.BOLD,12));
    	 button1.setForeground(Color.cyan);
    	 button1.addActionListener(this);
    	 frame.add(button1);
    	 
    	 button2 = new JButton("Back to main-menu");
    	 button2.setBounds(130,60,150,25);
    	 button2.setFont(new Font(null,Font.BOLD,12));
    	 button2.setForeground(Color.cyan);
    	 button2.addActionListener(this);
    	 frame.add(button2);
    	 
    	 frame.setVisible(true);
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			frame.dispose();
			new TicketChoose();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			new Languages();
		}
		if(e.getSource()==button) {
			frame.dispose();
			new WMoney();
		}
	}
}
