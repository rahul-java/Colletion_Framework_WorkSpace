package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//initial capacity is 16
		//Load Factor is 0.75
		//HashSet uses HashMap internally
		//internal data structure is HashTable to store the obj
		//duplicates are not allowed
		//intenal data structure is HAshTable
		//insertion order will not maintained
		
		HashSet<String> hashSet = new HashSet<>();
		
		//HashSet<Object> hashSet2 = new HashSet<>(100, 0.50f);
		//initial capacity :100, LoadFactor:0.50f
		
		hashSet.add("One");  //true
		hashSet.add("Two");  //true
		hashSet.add("Three");  //true
		hashSet.add("Four");  //true
		hashSet.add("Four");  //false // duplicates are not allowed thats why it will return false
		System.out.println(hashSet.add("Four"));  //false
		hashSet.add(null); // Allowed
		
		System.out.println(hashSet);// [null, One, Four, Two, Three] //insertion order will not maintained
		
		hashSet.remove("Four");
		System.err.println(hashSet);  //[null, One, Two, Three]
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Spliterator<String> spliterator = hashSet.spliterator();
			spliterator.forEachRemaining(s->System.out.println(s));
	}
}
