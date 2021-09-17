package employeeClass;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	//constructor
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
		
		//if the monthly salary is not positive, do not set its value
		if (monthlySalary < 0.0) { 
			this.monthlySalary = 0.0;
		} 
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return this.monthlySalary;
	}
}
