import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pay implements ActionListener{
    JFrame frame;
    JLabel label;
    JTextField changeField;
    JTextField ticketField;
    JTextField errorField;
    JButton button;
    JButton button1;
    Pay(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(300,200);
    	frame.setTitle("Pay");
    	frame.getContentPane().setBackground(Color.black);
    	
    	label = new JLabel("Here is : ");
    	label.setBounds(30,30,170,25);
    	label.setFont(new Font(null,Font.BOLD,12));
    	label.setForeground(Color.cyan);
    	frame.add(label);
    	
    	changeField = new JTextField(20);
    	changeField.setBounds(30,60,180,25);
    	frame.add(changeField);
    	
    	ticketField = new JTextField(30);
    	ticketField.setBounds(30,90,180,25);
    	frame.add(ticketField);
    	
    	button = new JButton("Print Ticket");
    	button.setBounds(30,120,100,25);
    	button.setFont(new Font(null,Font.BOLD,12));
    	button.setForeground(Color.cyan);
    	button.addActionListener(this);
    	frame.add(button);
    	
    	button1 = new JButton("EXIT");
    	button1.setBounds(120,120,70,25);
    	button1.setFont(new Font(null,Font.BOLD,12));
    	button1.setForeground(Color.cyan);
    	button1.addActionListener(this);
    	frame.add(button1);
    	
    	/*errorField = new JTextField(30);
    	errorField.setBounds(30,130,200,25);
    	frame.add(errorField);*/
    	
    	frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			frame.dispose();
			new PTicket();
		}
		if(e.getSource()==button1) {
			frame.dispose();
			new Languages();
		}
	}
}
