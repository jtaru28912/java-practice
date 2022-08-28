//nested class
public class Outer {
	int i;
	void x() {
		
		
	}//Accessable by the innr classes
	static class Inner1{
		static int j;
		static void y() {
			
		}
		
	}
	class Inner2{
		int k;
		void z(){
			Outer obj=new Outer();
			obj.i=10;
			obj.x();
			this.k=10;
			//this will accesss obj of inner2 class
}
		
	}
	void Test() {//outer class
		Inner1.j=10;//access static innr class
		Inner1.y();
		Inner2 obj=new Inner2();
		obj.k=10;
		obj.z();
	}
}
//on compilation two byte code will be created 1. outer.claa and 2. outer$inner1.class 3. outer$inner2