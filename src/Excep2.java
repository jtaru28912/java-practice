
public class Excep2 {
public static void main(String args[])
{
	int x;
	try {
		
		x=0;
		int y=10/x;
		System.out.println("Now What");
	}
	catch (ArithmeticException e)
	{
		System.out.println("Division by zero");
	}
	System.out.println("Hii I m back1!!");
}
}
