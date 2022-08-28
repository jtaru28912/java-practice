package Account;
import java.io.*;
public class KeyInput {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));//inputstream reader will take output in byte and convert it into charcter
		System.out.println("Enter Name::");
		String name=br.readLine();
		System.out.println("Your name is ::"+name);
	}


}
