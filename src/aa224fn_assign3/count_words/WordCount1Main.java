package aa224fn_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import aa224fn_assign3.count_words.Word;

public class WordCount1Main {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File file = new File("C:\\Users\\Ahmad\\eclipse-workspace\\words.txt");
		HashSet<Word> hs = new HashSet<Word>();
		TreeSet<Word> ts = new TreeSet<Word>();
		String line;
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			line = scan.next();
			Word w = new Word(line);
			hs.add(w);
			ts.add(w);
		}
		
	

		int count = 1;
		System.out.println("Sorted TreeSet: ");

		Iterator<Word> it = ts.iterator();
		while (it.hasNext())
			System.out.println(count++ + ": " + it.next());
		System.out.println();
		
		System.out.println("HashSet Size: " + hs.size());
		System.out.println("TreeSet Size: " + ts.size() + "\n");

		scan.close();

	}

}
