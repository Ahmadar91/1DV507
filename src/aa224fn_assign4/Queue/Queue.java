package aa224fn_assign4.Queue;

import java.util.Iterator;

public interface Queue<T> {
	public int size();

	public boolean isEmpty();

	public void enqueue(T t);

	public T dequeue();

	public T first();

	public T last();

	public String toString();

	public Iterator<T> iterator();
}
