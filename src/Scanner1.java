import java.util.*;

public class Scanner1 {
	Scanner sc;
	String name;
	ArrayList<String> x;
	int age;
	double salary;

	public Scanner1() {
		sc = new Scanner(System.in);
	}

	public void input() {
		for (;;) {
			System.out.println("Enter Name : ");
			name = sc.nextLine();
			System.out.println("Enter Age : ");
			age = sc.nextInt();
			System.out.println("Enter Salary : ");
			salary = sc.nextDouble();
			if (name.length() > 0) {
				x.add(name);
			} else {
				break;
			}
		}
	}

	public void output() {
		System.out.println("All Name : " + x);
		System.out.println("Size of Name : " + x.size());
		System.out.println(" Name contains ss : " + x.remove("ss"));
		System.out.println("All Names : " + x);
		System.out.println("Size : " + x.size());
		System.out.println("index of 2 : " + x.get(2));
		Object obj[] = x.toArray();
		for (Object o : obj) {
			System.out.println((String) o);

		}
		x.clear();

	}

	public static void main(String args[]) {
		Scanner1 obj = new Scanner1();
		obj.input();
		obj.output();
	}
}