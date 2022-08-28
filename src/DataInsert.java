//advanced package having more function and classes then awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DataInsert extends JFrame implements ActionListener {
	JLabel L1, L2;
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	JPanel p1;

	public DataInsert() {
		this.setVisible(true);
		this.setSize(350, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for closing the output exit on close will close the progrm
		this.setTitle("DATA INSERT");
		p1 = new JPanel();
		L1 = new JLabel("USER EMAIL");
		L2 = new JLabel("USER NAME");
		t1 = new JTextField(20);
		t2 = new JPasswordField(20);
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CANCEl");
		p1.add(L1);
		p1.add(t1);
		p1.add(L2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		getContentPane().add(p1);
		p1.setBorder(BorderFactory.createTitledBorder("Security check......."));//border
		this.setResizable(false);//now no maximize option will available
		this.setBounds(100, 100, 350, 150);//coordinates 100,100 will be considerd as 0,0 then the length and width will be taken
		b1.addActionListener( this);
		b2.addActionListener( this);
	}
	
	public  void actionPerformed(ActionEvent e)  {
		if (e.getSource()==b1)
		{
			try {
			Class.forName("org.postgresql.Driver");
			Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Taru@123");//we have to give all the info of database like server name ip add port no etc.
			String sql="insert into userdata (email,name)values ('"+t1.getText()+"','"+t2.getText()+"')";
			JOptionPane.showMessageDialog(null,sql);
			Statement stmt =conn.createStatement();
			stmt.execute(sql);
			stmt.close();
			JOptionPane.showMessageDialog(null,"Record saved");
			}
			catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);}
		}
		else 
			System.exit(0);
	}

	public static void main(String args[]) {
		new DataInsert();
	}
}
