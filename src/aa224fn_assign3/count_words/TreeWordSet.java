package aa224fn_assign3.count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
	
	int count = 0;
	private BST root = null;
	private int currentSize;
	private Word[] arr = new Word[8];

	public TreeWordSet() {
		currentSize = 0;
	}



	@Override
	public void add(Word word) {
		if (root == null) {
			root = new BST(word);
			currentSize++;
		} else {
			root.add(word);
		}
	}

	@Override
	public boolean contains(Word word) {
		if (currentSize == 0)
			return false;
		else
			return root.contains(word);
	}

	@Override
	public int size() {
		return currentSize;
	}

	@Override
	public String toString() {
			return "[ " + root.print() + " ]";
		
	}

	private void resize() {
		Word[] temp = new Word[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	@Override
	public Iterator<Word> iterator() {
		return new TreeWordSetIterator();
	}

	public class TreeWordSetIterator implements Iterator<Word> {

		private int count = 0;

		public TreeWordSetIterator() {
			root.getArraycontent();
		}

		@Override
		public boolean hasNext() {
			if (root == null)
				return false;
			else if (arr[count] == null)
				return false;

			else
				return count < arr.length;
		}

		@Override
		public Word next() {
			return arr[count++];
		}
	}

	private class BST {

		private Word word;
		private BST left = null;
		private BST right = null;

		public BST(Word word) {
			this.word = word;
		}

		private void add(Word word) {
			if (word.compareTo(this.word) < 0) {
				if (left == null) {
					left = new BST(word);
					currentSize++;
				} else
					left.add(word);
			} else if (word.compareTo(this.word) > 0) {
				if (right == null) {
					right = new BST(word);
					currentSize++;
				} else
					right.add(word);
			}
		}

		private boolean contains(Word word) {
			if (word.compareTo(this.word) < 0) {
				if (left == null)
					return false;
				else
					return left.contains(word);
			}
			else if (word.compareTo(this.word) > 0) {
				if (right == null)
					return false;
				else
					return right.contains(word);
			}
			return true;
		}
		
		private Word[] getArraycontent() {
			
			if (left != null)
				left.getArraycontent();

			if (count == arr.length)
				resize();
			
			arr[count] = word;
			count++;
			
			if (right != null)
				right.getArraycontent();

			return arr;
		}


		private String print() {
			StringBuilder str = new StringBuilder();
			if (left != null)
				left.print();

			str.append(word + " ");

			if (right != null)
				right.print();

			return str.toString();
		}
	}

}
