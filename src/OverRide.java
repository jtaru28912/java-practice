//overridden
public class OverRide extends b{
public void abc() {
	System.out.println("message from subclass");// result is msg from subclass bcoz over ride is inherited class or base class of b class
}
public static void main(String args[])
{
	OverRide obj=new OverRide();//obj of class override calling constructor for coming in memory
	obj.abc();
}
class b{
	public void abc() {
		System.out.println("message from duper class");
	}
}

}
