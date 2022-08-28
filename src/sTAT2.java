public class sTAT2 {
	static int Count=0;//it will hold the value hence ans will be 1 2 3 bcoz of using static 
	public sTAT2()// if static will be removed then the result will be 1 1 1 as no value will be stored 
	//hence variable loose its value afret each call
	{
		Count+=1;
		System.out.println(Count);
		
		
	}
	public static void main(String[] args) {
		new sTAT2();
		new sTAT2();
		new sTAT2();
		
	}

}