
package Account;
import java.io.*;
import java.util.*;
public class ObjectRead {
	ObjectRead(){
		String testStr =null;
		Date d=null;
		try {
			FileInputStream file=new FileInputStream("e:\\String.dat");
			ObjectInputStream objInput=new ObjectInputStream(file);
			testStr=(String)objInput.readObject();
			d=(Date)objInput.readObject();
			
					
		}catch(Exception e) {
			System.out.print("CAnnot read object");
			
		}
		System.out.println("Object read from String.dat:"+testStr);
		System.out.println("Date:"+d);
		

	}public static void main(String args[]) {
		new ObjectRead();
		
	}

}
