import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class UserLog extends JFrame implements ActionListener,Runnable {
	JLabel L1, L2;
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	JPanel p1;
	Thread th1;
	public void run() {
		for(;;) {
			this.setTitle(new java.util.Date().toString());
			try {
				th1.sleep(1000);
			}catch(Exception ex) {
				
			}
		}
	}
	public UserLog() {
		th1= new Thread(this);
		th1.start();
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
		getContentPane().add(p1);p1.add(b1);p1.add(b2);
		p1.setBorder(BorderFactory.createTitledBorder("Security check......."));//border
		//this.setResizable(false);//now no maximize option will available
		this.setBounds(100, 100, 350, 150);//coordinates 100,100 will be considerd as 0,0 then the length and width will be taken
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public  void actionPerformed(ActionEvent e)  {
		if (e.getSource()==b1)
		{
		try	{
			RandomAccessFile obj= new RandomAccessFile("d:userlog.txt","rw");//cannot be saved in c drive
			String msg="User :"+t1.getText()+"logged in :"+new java.util.Date();
			obj.seek(obj.length());
			obj.writeBytes(msg);
			obj.close();
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
			System.out.println("login");
			
		}
		else 
			System.exit(0);
	}
	public static void main(String args[])
	{
		new UserLog();
	}
}

