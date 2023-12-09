package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//for insertion arraylist is not recommended
		//Data Structure : Growable Array
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Size :"+list.size());//0
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(70);
		list.add(90);
		System.out.println("Size :"+list.size());//9
		list.add(100);
		System.out.println("Size :"+list.size());//10
		System.out.println(list);//[10, 20, 30, 40, 50, 60, 70, 70, 90, 100]
		System.out.println("Size :"+list.size());//10
		list.add(5, 55);
		System.out.println(list);//[10, 20, 30, 40, 50, 55, 60, 70, 70, 90, 100]
		System.out.println("Size :"+list.size());//11
		list.set(5, 555);
		System.out.println(list);//[10, 20, 30, 40, 50, 555, 60, 70, 70, 90, 100]
		System.out.println(list.contains(555));//true
		System.out.println(list.get(10));//100
		list.add(null);
		System.out.println(list);//[10, 20, 30, 40, 50, 555, 60, 70, 70, 90, 100, null]
		System.out.println(list.indexOf(null));//11
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		//l2.retainAll(l1);
	}
}
