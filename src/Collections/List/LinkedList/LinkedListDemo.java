package Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//for retreival linkedlist is not recommended
		
		//Data Structure : Doubled Linked List
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		System.out.println(linkedList);  //[10, 20, 30, 40]
		linkedList.add(1,15);
		System.out.println("==================================");
		System.out.println(linkedList); //[10, 15, 20, 30, 40]
		System.out.println(linkedList.get(3));// 30
		System.out.println(linkedList.getLast());// 40
	}
}
