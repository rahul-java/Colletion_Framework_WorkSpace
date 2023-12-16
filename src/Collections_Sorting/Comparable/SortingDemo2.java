package Collections_Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo2 {

	public static void main(String[] args) {
		
		//Comparable allows us to sort only by one value.
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(101, "John", 3));
		studentList.add(new Student(105, "Anil", 5));
		studentList.add(new Student(102, "Ram", 4));
		studentList.add(new Student(104, "Anthony", 2));
		studentList.add(new Student(103, "Smith", 1));
		
		System.out.println("===============Before Sorting==================");
		for(Student student:studentList)
		{
			System.out.println(student);
		}
		
		Collections.sort(studentList);  //public class Student implements Comparable<Student>
		
		System.out.println("===============After Sorting==================");
		for(Student student:studentList)
		{
			System.out.println(student);
		}
	}
}
