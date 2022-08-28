package Account;

public class Balance {
	String name;
	double bal;
	public Balance(String n,double b)
	{
		this.name=n;
		this.bal=b;
	}
	public void show()
	{
		System.out.println("Name :"+this.name+"Balance :"+this.bal);
	}

}
//program with no output as we have not given any main function and called the condtrusture or printed the result