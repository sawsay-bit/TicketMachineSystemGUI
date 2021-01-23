import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Languages implements ActionListener{
	JFrame frame;
	JLabel label;
	JButton button;
	JButton button1;
	ImageIcon icon;
	ImageIcon icon1;
	JLabel german;
	JLabel english;
	Languages(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setTitle("Faharte Automat");
		frame.setSize(300,200);
		frame.setBackground(Color.red);
		frame.getContentPane().setBackground(Color.black);
		
		label = new JLabel("Choose Language");
		label.setBounds(70,20,130,25);
		label.setFont(new Font(null,Font.BOLD,13));
		label.setForeground(Color.blue);
		frame.add(label);
		
		icon = new ImageIcon("src/DE-Germany-Flag-icon.png");
		
		icon1 = new ImageIcon("src/US-United-States-Flag-icon.png");
		
		button = new JButton();
		button.setBounds(70,60,50,30);
		button.setIcon(icon);
		button.addActionListener(this);
		frame.add(button);
		
		button1 = new JButton();
		button1.setBounds(150,60,50,30);
		button1.setIcon(icon1);
		button1.addActionListener(this);
		frame.add(button1);
		
		german = new JLabel("German");
		german.setBounds(70,90,70,25);
		german.setFont(new Font(null,Font.BOLD,12));
		german.setForeground(Color.blue);
		frame.add(german);
		
		english = new JLabel("English");
		english.setBounds(150,90,70,25);
		english.setFont(new Font(null,Font.BOLD,12));
		english.setForeground(Color.blue);
		frame.add(english);
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			frame.dispose();
			new German();
		}
		if(e.getSource()== button1) {
			frame.dispose();
			new English();
		}
	}
}
  
