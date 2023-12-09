package Collections.List.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		//ArrayList and Vecotr both are same 
		//Vector is thread safe Arraylist is not thread safe
		//Vector is synchronized, all the moethods are synchronized
		//Data Structure : Growable Array and Thread Safe
		
		Vector<Integer> vector = new Vector<>();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		vector.add(null);
		System.out.println(vector);  //[100, 200, 300, 400, 500, null]
		
		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			//Integer no = (Integer) enumeration.nextElement();
			System.out.println(enumeration.nextElement());
			
		}
		
		
	}
}
