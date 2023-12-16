package Fail_Safe_Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		//Fail Safe Collections will not throw error immediately when we modify(add(),remove()) collection object while traversing the collection.
		//CopyOnWriteArrayList, ConcurrentHashMap are Fail Safe Collection
		
		ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
		
		concurrentHashMap.put(101, "One");
		concurrentHashMap.put(102, "Two");
		concurrentHashMap.put(103, "Three");
		concurrentHashMap.put(104, "Four");
		concurrentHashMap.put(105, "Five");
		
		Set<Integer> keySet = concurrentHashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() +" ");  //101 102 103 104 105 106 
			
			concurrentHashMap.put(106, "Six"); //imediately added to the map.
		}
		
		System.out.println("\n"+concurrentHashMap);  //{101=One, 102=Two, 103=Three, 104=Four, 105=Five, 106=Six}
			
		
	}
}
