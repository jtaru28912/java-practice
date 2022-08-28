import java.util.*;

class StudentData{
	String name;
	String email;
	
}
public class Scanner2 {
	Scanner sc;
	String name;
	
	ArrayList<StudentData> x;
	public Scanner2()
	{
		sc= new Scanner(System.in);
		x=new ArrayList<StudentData>();
		
	}
	public void input()
	{
		for(;;)
		{
			StudentData obj = new StudentData();
			System.out.println("Enter Name : ");
			obj.name=sc.nextLine();
			if(obj.name.length()>0)
			{
				x.add(obj);
				
			}
			else {
				break;
			}
		}
	}
	public void output()
	{
		System.out.println("Enter  all Name : "+x);
		System.out.println("Size : "+x.size());
		Object obj[]=x.toArray();
		for(Object o:obj)
		{
			StudentData dd=(StudentData)o;
			System.out.println("Name : "+dd.name+" Email : "+dd.email);

			
		}
		x.clear();

	}
	public static void main (String args[]) {
		Scanner2 obj=new Scanner2();
		obj.input();
		obj.output();
	}
	

}
