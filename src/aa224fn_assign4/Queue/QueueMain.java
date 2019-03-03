package aa224fn_assign4.Queue;

import java.util.Iterator;

public class QueueMain {

	public static void main(String[] args) {

		
		
		LinkedQueue<String> names = new LinkedQueue<String>();
		LinkedQueue<Integer> numbers = new LinkedQueue<Integer>();
		names.enqueue("Ahmad");
		names.enqueue("String");
		names.enqueue("two");
		names.enqueue("four");
		numbers.enqueue(4);
		numbers.enqueue(8);
		System.out.println("Size: "+ names.size());
		names.dequeue();
		names.dequeue();
		names.isEmpty();
		
		Iterator<String> it = names.iterator();
		int count = 1;
		System.out.println("Iterator:");
		while(it.hasNext()) {
			System.out.println(count+": " +it.next());
			count++;
		}
		System.out.println();
		System.out.println("is Empty: "+numbers.isEmpty());
		System.out.println("Head "+names.first());
		System.out.println("tail "+names.last());
		System.out.println("Size: "+ names.size());
		System.out.println("LinkedQueue names:\n"+ names.toString());
		System.out.println("LinkedQueue numbers:\n"+ numbers.toString());
		
		
		

	}

}
