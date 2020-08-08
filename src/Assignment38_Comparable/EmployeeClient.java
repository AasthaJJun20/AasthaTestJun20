package Assignment38_Comparable;

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

		Collections.sort(employee);
		System.out.println("\nSorting Employees by Employee ID - using Comparable interface:");
		for (Employee currentEmployee : employee) {
			System.out.println(currentEmployee);
		}
	}
}
