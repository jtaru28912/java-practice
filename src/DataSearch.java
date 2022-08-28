import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class DataSearch extends JFrame {
	JLabel l1, l2, l3, l4, l5;
	JComboBox jc1;
	JButton b1;
	JPanel p1;

	public DataSearch() {
		this.setVisible(true);
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		l1 = new JLabel("Select Email");
		jc1 = new JComboBox();
		b1 = new JButton("SEarch");
		l2 = new JLabel("Name :");
		l3 = new JLabel("city :");
		l4 = new JLabel();
		l5 = new JLabel();
		p1.add(l1);
		p1.add(jc1);
		p1.add(b1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		getContentPane().add(p1);
		l4.setForeground(Color.red);
		l5.setForeground(Color.red);
		Font f = new Font("Sherif", Font.BOLD, 20);
		l4.setFont(f);
		l5.setFont(f);
		b1.addActionListener(e-> searchClick(e));
		getAllEmail();
	}

	public void getAllEmail() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Taru@123");
			String sql = "Select email from userdata";
			Statement stmt = conn.createStatement();
			ResultSet re = stmt.executeQuery(sql);
			while (re.next()) {
				jc1.addItem(re.getString(1));

			}

		} catch (Exception ex) {
		}

	}

	public void searchClick(ActionEvent e) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Taru@123");
			String sql = "Select name, city from userdata where email ='" + jc1.getSelectedIndex() + "'";
			//query to show email and name 
			JOptionPane.showMessageDialog(null, sql);
			Statement stmt = conn.createStatement();
			ResultSet re = stmt.executeQuery(sql);
			re.next();
			l4.setText(re.getString(1));
			l5.setText(re.getString(2));

		} catch (Exception ex) {

		}

	}

	public static void main(String args[]) {
		new DataSearch();
	}
}
