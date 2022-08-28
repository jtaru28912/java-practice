//array functions
public class Arra2 {
	public static void main(String args[])
	{
		String arr[][]= {{"Mr","Mrs","Dr"},{"xyz","abc"}};
		System.out.println(arr.length);//2
		System.out.println(arr[0].length);//3
		System.out.print(arr[0][0]+" "+ arr[1][1]+" ");//mr abc
		System.out.println(arr[0][2]+arr[1][0]);//dr xyz
		for(String a[]:arr)
		{
			for(String b:a)
			System.out.print(b+" ");
		}
		System.out.println();
	}

}
