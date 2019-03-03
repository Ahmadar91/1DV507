package aa224fn_assign3.count_words;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet {
	private Node[] buckets;
	private int currentSize;

	public HashWordSet(int bucketsLength) {
		buckets = new Node[bucketsLength];
		currentSize = 0;
	}
	

	@Override
	public void add(Word word) {
		int h = word.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;

		Node current = buckets[h];
		while (current != null) {
			if (current.data.equals(word)) {
				return;
			}
			current = current.next;
		}
		Node newNode = new Node(word);
		newNode.data = word;
		newNode.next = buckets[h];
		buckets[h] = newNode;
		currentSize++;
		if (currentSize == buckets.length)
			rehash(); 
	}

	@Override
	public boolean contains(Word word) {
		int h = word.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		Node current = buckets[h];
		while (current != null) {
			if (current.data.equals(word)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public int size() {

		return currentSize;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
	
		for (int i = 0; i < buckets.length; i++) {
			Node node = buckets[i];
			while (node != null) {
				str.append(node.data + " ");
				node = node.next;
			}
		}

		return str.toString(); 
	}
	
	private void rehash() {
		Node[] temp = buckets;
		buckets = new Node[2 * temp.length];
		currentSize = 0;
		for (Node n : temp) {
			if (n == null)
				continue;
			while (n != null) {
				add(n.data);
				n = n.next;
			}
		}

	}
	@Override
	public Iterator<Word> iterator() {
		return new HashSetIterator();
	}



	private class HashSetIterator implements Iterator<Word> {
		private int bucket;
		private Node current;

		public HashSetIterator() {
			current = null;
			bucket = -1;
		}

		@Override
		public boolean hasNext() {
			if (current != null && current.next != null) {
				return true;
			}
			for (int b = bucket + 1; b < buckets.length; b++) {
				if (buckets[b] != null) {
					return true;
				}
			}
			return false;
		}

		@Override
		public Word next() {
			if (current != null && current.next != null) {
				current = current.next;
			} else {
				do {
					bucket++;
					if (bucket == buckets.length) {
						throw new NoSuchElementException();
					}
					current = buckets[bucket];
				} while (current == null);
			}
			return current.data;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public class Node {

		public Word data;
		public Node next;
		private Node(Word word) {
			this.data = word;
		}

	}

}
