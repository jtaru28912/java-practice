import java.io.IOException;
public class Excep7 {
	public static void main(String []args)
	{
		try
		{
			ProcessBuilder obj =new ProcessBuilder("calc");
			obj.start();
			
		}
		catch(IOException e){
			e.printStackTrace();// to print all the detail of the exception
			//tostring() is use to express exception detail in brief
			
		}
	}

}
