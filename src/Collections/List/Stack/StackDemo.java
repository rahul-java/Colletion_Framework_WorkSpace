package Collections.List.Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		//Follow LIFO rule Last In First Out
		
		//Data Structure : L I F O
		
		Stack<Object> stack = new Stack<>();
		
		stack.add(10); 
		stack.add(20);
		stack.add(30);
		
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack);  //[10, 20, 30, 40, 50, 60]
		
		System.out.println("pop() ::: "+stack.pop()); //60 // remove top element and return that element
		System.out.println(stack);  //[10, 20, 30, 40, 50]
		System.out.println("peek() ::: "+stack.peek());  //50  // it will return top element
		System.out.println(stack);  //[10, 20, 30, 40, 50]
		System.out.println("pop() ::: "+stack.pop());  //50
		System.out.println(stack);  //[10, 20, 30, 40]
	}
}
