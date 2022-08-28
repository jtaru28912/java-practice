//final
class d2{
	public  void goHome()// IF FINAL IS WRITTEN BEFORE VOID IT WONT ALLOW OVERRIDING HECE CREATE ERROR IN THE PROGRAM
	{
	System.out.println("by bus");
}
	}
public class finalll extends d2
{
	public void goHome()
{						//	after writing finAL BEFORE ANY VARIABLE IT BECOME FINAL HENCE CANNOT BE OVERRIDDEN
		System.out.println("by bike");
	}
	 int i=10;
	void abc ( int j)//final
	{
		i=20;
		j=10;
		
	}
	void x()
	{
		abc(5);
	}
}
