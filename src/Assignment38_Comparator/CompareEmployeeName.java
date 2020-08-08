package Assignment38_Comparator;

import java.util.Comparator;

public class CompareEmployeeName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.compareTo(o2.name) == 0)
			return 0;
		else if(o1.name.compareTo(o2.name) > 0)
			return 1;
		else
			return -1;
	}
}
