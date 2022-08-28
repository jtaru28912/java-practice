import java.util.*;
public class Arraylis {
	Scanner sc;
	String name;ArrayList<String> x;
	public Arraylis(){
		sc=new Scanner (System.in);
		x=new ArrayList<String>();
		
	}
	public void input()
	{
		for(;;)
		{
			System.out.println("Enter Name :");
			name = sc.nextLine();
			if(name.length()>0)
			{
				x.add(name);
			}
			else
			{
				break;
			}
		}
		
	}
	public void output() {
		System.out.println("all names:"+x);
		System.out.println("size:"+x.size());
		System.out.println("contains ss:"+x.contains("ss"));
		System.out.println("remove ss :"+x.remove("ss"));
		System.out.println("all names:"+x);
		System.out.println("size:"+x.size());
		



	}

}
