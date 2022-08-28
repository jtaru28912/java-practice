
 class MTT extends Thread{
	public void run(){
		for(int i=1;i<=1500;i++) {
			System.out.println("\t from thread A: i="+i);
		}
		System.out.println("Exit from A");
}

}
class B11 extends Thread{
	public void run() {
		for (int i=1;i<=500;i++) {
			System.out.println("\t from thread b: i="+i);
			
		}
		System.out.println("Exit from B");
	}
}
class C11 extends Thread{
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("\t from thread C: i="+i);
			
		}
		System.out.println("exit from C");
	}
}
public class A11{
	public static void main(String args[]) {
		new MTT().start();
		new B11().start();
		 new C11().start();
	}
	
}
