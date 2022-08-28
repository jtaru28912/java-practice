
 class Student {
	private String Name;
	private String Email;

	public String getName() {
		return Name;

	}

	public String getEmail() {
		return Email;
	}

	public void setName(String n) {
		if (n.length() < 3) {
			this.Name = "INVALID NAME";
		} else {
			this.Name = n;
		}
	}

	public void setEmail(String e) {
		if (e.indexOf("@") == -1) {
			this.Email = "INVALID EMAIL";
		} else {
			this.Email = e;
		}

	}
}
public class Detail{
	public static void main(String args[])
	{
		Student s=new  Student();
		s.setName("TARU JAIN  ");
		s.setEmail("JTARU@GMAIL.COM");
		System.out.println("Name :"+s.getName()+" Email :"+s.getEmail());
	}
}