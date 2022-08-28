
public class Excep5 {

	public static void main(String[] args) {
		int a=12;
		try {
			if(a>10)
				throw new Exception();
			else
				System.out.println("Valid Valur");
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
