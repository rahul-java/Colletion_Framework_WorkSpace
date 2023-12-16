package Difference.HashMap_Vs_WeakHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

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
		//HashMAp keys will have strong reference that mean they will maintain a reference hence they are not eligible for garbage Collector
		
		System.out.println("Size : "+hashMap.size()); //Size : 4
		System.out.println(hashMap);  //{Rahul=105, Jayant=104, Ashok=102, Mayank=103}
		
		System.out.println("========================================");
		
		WeakHashMap<Integer,String> weakHashMap = new WeakHashMap<>();
		
		//WeakHashMAp keys will have weak reference that means they are eligible for garbage Collector
		//GC will dominate WeakHAshMAp
		
		
		System.out.println("Size : "+weakHashMap.size());  //Size : 0
		
		weakHashMap.put(101,"Rahul");
		weakHashMap.put(102,"Ashok");
		weakHashMap.put(103,"Mayank");
		weakHashMap.put(104,"Jayant");
		weakHashMap.put(104,"Aman");
		
		System.out.println("Size : "+hashMap.size());  //4
		System.out.println(weakHashMap); // {104=Aman, 101=Rahul, 103=Mayank, 102=Ashok}
	}
}
