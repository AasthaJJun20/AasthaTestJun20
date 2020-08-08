package Assignment38_Comparable;

public class Employee implements Comparable<Employee> 
{
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		/*if (this.id == o.id)
			return 0;
		else if (this.id > o.id)
			return 1;
		else
			return -1;*/
		//alternative of above code
		return this.id - o.id;
	}
	
	@Override
	public String toString() {
		return id + " : " + name + " : " + salary;
	}
}
