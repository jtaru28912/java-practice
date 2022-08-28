
	class c2
	{
		public c2()
		{
			System.out.println("c2");
		}
	}
	class b2 extends c2
	{
		public b2()
		{
			
			System.out.println("b");
		}
		public b2(int i)
		{
			this();
			System.out.println(i);
	}
	}

	public class Inh3 extends b2 {
		public Inh3()
		{
			super(5);
			System.out.println("Inh3");
		}
	
		public static void main(String args[])
		{
			new Inh3();
		}

	}
	
