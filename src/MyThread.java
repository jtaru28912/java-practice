
public class MyThread {
public static void main(String args[]) {//main thread
	Thread obj=Thread.currentThread();
	System.out.println("current thread name:"+obj.getName());
	String msg ="Welcome to my projrct";
	char[] data =msg.toCharArray();
	for(char c:data) {
		System.out.println(c);
		try {
			obj.sleep(2000);//this is a throws func so we have to use try catch statement
			
		}catch(Exception e) {
			
		}
	}
		}

// only thread class is the class which will not allocate memory by using "new "ie Thread=new thread();
}
