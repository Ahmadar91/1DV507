package aa224fn_assign4.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {

	private int size = 0;
	private Node<T> head = null;
	private Node<T> tail = null;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	@Override
	public void enqueue(T t) {
		if (head == null) {
			head = new Node<T>(t);
			tail = head;
		} else {
			tail.next = new Node<T>(t);
			tail = tail.next;
		}
		size++;
	}

	@Override
	public T dequeue() {
		@SuppressWarnings("unchecked")
		T f = (T) head.element;
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

	@Override
	public T first() throws NoSuchElementException {
		Node<T> node = head;
		return (T) node.value;
	}

	@Override
	public T last() throws NoSuchElementException {
		Node<T> node = tail;
		return (T) node.value;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node<T> nd = head;

		str.append("[");
		while (nd != null) {
			str.append(" " + nd.value);
			nd = nd.next;
		}
		str.append(" ]");
		return str.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator<T>();

	}

	public class QueueIterator<X> implements Iterator<X> {
		private Node<T> node = head; // First node is head

		public boolean hasNext() {
			if (node != null)
				return true;
			else
				return false;
		}

		public X next() throws IndexOutOfBoundsException {
			
			@SuppressWarnings("unchecked")
			X val = (X) node.value; 
			node = node.next;
			return val;
		}
	}

	private class Node<E> {
		
		public Node<E> element;
		E value;
		
		Node<E> next = null;

		Node(E t) {
			value = t;
		}
	}

}
