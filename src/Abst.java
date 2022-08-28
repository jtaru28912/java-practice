
abstract class abc {// abstract parent class
	int i;

	abstract String getData();// abstract finction

	public void print() {//another method of class abc
		System.out.println(getData());
	}
}

class Child1 extends abc {
	String getData() {// now defining the function in child class by our convinence
		return "child1";
	}//output:Child1
}

class Child2 extends abc {
	String getData() {// again defining the func 
		return "child2";
	}//output:CHild2
}

public class Abst {
	public static void main(String args[]) {
		Child1 obj1 = new Child1();
		obj1.print();// obj1 can excess print fun as child id abc so abc is a child1
		Child2 obj2 = new Child2();
		obj2.print();
		
		abc obj=new Child1();
		System.out.println(obj.getData());
		obj.print();
		
		abc obj11=new Child2();
		System.out.println(obj11.getData());
		obj.print();
	}
}// if the program ends here result is child1,child2

abstract class Child3 extends abc// multiple abstract class for using another function
{
	abstract void x();

}

class Child4 extends Child3// now have to call functions of both class abc amd child3
{
	void x() {
	}
	

	String getData() {
		return "child4";
	}
}
abstract class Child5 extends Child2
{
	abstract void x();
	
}