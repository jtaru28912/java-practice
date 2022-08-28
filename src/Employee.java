//constructor calling is an example
public class Employee {
	String employeeName;         //objects 
	String employeeAddres;
	
	public Employee() //constructor declaration
	{
		employeeName ="abc";//employeName is an object of Employee while employee is obj of string
		employeeAddres ="jbp";
		//calling of constructor means taking the value of the variable into memory space
		
	}
	public void getDetail()
	{
		System.out.println("Name of employee "+ employeeName);
		System.out.println("Address of employee "+ employeeAddres);
		
	}
	public static void main(String args[])
	{
		Employee obj = new Employee();//calling of constructor
		obj.getDetail();
	}
}
