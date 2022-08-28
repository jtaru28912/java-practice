//inheritance
class c {
	int i;

	void y() {
	}
}

class b extends c {
	int j;

	void x() {
	}

}

public class inh1 extends b {
	int k;

	void z() {
	}

	void test() {
		this.k = 10;
		this.z();// current class
		super.j = 5;
		super.x();// class b
		super.i = 10;
		super.y();// c class
		this.i = 5;
		this.y();// c class,k.super is not possible it will give error because there is no k in
					// super class
	}

	public static void main(String args[]) {
		inh1 obj = new inh1();
		obj.test();

	}

}
