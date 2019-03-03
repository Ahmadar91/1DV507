package aa224fn_assign4.binheap;

public class BinaryIntHeap {
	private int[] queue = new int[8];
	private int size= 1;

	public BinaryIntHeap() {
	}

	public boolean isEmpty() {
		return size == 1;
	}

	public int size() {
		return size - 1;
	}

	public void insert(int n) {
		if (size == 1) {
			queue[size] = n;
			size++;
		} else if (size > 1) {
			if (size == queue.length)
				resize();
			queue[size++] = n;
		}
		int i = size - 1;
		check(i);
	}

	private void check(int n) {
		if (n == 1) {
			return;
		} else if (queue[n] <= queue[n / 2])
			return;
		else {
			int position = n;
			int temp = queue[n / 2];
			int i = n / 2;
			queue[i] = queue[n];
			queue[position] = temp;
			check(i);
		}
	}

	public int pullHighest() {
		if (size == 1) {
			throw new IllegalArgumentException("Queue is Empty");
		}
		int h = queue[1];
		queue[1] = queue[size - 1];

		remove();

		int i = 1;
		swap(i);
		return h;
	}

	private void remove() {
		int[] temp = new int[queue.length];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = queue[i];
		}
		queue = temp;
		size--;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i < size; i++) {
			if (i == size - 1) {
				str.append(queue[i]);
			} else
				str.append(queue[i] + " ");
		}
		return "[" + str.toString() + "]";
	}

	private void swap(int n) {
		if (n == size - 1 || n * 2 > size - 1 || n * 2 + 1 > size - 1) {
			return;
		}
		int first = queue[n * 2];
		int second = queue[n * 2 + 1];
		if (queue[n] >= first && queue[n] >= second) {
			return;
		} else {
			if (first >= second) {
				int temp = queue[n];
				queue[n] = first;
				queue[n * 2] = temp;
				swap(n * 2);
			} else {
				int temp = queue[n];
				queue[n] = second;
				queue[n * 2 + 1] = temp;
				swap(n * 2 + 1);
			}
		}
	}

	private void resize() {
		int[] temp = new int[queue.length * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = queue[i];
		}
		queue = temp;
	}
}
