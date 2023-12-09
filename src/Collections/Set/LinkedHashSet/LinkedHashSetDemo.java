package Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//Duplicate are not allowed
		//Insertion order will be maintained
		//intenal data structure is HAshTable + Double LinkedList
		//default capacity 16
		//load factor 0.75
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(null);
		linkedHashSet.add(40);
		
		System.out.println(linkedHashSet);  //[10, 20, 30, null, 40]
	}
}
