package aa224fn_assign2.Queue;


public class QueueMain {

	public static void main(String[] args) {

		
		
		LinkedQueue lq = new LinkedQueue();
		
		
		lq.enqueue("Ahmad");
		lq.enqueue("String");
		lq.enqueue("two");
		lq.enqueue(4);
		lq.enqueue(8);
		System.out.println("Size: "+ lq.size());
		lq.dequeue();
		lq.dequeue();
		lq.isEmpty();
		
		System.out.println("is Empty: "+lq.isEmpty());
		System.out.println("Head "+lq.first());
		System.out.println("tail "+lq.last());
		System.out.println("LinkedQueue:\n\n"+ lq.toString());
		System.out.println("Size: "+ lq.size());
		
		

	}

}
