package Collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//store in the natural sorting order
		//binary tree
		//null is not allowed
		//it does not store hetrogenious data
		//only store Homogenious Values
		
		
		TreeSet treeSet = new TreeSet<>();
		
		treeSet.add(100);
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(20);//duplicates are not allowed
		//treeSet.add(null); //Compile time error java.lang.NullPointerException
		//treeSet.add("Rahul"); //Compile time error java.lang.NullPointerException
		
		
		System.out.println(treeSet);  //[10, 20, 30, 40, 50, 100]
		
		TreeSet treeSet2 = new TreeSet<>();
		
		treeSet2.add("Rahul");
		treeSet2.add("Amit");
		treeSet2.add("Lalit");
		treeSet2.add("Mujeeb");
		//treeSet2.add(111);  //Compiletime error class java.lang.String cannot be cast to class java.lang.Integer
		
		System.out.println(treeSet2);//[Amit, Lalit, Mujeeb, Rahul]
		
		//Only Homogenious Data Even by defining as Object type of tree
		
		TreeSet<Object> treeSet3 = new TreeSet<>();
		treeSet3.add(100);
		//treeSet3.add("Rahul");  //Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
		System.out.println(treeSet3);
		
	}
}
