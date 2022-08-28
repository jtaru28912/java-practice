//instanceofff
class Animals{}
class Dogs extends Animals{}
class Cats extends Animals{}
public class Instance {
	public static void main (String args[])
	{
		Dogs d=new Dogs();
		Animals a=new Dogs();
		System.out.println(d instanceof Dogs);//true
		System.out.println(a instanceof Dogs);//true
		System.out.println(a instanceof Cats);//false
		System.out.println(a instanceof Animals);//true
		Animals b=new Cats();
		System.out.println(b instanceof Dogs);//false
		System.out.println(b instanceof Dogs);//false
		System.out.println(b instanceof Animals);//false
		//Dog e=new Animal(); //downcasting
		//Dog e=(Dog)new Animal();//downcasting//program will compile but produce exceptions

	}

}
