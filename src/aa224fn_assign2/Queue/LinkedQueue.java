package aa224fn_assign2.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

	/**
	 * @author Ahnmad Abdilrahim 
	 * Class that implements Queue interface in a Linked
	 */

public class LinkedQueue implements Queue {
	/**
	 * integer counts the size of the Queue
	 */
	private int size = 0;
	/**
	 * Node head which is the first element is the Queue
	 */
	private Node head = null;
	/**
	 * Node tail which is the last element is the Queue
	 */
	private Node tail = null;

	/**
	 *  the size of the Queue
	 * 
	 * @return <code>Integer</code> the size of the queue.
	 * 
	 */
	public int size() {
		return size;
	}

	/**
	 * checks the Queue if it is empty
	 * 
	 * @return <code>true</code> if the queue is empty <code>false</code> if it contains an element set false
	 * 
	 * 
	 * 
	 */
	public boolean isEmpty()  {
		return head == null && tail == null;
	}

	/**
	 * Add an Object to the Queue and increase the size counter by one for each
	 * Object added to show the size of Queue
	 * 
	 * @param element of type Object to be added
	 *
	 */

	public void enqueue(Object element) {
		if (head == null) { 
			head = new Node(element);
			tail = head;
		} else {
			tail.next = new Node(element); 
			tail = tail.next; 
		}
		size++;
	}

	/**
	 * Remove an Object to the Queue. and decrease the size counter by one for each
	 * Object removed to show the size of Queue
	 * 
	 * @return the object f= head.element
	 * @throws NoSuchElementException when dequeuing an element if the queue is empty 
	 */
	public Object dequeue() {
		Object f = head.element;
		if (isEmpty()) {
			throw new NoSuchElementException("Queue Underflow");
		} else if (head == tail) {
			head = null;
			tail = null;
			return f;
		}
		head = head.next;
		size--;
		return f;

	}

	/**
	 *
	 * @return he First element of the Queue
	 * @throws NoSuchElementException when the head does not contain an element null
	 */

	public Object first() throws NoSuchElementException {
		Node node = head;
		return node.value;
	}

	/**
	 *
	 * @return he Last element of the Queue
	 * @throws NoSuchElementException when the tail does not contain an element null
	 */

	public Object last() throws NoSuchElementException {
		Node node = tail;
		return node.value;
	}

	/**
	 *
	 * Add the Queue elements to a String and returns it
	 * @return String which contains the elements of the Queue
	 */

	public String toString() {
		StringBuilder str = new StringBuilder();
		Node nd = head;
		str.append("[");
		while (nd != null) {
			str.append(" " + nd.element);
			nd = nd.next;
		}
		str.append(" ]");
		return str.toString();
	}

	/**
	 *
	 * Iterator of type Object
	 * 
	 * @return the contains of the Queue in ordered
	 */

	public Iterator<Object> iterator() {
		return new QueueIterator();

	}

	/**
	 * the implementation of the iterator
	 */
	public class QueueIterator implements Iterator<Object> {
		private Node node = head; // First node is head

		/**
		 * @return <code>true</code> if the iterator has an object in the Queue
		 * @return <code>false</code> if there is no Objects in the Queue
		 */
		public boolean hasNext() {
			if (node != null)
                return true;
            else
                return false;
		}

		/**
		 * @return The next Object in the Queue
		 * @throws IndexOutOfBoundsException if the iterator goes beyond the queue
		 */

		public Object next() throws IndexOutOfBoundsException {
			Object val = node.value; // Read current value
			node = node.next; // Move one step ahead
			return val;
		}
	}

	/**
	 * the implementation of the Node
	 * 
	 * 
	 */
	private class Node {
		public Object element;
		/**
		 * Object Node
		 */
		Object value;
		/**
		 * Node next which equals to null
		 */

		Node next = null;

		/**
		 * Node constructor which has a parameter of type element
		 * 
		 * @param element
		 * 
		 */

		Node(Object element) {
			value = element;
		}
	}

}
