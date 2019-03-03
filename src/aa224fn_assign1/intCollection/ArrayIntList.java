package aa224fn_assign1.intCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	public void add(int n) {
		if (size == values.length)
			resize();
		values[size++] = n;
	}

	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		if (size == values.length)
			resize();

		if (checkIndex(index, size + 1) == true) {
			for (int i = size - 1; i >= index; i--) {
				values[i + 1] = values[i];
			}
			values[index] = n;
			size++;
		} else
			throw new IndexOutOfBoundsException();
	}

	public void remove(int index) throws IndexOutOfBoundsException {
		if (checkIndex(index, size) == true) {
		for (int i = index; i < size - 1; i++) {
			values[i] = values[i + 1];
		}
		size--;
		} else
			throw new IndexOutOfBoundsException();
	}
		

	public int get(int index) throws IndexOutOfBoundsException {
		if (checkIndex(index, size) == true)
			return values[index];
		else
			throw new IndexOutOfBoundsException();

	}

	public int indexOf(int n) {
		if (n > values.length - 1 || n < 0)
			throw new IndexOutOfBoundsException("Index " + n + " is out of bounds!");
		for (int i = 0; i < values.length; i++)
			if (values[i] == n)
				return i;
		return -1;
	}

}
