package Fail_Fast_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FailFastDemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();

		map.put(101, "One");
		map.put(102, "Two");
		map.put(103, "Three");
		map.put(104, "Four");
		map.put(105, "Five");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			map.put(106, "Six"); //Exception in thread "main" java.util.ConcurrentModificationException
		}
			
	}
}
