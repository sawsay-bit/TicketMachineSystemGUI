import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WMoney implements ActionListener{
    JFrame frame;
    JLabel label;
    JTextField field;
    JButton button;
    JButton button1;
    JButton button2;
    JLabel error;
    WMoney(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(300,200);
    	frame.setTitle("To pay");
    	frame.setBackground(Color.green);
    	frame.getContentPane().setBackground(Color.black);
    	
    	label = new JLabel("Enter money between 8 and 20");
    	label.setBounds(10,30,230,25);
    	label.setFont(new Font(null,Font.BOLD,13));
    	label.setForeground(Color.cyan);
    	frame.add(label);
    	
    	field = new JTextField(20);
    	field.setBounds(10,60,70,25);
    	frame.add(field);
    	
    	button = new JButton("Comfirm");
    	button.setBounds(80,60,80,25);
    	button.setFont(new Font(null,Font.BOLD,12));
    	button.setForeground(Color.cyan);
    	button.addActionListener(this);
    	frame.add(button);
    	
    	button1 = new JButton("Reset");
    	button1.setBounds(160,60,70,25);
    	button1.setFont(new Font(null,Font.BOLD,12));
    	button1.setForeground(Color.cyan);
    	button1.addActionListener(this);
    	frame.add(button1);
    	
    	button2 = new JButton("Back");
    	button2.setBounds(80,100,70,25);
    	button2.setFont(new Font(null,Font.BOLD,12));
    	button2.setForeground(Color.cyan);
    	button2.addActionListener(this);
    	frame.add(button2);
    	
    	error = new JLabel("");
    	error.setBounds(80,130,165,25);
    	error.setFont(new Font(null,Font.ITALIC,12));
    	error.setForeground(Color.red);
    	frame.add(error);
    	
    	frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			//frame.dispose();
			field.setText("");
		}
		if(e.getSource()==button2) {
			frame.dispose();
			new WeekTicket();
		}
		int wPrice = 8;
		int input = Integer.parseInt(field.getText());
		if(input > 8 && input <= 20 ) {
			int changeMoney = input - wPrice;
			frame.dispose();
			Pay p = new Pay();
			p.changeField.setText("ChangM : " + changeMoney + "€");
			p.ticketField.setText("here is ticket");
		}else if(input == 8) {
			frame.dispose();
			Pay p = new Pay();
			p.changeField.setText("No change");
			p.ticketField.setText("here is ticket");
		}else {
			//frame.dispose();
			/*Pay p = new Pay();
			p.changeField.setText("Money is big or smaller");
			p.ticketField.setText("try again");*/
			//new WMoney();
			error.setText("Money is bigger or smaller");
		}
	}
}
