package employeeClass;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Marco", "Andrade", 2580);
		Employee employee2 = new Employee("John", "Whick", -1350);
		
		//output for yearly salary before increase
		System.out.printf("The yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + " is $" + (employee1.getMonthlySalary() * 12) + "\n");
		System.out.printf("The yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + " is $" + (employee2.getMonthlySalary() * 12) + "\n\n");
		
		double salaryIncriment = employee1.getMonthlySalary() + (employee1.getMonthlySalary() * 0.1); //increase salary by 10%
		double salaryIncriment2 = employee2.getMonthlySalary() + (employee2.getMonthlySalary() * 0.1);//increase salary by 10%
		employee1.setMonthlySalary(salaryIncriment);
		employee2.setMonthlySalary(salaryIncriment2);
		
		//output for yearly salary after increase
		System.out.printf("The yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + " is $" + (employee1.getMonthlySalary() * 12 + 0.1) + "\n");
		System.out.printf("The yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + " is $" + (employee2.getMonthlySalary() * 12 + 0.1) + "\n\n");
	}

}

