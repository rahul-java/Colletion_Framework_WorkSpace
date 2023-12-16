package Collections_Sorting.Comparator;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
	}

}
