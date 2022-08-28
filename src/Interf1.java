
public interface Interf1 {
	void x();

}
interface Interf2{
	void y();
	
}
interface Interf3{
	void z();
}
class test5 implements Interf1,Interf2,Interf3//class inherits interface by implement keyword
{
	public void x() {}
	public void y() {}
	public void z() {}
}
interface MyInterface extends Interf1,Interf2,Interf3// multiple inheritance
{
	void x1();
}
class test6 implements Interf1{
	public void x() {
		
	}
	public void y() {
		
		
	}
	public void z() {
		
	}
	public void x1()
	{
		
	}
}//no main hence no output