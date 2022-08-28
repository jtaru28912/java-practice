
public class Excep4 {
public static void main(String []args)
{
	try {
		int a= args.length;
		System.out.println("a = "+a);
		int b= 10/a;
		int c[]= {5};
		c[10]=100;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divide by Zero");
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index out off bound ");
		
	}
}
}
