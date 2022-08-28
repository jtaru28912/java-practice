package Account;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener{

	JLabel l1;
	JTextField t1;
	JTextArea ta1;
	JButton b1,calButton[];
	JPanel p1,keypad ,inputPanel,controlPanel;
	chk=false;
	public Converter()
	{
		this.setVisible(true);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		keypad = new JPanel();
		l1 = new JLabel("Distance in miles");
		t1 = new JTextField(20);
		ta1 = new JTextArea(5,20);
		b1=new JButton("converter");
		JScrollPane js = new JScrollPane(ta1);
		p1.setLayout(new BorderLayout());
		inputPanel.add(l1);
		inputPanel.add(t1);
		p1.add(inputPanel,"North");
		p1.add(js,"Center");
		calButton = new JButton[12];//array object
		String Label[]= {"1","2","3","4","5","6","7","8","9","C","0","."};
		for(int i=0;i <= calButton.length ;i++)
		{
			calButton[i].addActionListener(this);//button only has listener hence further any source will add on
			//buttons eg. soutce etc.....
				
		}
				keypad.setLayout(new GridLayout(4,3,10,5));
				controlPanel.setLayout(new BorderLayout());
				controlPanel.add(keypad,"North");
				controlPanel.add(b1,"south");
				p1.add(controlPanel,"East");
				getContentPane().add(p1);
				b1.addActionListener(this);
				ta1.setEditable(false);
				p1.setBorder(BorderFactory.createTitledBorder("Converter"));
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton x= (JButton) e.getSource();
	if (x.getText().equals("Converter")) {
		double km = Double.parseDouble(t1.getText())*1.67;
		ta1.append(t1.getText()+" miles equals "+km+" km\n");
	}
	else if (x.getText().contentEquals("C")) {
		
	}
	}
	
	
	
	
}
