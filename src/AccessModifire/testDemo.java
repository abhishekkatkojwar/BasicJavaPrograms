package AccessModifire;

public class testDemo extends Employee{

	public testDemo(String empName) {
		super(empName);
	}
	public static void main(String args[]) {
	      Employee empOne = new Employee("Abhishek");
	      empOne.setSalary(1000);
	      empOne.printEmp();
	   }
		
}
