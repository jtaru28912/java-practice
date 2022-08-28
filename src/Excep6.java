public class Excep6 {

	public static void main(String[] args) {
		int a=12;
		try {
			if(a>10)
				throw new ValueException();
			else
				System.out.println("Valid Valur");
			
		}
		catch (ValueException e)
		{
			System.out.println("erreo :"+e.toString());
		}

	}

}

class ValueException extends Exception {
	public String toString() {
		return "Value Can't Be Greater then 10";
	}
}
