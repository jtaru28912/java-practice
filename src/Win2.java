import java.awt.*;

public class Win2 extends Frame {

	public Win2() {
		this.setVisible(true);
		this.setSize(400, 500);
		Label L1 = new Label("NAME");
		Label L2 = new Label("EMAIL");
		Panel p1 = new Panel();
		p1.add(L1);
		p1.add(L2);
		TextField t1 = new TextField(10);
		p1.add(t1);
		Button b1 = new Button("Submit");
		p1.add(b1);
		TextArea ta1 = new TextArea(5, 20);
		p1.add(ta1);
		Checkbox ch1 = new Checkbox("Phone");
		Checkbox ch2 = new Checkbox("Email");
		p1.add(ch1);
		p1.add(ch2);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox r1 = new Checkbox("Phone", cbg, true);
		Checkbox r2 = new Checkbox("Email", cbg, false);
		p1.add(r1);
		p1.add(r2);
		Choice c1 = new Choice();
		c1.add("red");
		c1.add("blue");
		c1.add("Green");
		c1.add("voilet");
		p1.add(c1);
		List Ls = new List(3, false);
		Ls.add("red");
		Ls.add("blue");
		Ls.add("Green");
		Ls.add("voilet");
		Ls.add("Black");
		p1.add(Ls);
		this.add(p1);//panel is added to the current frame for running of program
	}

	public static void main(String args[]) {
		new Win2();
	}
}
