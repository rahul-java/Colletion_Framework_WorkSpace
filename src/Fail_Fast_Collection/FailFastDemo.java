package Fail_Fast_Collection;

import java.util.ArrayList;

public class FailFastDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(400);
		arrayList.add(500);
		
		for(int i: arrayList)
		{
			System.out.println(i);
			if(i==300) {
				arrayList.add(600);  //Exception in thread "main" java.util.ConcurrentModificationException
				//Fail Fast Collections will throw error immediately when we modify(add(),remove()) collection object while traversing the collection.
				//ArrayList,LinkedList,Vector,HashSet,LinkedHashSet are Fail Fast Collection
			}
		}
			
	}
}
