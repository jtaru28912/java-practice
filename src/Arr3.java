//multideminsion array
public class Arr3 {
	public static void main(String ars[])
	{
		String[][] chs=new String[2][];//roe=2 and no column
		chs[0]=new String[2];//0th row has 2 columns
		chs[1]=new String[5];//1st row has 5 columns
		int i=97;
		for (int a=0;a<chs.length;a++)//a<2 vacant remaining three indexes for both the loop causing null value
		{
			for(int b=0;b<chs.length;b++)//b<2  ie a=b
			{
				chs[a][b]=""+i;
				i++;
				
			}
		}
		for(String[] ca:chs)
		{
			for (String c:ca)
			{
				System.out.println(c+" ");

			}
			System.out.println();

		}
	}

}
