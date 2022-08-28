package Account;
import java.net.*;
import java.io.*;
public class URLData {
	public static void main (String args[])
	{
		try {
			URL url=new URL("http://www.imgjbp.com");
			URLConnection urlcon=url.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while((i=stream.read())!=-1) {
				System.out.print((char)i);//i will be in byte code to convert into char we will do  typecasting 
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
