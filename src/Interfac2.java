interface Area
{
	float pi=3.14f;//by default public finalnand static
	float compute(float x,float y);// public and abstract
	
}
class rectangle  implements Area
{
	public float compute(float x,float y)
	{
		return x*y;
	}
}
class circ implements Area
{
	public float compute (float x,float y)
	{
		return  pi*x*x;
	}
}
public class Interfac2 {
	public static void main(String args[])
	{
		rectangle r = new rectangle();
		System.out.println("Area of rectangle : "+r.compute(10, 20));
		circ c= new circ();
		System.out.println("Area of circle is : "+c.compute(10, 0));
		
	}

}
