import javax.swing.*;
import java.awt.*;

public class Win4 extends JFrame {
	public Win4() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel p1 = new JPanel();
		JCheckBox c1 = new JCheckBox("Bold");
		JCheckBox c2 = new JCheckBox("Italics");
		p1.add(c1);
		p1.add(c2);
		JRadioButton r1 = new JRadioButton("Phone");
		JRadioButton r2 = new JRadioButton("Email");
		p1.add(r1);
		p1.add(r2);
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		JTextArea ta1 = new JTextArea(5, 20);
		JScrollPane js1 = new JScrollPane(ta1);
		p1.add(js1);

		JComboBox jc1 = new JComboBox();
		jc1.addItem("red");
		jc1.addItem("green");
		jc1.addItem("blue");
		jc1.addItem("black");
		p1.add(jc1);
		String a[] = { "red", "abc", "xyz", "blue", "green" };
		JComboBox jc2 = new JComboBox(a);
		p1.add(jc2);
		JList ls = new JList(a);
		JScrollPane js2 = new JScrollPane(ls);
		p1.add(js2);
		ls.setVisibleRowCount(3);

		ImageIcon ico = new ImageIcon("f:\\cisco.png");
		JLabel l1 = new JLabel();
		l1.setIcon(ico);
		p1.add(l1);
		getContentPane().add(p1);
		Font f = new Font("Serif", Font.BOLD, 20);
		ta1.setFont(f);
		jc1.setFont(f);
		ta1.setBackground(Color.red);
		ta1.setForeground(Color.yellow);
		Color c = new Color(150, 100, 100);// red,blue ,green max size no can be 255
		p1.setBackground(c);
	}
	public static void main(String args[])
	{
		new Win4();
		
	}
}
