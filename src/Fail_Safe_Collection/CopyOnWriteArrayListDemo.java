package Fail_Safe_Collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		//Fail Safe Collections will not throw error immediately when we modify(add(),remove()) collection object while traversing the collection.
		//CopyOnWriteArrayList, ConcurrentHashMap are Fail Safe Collection
		
		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(100);
		copyOnWriteArrayList.add(200);
		copyOnWriteArrayList.add(300);
		copyOnWriteArrayList.add(400);
		copyOnWriteArrayList.add(500);
			
		for(int i: copyOnWriteArrayList)
		{
			System.out.print(" "+i);  // 100 200 300 400 500
			if(i==100) {
				copyOnWriteArrayList.add(600); //it will add and do not throw any error but do not print immediately in that traversing
			
			}
		}
		System.out.println();
		System.out.println(copyOnWriteArrayList);  //[100, 200, 300, 400, 500, 600]
	}
}
