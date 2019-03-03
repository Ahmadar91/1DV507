package aa224fn_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	public void push(int n) {
		if (size == values.length)
			resize();
		if (size != 0) {
			for (int i = size + 1; i > 0; i--) {
				values[i] = values[i - 1];
			}
		}
		size++;
		values[0] = n;
	}

	public int pop() throws IndexOutOfBoundsException {
		int x = values[0];
		for (int i = 0; i < size - 1; i++) {
			values[i] = values[i + 1];
		}
		size--;
		return x;
	}

	public int peek() throws IndexOutOfBoundsException {
		return values[0];
	}
}
