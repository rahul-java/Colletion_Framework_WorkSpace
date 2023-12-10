package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Smith");
		Student s2 = new Student(102, "John");
		Student s3 = new Student(103, "Amit");
		Student s4 = new Student(104, "Rahul");
		Student s5 = new Student(105, "Rohan");
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		map.put(5, s5);
		
		System.out.println(map); //{1=Student [id=101, name=Smith], 2=Student [id=102, name=John], 3=Student [id=103, name=Amit], 4=Student [id=104, name=Rahul], 5=Student [id=105, name=Rohan]}
		
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet)
		{
			System.out.println(key);
		}
		
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		for(Entry<Integer, Student> entry :entrySet)
		{
			System.out.print(entry.getKey());
			System.out.println("::"+entry.getValue());
		}
	}
}
