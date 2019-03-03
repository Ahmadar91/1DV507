package aa224fn_assign3.count_words;

public class Word implements Comparable<Word> {
	private String word;

	public Word(String str) {
		this.word= str.toLowerCase();
	}

	public String toString() {
		return word;
	}


	public int hashCode() {
		int hash = word.hashCode(); 
		if (hash < 0) 
			hash = -hash; 
		return hash;
		}

	public boolean equals(Object other) {
		if (other instanceof Word) {
			Word w = (Word) other;
			return this.hashCode() == w.hashCode();
		}
		return false;
		}
	
	public int compareTo(Word w) {
		return this.word.compareTo(w.word);
	}
}