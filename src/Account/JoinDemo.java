package Account;
import java.lang.*;

  
public class JoinDemo implements Runnable {
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Current Thread :"+t.getName());
		//checks if current class thread is alive
		System.out.println("Is Alive ?"+t.isAlive()
		);
		
	}
public static void main(String args[]) throws Exception {
	Thread t=new Thread(new JoinDemo());
	t.start();
	//waits for 100 ms this thread to die
	t.join(1000);
	System.out.println("\n joining after 1000"+"milli sec :\n");
	System.out.println("current thread :"+t.getName());
	//checks if the thread is alive
	System.out.println("Is Alive ?"+t.isAlive());

	
}
}
