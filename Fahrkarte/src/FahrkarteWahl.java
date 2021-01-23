import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FahrkarteWahl implements ActionListener{
    JFrame frame;
    JLabel label;
    JButton button;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel price;
    JLabel tKarte;
    JLabel wKarte;
    JLabel eKarte;
    FahrkarteWahl(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
        frame.setTitle("FahrkarteWahl");
        frame.setBackground(Color.red);
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(300,200);
        
        label = new JLabel("Wählen Sie die Fahrkarte");
        label.setBounds(60,20,170,25);
        label.setForeground(Color.white);
        frame.add(label);
        
        button = new JButton("Tageskarte");
        button.setBounds(10,50,100,25);
        button.setForeground(Color.cyan);
        button.addActionListener(this);
        frame.add(button);
        
        button1 = new JButton("Wochekarte");
        button1.setBounds(100,50,100,25);
        button1.setForeground(Color.cyan);
        button1.addActionListener(this);
        frame.add(button1);
        
        button2 = new JButton("Einzelkarte");
        button2.setBounds(190,50,100,25);
        button2.setForeground(Color.cyan);
        button2.addActionListener(this);
        frame.add(button2);
        
        button3 = new JButton("Zurück");
        button3.setBounds(30,80,70,25);
        button3.setForeground(Color.cyan);
        button3.addActionListener(this);
        frame.add(button3);
        
        button4 = new JButton("Zurück zum stratseite");
        button4.setBounds(100,80,180,25);
        button4.setForeground(Color.cyan);
        button4.addActionListener(this);
        frame.add(button4);
        
        price = new JLabel("PRICE");
        price.setBounds(30,105,80,25);
        price.setFont(new Font(null,Font.BOLD,12));
        price.setForeground(Color.cyan);
        frame.add(price);
        
        tKarte = new JLabel("Tageskarte : 5 €");
        tKarte.setBounds(40,120,150,25);
        tKarte.setFont(new Font(null,Font.BOLD,11));
        tKarte.setForeground(Color.cyan);
        frame.add(tKarte);
        
        wKarte = new JLabel("WocheKarte : 8 €");
        wKarte.setBounds(40,135,150,25);
        wKarte.setFont(new Font(null,Font.BOLD,11));
        wKarte.setForeground(Color.cyan);
        frame.add(wKarte);
        
        eKarte = new JLabel("Einzel karte : 3 €");
        eKarte.setBounds(40,150,150,25);
        eKarte.setFont(new Font(null,Font.BOLD,11));
        eKarte.setForeground(Color.cyan);
        frame.add(eKarte);
        
        frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button3) {
			frame.dispose();
			new German();
		}
		if(e.getSource()==button4) {
			frame.dispose();
			new Languages();
		}
		if(e.getSource()==button) {
			frame.dispose();
			new Tage();
		}
		if(e.getSource()==button1) {
			frame.dispose();
			new Woche();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			new Einzel();
		}
	}
}
