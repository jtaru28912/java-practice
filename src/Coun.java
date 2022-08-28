//counting the no of 's' in the given word
public class Coun {
	public static void main(String args[])
	{
		int count=0;
		String s="Sameersirclasses";
		char data[]=s.toCharArray();
		for(char c:data)
		{
			if(c=='s')
			{
				count++;
			}
		}
		System.out.println("count s:"+count);
	}

}
