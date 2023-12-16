package Collections_Sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo3 {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "David", 65000.00));
		empList.add(new Employee(105, "Ishan", 5000.00));
		empList.add(new Employee(104, "Aman", 45000.00));
		empList.add(new Employee(103, "John", 35000.00));
		empList.add(new Employee(102, "Rohan", 15000.00));

		System.out.println("=================Before Sorting=================");
		for (Employee e : empList)
			System.out.println(e);

		Collections.sort(empList, new EmpIdComparator());

		System.out.println("=================After Sorting using id=================");
		for (Employee e : empList)
			System.out.println(e);

		Collections.sort(empList, new EmpNameComparator());

		System.out.println("=================After Sorting using name=================");
		for (Employee e : empList)
			System.out.println(e);
	}
}
