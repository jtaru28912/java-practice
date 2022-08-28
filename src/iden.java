//keywords =identiirs
public class iden {
	public static void main (String args[])
	{
	String	keywords[]= {"break","case","conitnue","default","defer","else","for" ,"func","goto"};
				String word="define";boolean chk=false;
				for(int i=0;i<keywords.length;i++)
				{
					if (keywords[i].contentEquals(word) )
					{
						chk=true;
						System.out.println("defer is a  keyword");//true
						
					}	
	}
				if(chk==false)
				{
					System.out.println("not found");//true

				}

}
}
