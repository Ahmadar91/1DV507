package aa224fn_assign2.ArrayQueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

import aa224fn_assign4.Queue.Queue;

public class ArrayQueue implements Queue<Object> {

	private int size = 0;
	private Object [] values =  new Object[5];
	private int first = 0;
	private int last = 0;

	public ArrayQueue() {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(Object t) {

		if (size == values.length) {
			resize();
		}

		if (isEmpty() == true) {
			values[size] = t;
			first = size;
			last = first;
		} else {
			values[size] = t;
			last = size;
		}
		size++;
	}

	@Override
	public Object dequeue() {

		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}
		Object t =  remove();

		return t;
	}

	@Override
	public Object first() {

		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}
		return values[first];
	}

	@Override
	public Object last() {

		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}

		return values[last];
	}

	@Override
	public Iterator<Object> iterator() {
		return new ArrayQueueIterator();
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		for (int i = 0; i < size; i++) {
			str.append(values[i] + " ");
		}
		str.append("]");
		return str.toString();
	}

	private void resize() {
		Object [] temp =  new Object[values.length * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = values[i];
		}
		values = temp;
	}

	private Object remove() {
		Object [] temp =  new Object[values.length];
		Object a = values[first];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = values[i + 1];
		}
		values = temp;
		last = last - 1;

		size--;
		return a;

	}

	private class ArrayQueueIterator implements Iterator<Object> {

		private int total = 0;

		@Override
		public boolean hasNext() {
			return total < size;
		}

		@Override
		public Object next() {
			return  values[total++];
		}

	}

	private void shrink() {
		Object [] temp =  new Object[size];
		for (int i = 0; i < size; i++) {
			temp[i] = values[i];

		}
		values = temp;

	}

}
