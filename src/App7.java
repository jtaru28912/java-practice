//string functions
public class App7 {
	public static void main(String args[])
	{
		int i=5;
		int j=i;//pass by value ,require seperste spsce for j
		System.out.println("i==j");//value compare true
		j=10;//value change
		System.out.println(i==j);//value compare false
		
		String s ="hello";//obj/ref/instance
		String t=s;//pass by referance n same memory
		System.out.println(s==t);
		System.out.println(s.equals(s));//to compare two obj
		t="new-t";
		System.out.println(s.equals(t));//ambiguity errors are only for functions
		System.out.println("length "+s.length());
		System.out.println("uppercase "+s.toUpperCase());
		System.out.println("lowercase "+s.toLowerCase());
		System.out.println("contains e "+s.contains("e"));
		System.out.println("index of e "+s.indexOf("e"));
		String z ="   Hello";
		System.out.println("length z ="+z.length());
		System.out.println("trim z spece from left and right "+z.trim());
		
		
		
		
		
		
	}

}
