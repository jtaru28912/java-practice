
public class Excep3 {
	public static void main(String args[]) {
		try {
			fun1();
		} catch (Exception e) {
			System.out.println("in Main");
		}
		fun2();
	}

	public static void fun1() throws Exception {
		try {
			System.out.println("Try of fun1()");
			throw new Exception();//sent to catch
		} catch (Exception e) {
			System.out.println("Catchof fun2()");
		} finally {
			System.out.println("finally of fun1()");
		}
	}

	public static void fun2() {
		System.out.println("Hello");
	}

}
