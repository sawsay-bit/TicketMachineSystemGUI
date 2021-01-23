import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class German implements ActionListener{
     JFrame frame;
     JLabel gLabel;
     JButton go;
     JButton back;
     German(){
    	 frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(null);
    	 frame.setTitle("German");
    	 frame.getContentPane().setBackground(Color.DARK_GRAY);
    	 frame.setSize(300,200);
    	 
    	 gLabel = new JLabel("WILLKOMMEN");
    	 gLabel.setBounds(100,20,100,25);
    	 gLabel.setFont(new Font(null,Font.BOLD,12));
    	 gLabel.setForeground(Color.red);
    	 frame.add(gLabel);
    	 
    	 go = new JButton("Weiter");
    	 go.setBounds(70,50,70,25);
    	 go.setForeground(Color.blue);
    	 go.addActionListener(this);
    	 frame.add(go);
    	 
    	 back = new JButton("Zurück");
    	 back.setBounds(150,50,70,25);
    	 back.setForeground(Color.blue);
    	 back.addActionListener(this);
    	 frame.add(back);
    	 
    	 frame.setVisible(true);
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== back) {
			frame.dispose();
			new Languages();
		}
		if(e.getSource()==go) {
			frame.dispose();
			new FahrkarteWahl();
		}
	}
}
