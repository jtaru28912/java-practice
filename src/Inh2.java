class c1
{
	public c1()
	{
		System.out.println("c1");
	}
}
class b1 extends c1
{
	public b1()
	{
		System.out.println("b1");
	}
}

public class Inh2 extends b1 {
	public Inh2()
	{
		System.out.println("Inh2");
	}
	public static void main(String args[])
	{
		new Inh2();
	}

}
