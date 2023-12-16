package Collections.Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("John");
		pq.add("Smith");
		pq.add("Orlen");
		pq.add("Charles");
		
		System.out.println(pq);  //[Charles, John, Orlen, Smith]
		System.out.println(pq.element());  //head of the element//Charles
		System.out.println(pq.peek());  //Charles
		
		Iterator<String> iterator = pq.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println(pq);  //[Charles, John, Orlen, Smith]
		pq.remove();//remove head of the element//Charles Removed
		pq.poll();  //John removed
		
		System.out.println(pq);  //[Orlen, Smith]
	}
}
