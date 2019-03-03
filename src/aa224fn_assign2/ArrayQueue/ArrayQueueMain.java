package aa224fn_assign2.ArrayQueue;

import java.util.Iterator;

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue();
		aq.enqueue(2);
		aq.enqueue(2);
		aq.enqueue(2);
		aq.enqueue(2);
		aq.enqueue(2);
		
		aq.enqueue(2);
		aq.enqueue(2);
		Iterator<Object> it = aq.iterator();
		int count = 1;
		while(it.hasNext()) {
			System.out.println(count +" " + it.next());
			count++;
		}
		aq.dequeue();
		aq.dequeue();
		System.out.println();
		Iterator<Object> it1 = aq.iterator();
		int c = 1;
		while(it1.hasNext()) {
			System.out.println(c +" " + it1.next());
			c++;
		}
		ArrayQueue aq1 = new ArrayQueue ();
		aq1.enqueue("Two");
		aq1.enqueue("Two");
		aq1.enqueue("Two");
		
		aq1.enqueue("Two");
		
		aq1.enqueue("Two");
		
		System.out.println("\n ArrayQueue Contnet:" + aq.toString());
		System.out.println("\n ArrayQueue Contnet:" + aq1.toString());
	}

}
