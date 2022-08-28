
public class Exceptio {
	public static void main (String args[])
	{
		int i=0;
		String greetings[]= {"hello","hii","bye"};
		try {
		while(i<=greetings.length)//terminated after i=2 for further printing use try and catch
		{
			System.out.println(greetings[i]);
			i++;
		}
		}
		catch(Exception e)
		{
			//System.out.println(e.toString());//to print brief of the exception in single line
			e.printStackTrace();//prints about the full detail of the occurance to the class where the exception belongs
		}
		System.out.println("All records displayed");//try catch can make our exception print and make further execution 
	}

}
