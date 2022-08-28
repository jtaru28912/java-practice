package Account;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz  extends JFrame{
	JPanel p1,inputPanel,centerPanel,ButtonPanel;
	JLabel l1;
	JRadioButton r0,r1,r2,r3;
	ButtonGroup grp;
	JButton b1,b2;
	String q[]= {"Q1. Grand central terminal,park avenue,is located in",
	"Q2. Entomonology is the science that studies ",
	"Q3. Eritrea whic become 182nd memeber of the world is in which continent", "Q4. Garampani sentuary is located at  ",
	"Q5. for which of the following discipline nobel prize is awarded",
	};String choice[][]= {
			{"A. largest railway station","B. highest railway",},{"A.behaviour of human being","B.insects",},{
				"A. asia","B. africa",},{"A.junagarh","B. diphu","c. nagaland","d.kolkata"},{"A. physics and chemistry","b.biology","c. all of thr avove",},
			};
	String ans[]= {"A","B","B","B","c",};
	int cnt=0;
	int marks=0;
	String uAns="";
	public Quiz()
	{
		this.setVisible(true);
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		inputPanel=new JPanel();
		centerPanel=new JPanel();
		ButtonPanel=new JPanel();
		l1 =new JLabel();
		r0=new JRadioButton();
		r1=new JRadioButton();
		r2=new JRadioButton();
		r3=new JRadioButton();
		grp =new ButtonGroup();
		b1=new JButton("Next");
		b2=new JButton("Cancel");
		p1.setLayout(new BorderLayout());
		inputPanel.add(l1);
		p1.add(inputPanel,"north");
		grp.add(r0);
		grp.add(r1);
		grp.add(r2);
		grp.add(r3);
		centerPanel.add(r0);
		centerPanel.add(r1);
		centerPanel.add(r2);
		centerPanel.add(r3);
		centerPanel.setLayout(new GridLayout(4,1));
		p1.add(ButtonPanel,"Center");
		ButtonPanel.add(b1);
		ButtonPanel.add(b2);

		p1.setBorder(BorderFactory.createTitledBorder("QUIZ"));
		getContentPane().add(p1);
		inputPanel.setBorder(BorderFactory.createTitledBorder("Question"));
		centerPanel.setBorder(BorderFactory.createTitledBorder("Question"));
		ButtonPanel.setBorder(BorderFactory.createTitledBorder("controls"));
		b1.addActionListener(e->actionB1(e));
		b2.addActionListener(e->actionB2(e));
		String Name = JOptionPane.showInputDialog(null,"Enter Name");
		setTitle("Candidate name : "+Name);
		showQ();
	}
	
	public void showQ() {
		l1.setText(q[cnt]);
		r0.setText(choice[cnt][0]);
		r1.setText(choice[cnt][1]);
		r2.setText(choice[cnt][2]);
		r3.setText(choice[cnt][3]);
		grp.clearSelection();
	}
public void result() {
	if(r0.isSelected())
	{
		uAns="A";
	}
	if(r1.isSelected())
	{
		uAns="B";
	}if(r2.isSelected())
	{
		uAns="c";
	}if(r3.isSelected())
	{
		uAns="d";
	}
	if(uAns.contentEquals(ans[cnt])) {
		marks++;
		JOptionPane.showMessageDialog(null,"correct");
	}else {
		JOptionPane.showMessageDialog(null,"Incorrect");
	}
	
}
	public void actionB2(ActionEvent e)
	{
		System.exit(0);
	}
	public void actionB1(ActionEvent e)
	{
		result();cnt++;showQ();
	}
	public static void main (String args[])
	{
		new Quiz();
	}
}
