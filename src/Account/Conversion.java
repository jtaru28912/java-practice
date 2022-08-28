package Account;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Conversion extends JFrame 
	implements ActionListener{
	JLabel L1;
	JTextField t1;
	JTextArea ta1;
	JButton b1;
	JPanel p1;
	public Conversion()
	{
		this.setVisible(true);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		L1=new JLabel("Distance in Miles: ");
		t1=new JTextField(20);
		ta1=new JTextArea(5,10);
		b1=new JButton("Convert");
		JScrollPane js=new JScrollPane(ta1);
		p1.add(L1);
		p1.add(t1);
		p1.add(b1);
		p1.add(js);
		getContentPane().add(p1);
		b1.addActionListener(this);
		ta1.setEditable(false);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		double km=Double.parseDouble(t1.getText())*1.67;
		ta1.append(t1.getText()+" miles equals "+km +"km \n");
	}
	public static void main(String args[])
	{
		new Conversion();
	}
	}