package Collections_Sorting.Comparator;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.id-e2.id;
	}

}
