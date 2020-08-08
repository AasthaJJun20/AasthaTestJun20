package Assignment38_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeClient {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1123, "Aastha", 100000);
		Employee e2 = new Employee(2587, "Sakshi", 150000);
		Employee e3 = new Employee(1527, "Prachi", 200000);
		Employee e4 = new Employee(1012, "Sapana", 250000);

		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);

		Collections.sort(employee, new CompareEmployeeId());
		System.out.println("\nSorting Employees by Employee ID - using Comparator interface: ");
		for (Employee currentEmployee : employee) {
			System.out.println(currentEmployee.id + " : " + currentEmployee.name + " : " + currentEmployee.salary);
		}
		Collections.sort(employee, new CompareEmployeeName());
		System.out.println("\nSorting Employees by Employee Name - using Comparator interface:");
		for (Employee currentEmployee : employee) {
			System.out.println(currentEmployee.name + " : " + currentEmployee.id + " : " + currentEmployee.salary);
		}
		Collections.sort(employee, new CompareEmployeeSalary());
		System.out.println("\nSorting Employees by Employee ID - using Comparator interface:");
		for (Employee currentEmployee : employee) {
			System.out.println(currentEmployee.salary + " : " + currentEmployee.name + " : " + currentEmployee.id);
		}
	}
}
