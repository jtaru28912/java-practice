import java.awt.*;
import javax.swing.*;
public class Ball extends JFrame{
	public Ball() {
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new gp();//gp=graphics panel;;
		getContentPane().add(p1);
		
		
	}
	public static void main(String args[]) {
		new Ball();
	}

}class gp extends JPanel implements Runnable{
	int x_pos=10;
	int y_pos=100;
	int z_pos=20;
	public gp() {
		setBackground(Color.blue);
		Thread th=new Thread(this);
		th.start();
	}
	public void run() {
		while(true) {
			x_pos++;
			repaint();
			try {
				Thread.sleep(10);
			}catch(InterruptedException ex) {
				
			}
		}
	}
	@Override
	protected void paintComponent(Graphics g) {//paintComponent is a function
		super.paintComponent(g);//used for clear the screen
		g.setColor(Color.red);
		int radius;
		g.fillOval(x_pos-radius, y_pos-radius,2*radius, 2*radius);
	}
}
