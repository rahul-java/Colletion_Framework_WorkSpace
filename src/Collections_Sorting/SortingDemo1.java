package Collections_Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(2);
		
		System.out.println(arrayList); //[5, 3, 4, 1, 2]
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList);  //[1, 2, 3, 4, 5]
		
		Collections.reverse(arrayList);
		
		System.out.println(arrayList);  //[5, 4, 3, 2, 1]
	}
}
