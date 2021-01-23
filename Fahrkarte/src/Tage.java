import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tage implements ActionListener{
     JFrame frame;
     JLabel label;
     JButton button;
     JButton button1;
     JButton button2;
     Tage(){
    	 frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(null);
    	 frame.setBackground(Color.green);
    	 frame.getContentPane().setBackground(Color.black);
    	 frame.setSize(300,200);
    	 frame.setTitle("Tageskarte");
    	 
    	 label = new JLabel("TAGESKARTE");
    	 label.setBounds(60,30,170,30);
    	 label.setFont(new Font(null,Font.BOLD,13));
    	 label.setForeground(Color.cyan);
    	 frame.add(label);
    	 
    	 button = new JButton("Kaufen");
    	 button.setBounds(10,60,70,25);
    	 button.setFont(new Font(null,Font.BOLD,12));
    	 button.setForeground(Color.cyan);
    	 button.addActionListener(this);
    	 frame.add(button);
    	 
    	 button1 = new JButton("Zurück");
    	 button1.setBounds(80,60,70,25);
    	 button1.setFont(new Font(null,Font.BOLD,12));
    	 button1.setForeground(Color.cyan);
    	 button1.addActionListener(this);
    	 frame.add(button1);
    	 
    	 button2 = new JButton("Start-menu");
    	 button2.setBounds(150,60,100,25);
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
			new FahrkarteWahl();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			new Languages();
		}
		if(e.getSource()==button) {
			frame.dispose();
			new TGeld();
		}
	}
}
