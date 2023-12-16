package Collections_Sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousComparatorDemo {

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

		Collections.sort(empList, new Comparator<Employee>() {

			
			@Override
			public int compare(Employee e1, Employee e2) {
				
				return e1.id-e2.id;
			    //return e1.name.compareTo(e2.name);
				//return (int)(e1.salary-e2.salary);
			}
			
			
			/*
			@Override
			public int compare(Employee e1, Employee e2) {
				
				if(e1.id>e2.id) {
					return 1;    //+ve :: do changes
				}
				else if(e1.id<e2.id) {
					return -1;  //-ve :: move on
				}
				else {
					return 0; //do nothing
				}
			}
			*/
		
		});

		System.out.println("=================After Sorting using id=================");
		for (Employee e : empList)
			System.out.println(e);
	}
}
