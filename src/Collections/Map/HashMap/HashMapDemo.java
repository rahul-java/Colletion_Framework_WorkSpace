package Collections.Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "John");
		map.put(102, "Smith");
		map.put(103, "Orlen");
		map.put(104, "Allen");
		map.put(102, "Rahul");
		
		System.out.println("Map Size ::: "+map.size());  //Map Size ::: 4
		System.out.println(map); //{101=John, 102=Smith, 103=Orlen, 104=Allen}
		System.out.println(map.containsKey(103));  //true
		System.out.println(map.containsKey(200));  //false
		System.out.println(map.isEmpty());  //false
		System.out.println(map.get(101)); //John
		System.out.println(map.get(100)); //null
		
		Set<Integer> keySet = map.keySet();
		for(Integer key :keySet)
		{
			System.out.print(key);
			System.out.println(" : "+map.get(key));
		}
		
		Collection<String> values = map.values();
		for(String v:values)
		{
			System.out.println(v);
		}
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() +":"+entry.getValue());
			
		}
		
		for(Entry<Integer, String> entry: entrySet)
		{
			System.out.print(entry.getKey());
			System.out.println(":::"+entry.getValue());
		}
		
		map.clear();
		System.out.println(map.size());  //0
		
		
	}
}
