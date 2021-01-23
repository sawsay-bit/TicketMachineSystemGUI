import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicketChoose implements ActionListener{
    JFrame frame;
    JLabel label;
    JButton button;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel price;
    JLabel dTicket;
    JLabel wTicket;
    JLabel oneTicket;
    TicketChoose(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(300,200);
    	frame.setTitle("Ticket Choose");
    	frame.setBackground(Color.red);
    	frame.getContentPane().setBackground(Color.black);
    	
    	label = new JLabel("Choose the Ticket");
    	label.setBounds(80,20,170,25);
    	label.setForeground(Color.white);
    	frame.add(label);
    	
    	button = new JButton("Day Ticket");
    	button.setBounds(5,50,100,25);
    	button.setForeground(Color.cyan);
    	button.addActionListener(this);
    	frame.add(button);
    	
    	button1 = new JButton("Week Ticket");
    	button1.setBounds(95,50,100,25);
    	button1.setForeground(Color.cyan);
    	button1.addActionListener(this);
    	frame.add(button1);
    	
    	button2 = new JButton("Oneway Ticket");
    	button2.setBounds(185,50,120,25);
    	button2.setForeground(Color.cyan);
    	button2.addActionListener(this);
    	frame.add(button2);
    	
    	button3 = new JButton("Back");
    	button3.setBounds(30,80,70,25);
    	button3.setForeground(Color.cyan);
    	button3.addActionListener(this);
    	frame.add(button3);
    	
    	button4 = new JButton("Back to Main-menu");
    	button4.setBounds(100,80,180,25);
    	button4.setForeground(Color.cyan);
    	button4.addActionListener(this);
    	frame.add(button4);
    	
    	price = new JLabel("PRICE :");
    	price.setBounds(30,105,80,25);
    	price.setFont(new Font(null,Font.ITALIC,12));
    	price.setForeground(Color.cyan);
    	frame.add(price);
    	
    	dTicket = new JLabel("D-Ticket : 5 €");
    	dTicket.setBounds(40,120,150,25);
    	dTicket.setFont(new Font(null,Font.BOLD,11));
    	dTicket.setForeground(Color.cyan);
    	frame.add(dTicket);
    	
    	wTicket = new JLabel("W-Ticket : 8 €");
    	wTicket.setBounds(40,135,150,25);
    	wTicket.setFont(new Font(null,Font.BOLD,11));
    	wTicket.setForeground(Color.cyan);
    	frame.add(wTicket);
    	
    	oneTicket = new JLabel("One-ticket : 3 €");
    	oneTicket.setBounds(40,150,170,25);
    	oneTicket.setFont(new Font(null,Font.BOLD,11));
    	oneTicket.setForeground(Color.cyan);
    	frame.add(oneTicket);
    	
    	frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button3) {
			frame.dispose();
			new English();
		}
		if(e.getSource()==button4) {
			frame.dispose();
			new Languages();
			}
		if(e.getSource()==button) {
			frame.dispose();
			new DayTicket();
		}
		if(e.getSource()==button1) {
			frame.dispose();
			new WeekTicket();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			new Oneway();
		}
	}
}
