package Collections.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.add("one");
		arrayDeque.add("two");
		arrayDeque.add("three");
		arrayDeque.add("four");
		arrayDeque.add("five");
		
		System.out.println(arrayDeque);  //[one, two, three, four, five]
		
		arrayDeque.pollFirst();  //remove first element //one
		System.out.println(arrayDeque); //[two, three, four, five]
		arrayDeque.pollLast();  //remove last element  //five
		System.out.println(arrayDeque);  // [two, three, four]
		
		arrayDeque.addFirst("zero");
		System.out.println(arrayDeque);  //[zero, two, three, four]
	}
}
