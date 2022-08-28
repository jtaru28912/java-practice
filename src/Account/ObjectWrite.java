package Account;
import java.io.*;
import java.util.*;
public class ObjectWrite {

	ObjectWrite(){
		String teststr=new String ("This is a test String");
		try {
			FileOutputStream file= new FileOutputStream("e:\\String.Dat");
			ObjectOutputStream objout =new ObjectOutputStream(file);
			objout.writeObject(teststr);
			objout.writeObject(new Date());
			file.close();
		
		}catch(IOException e) {
			System.out.println("object not written");
		}
	}
		public static void main(String args[]) {
			new ObjectWrite();
		}
	}
	
	
	
	
	

