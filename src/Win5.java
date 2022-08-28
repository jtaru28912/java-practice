
import javax.swing.*;
import java.awt.event.*;
public class Win5 extends JFrame implements ActionListener {
	JLabel L1, L2;
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	JPanel p1;

	public Win5() {
		this.setVisible(true);
		this.setSize(350, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for closing the output exit on close will close the progrm
		this.setTitle("LOGIN WINDOWS");
		p1 = new JPanel();
		L1 = new JLabel("USER NAME");
		L2 = new JLabel("PASSWORD");
		t1 = new JTextField(20);
		t2 = new JPasswordField(20);
		b1 = new JButton("LOGIN");
		b2 = new JButton("CANCEl");
		p1.add(L1);
		p1.add(t1);
		p1.add(L2);
		p1.add(t2);
		getContentPane().add(p1);
		p1.setBorder(BorderFactory.createTitledBorder("Security check......."));//border
		this.setResizable(false);//now no maximize option will available
		this.setBounds(100, 100, 350, 150);//coordinates 100,100 will be considerd as 0,0 then the length and width will be taken
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public  void actionPerformed(ActionEvent e)  {
		if (e.getSource()==b1)
		{
			System.out.println("login");
			
		}
		else 
			System.exit(0);
	}
	public static void main(String args[])
	{
		new Win5();
	}
}

