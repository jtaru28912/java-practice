//continue and break with a new case
public class contbreak {
	public static void main(String[] args)
	{
		String[] arr= {"a","b","c","d"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			if(arr[i].contentEquals("c")) {
			continue;
		}
		System.out.println("Work done");
	    break;
	    
		
	}

}
}
