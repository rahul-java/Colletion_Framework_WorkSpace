package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
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
		list.add(100);
		System.out.println("============for loop===============");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("=============for Each loop==============");
		
		for(Object ob:list)
		{
			System.out.println(ob);
		}
		
		System.out.println("==============iterator===============");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		System.out.println("============list iterator===============");
		ListIterator listIterator = list.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
			
		}
		
		System.out.println("=============forEach()==============");
		
		list.forEach(i->System.out.println(i));
		
		System.out.println("####################################");
		ListIterator listIterator2 = list.listIterator();
		//first goto the last index of the list then it will work
		while(listIterator2.hasPrevious())
			System.out.println(listIterator2.next());
	}
}
