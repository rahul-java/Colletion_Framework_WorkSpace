package Difference;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		System.out.println("Size : "+hashMap.size());  //Size : 0
		
		hashMap.put("Rahul", 101);
		hashMap.put("Ashok", 102);
		hashMap.put("Mayank", 103);
		hashMap.put("Jayant", 104);
		hashMap.put(new String("Rahul"), 105); //duplicate key not accepted. It will replace previous value
		//it will check with equals() method 
		//compare content of the keys
		
		System.out.println("Size : "+hashMap.size()); //Size : 4
		System.out.println(hashMap);  //{Rahul=105, Jayant=104, Ashok=102, Mayank=103}
		
		System.out.println("========================================");
		
		IdentityHashMap<String,Integer> identityHashMap = new IdentityHashMap<>();
		
		System.out.println("Size : "+identityHashMap.size());  //Size : 0
		
		identityHashMap.put("Rahul", 101);
		identityHashMap.put("Ashok", 102);
		identityHashMap.put("Mayank", 103);
		identityHashMap.put("Jayant", 104);
		
		identityHashMap.put(new String("Rahul"), 105); // it will check by == operator //it will compare the address of the string
		identityHashMap.put("Jayant", 999);  //if address will be the same then it will replace
		
		//it will check with == operator
		//compare the address of the content
		
		System.out.println("Size : "+identityHashMap.size()); //Size : 5
		System.out.println(identityHashMap);  //{Ashok=102, Rahul=101, Mayank=103, Rahul=105, Jayant=999}
		
	}
}
