import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class English implements ActionListener{
    JFrame frame;
    JLabel eLabel;
    JButton go;
    JButton back;
    English(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(300,200);
    	frame.setTitle("English");
    	frame.getContentPane().setBackground(Color.DARK_GRAY);
    	
    	eLabel = new JLabel("WELCOME");
    	eLabel.setBounds(100,20,90,25);
    	eLabel.setFont(new Font(null,Font.BOLD,12));
    	eLabel.setForeground(Color.red);
    	frame.add(eLabel);
    	
    	go = new JButton("Continue");
    	go.setBounds(70,50,90,25);
    	go.setForeground(Color.blue);
    	go.addActionListener(this);
    	frame.add(go);
    	
    	back = new JButton("Back");
    	back.setBounds(150,50,70,25);
    	back.setForeground(Color.blue);
    	back.addActionListener(this);
    	frame.add(back);
    	
    	frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==go) {
			frame.dispose();
			new TicketChoose();
		}
		if(e.getSource()==back) {
			frame.dispose();
			new Languages();
		}
	}
}
