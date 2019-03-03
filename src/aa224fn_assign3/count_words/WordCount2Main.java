package aa224fn_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class WordCount2Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Ahmad\\eclipse-workspace\\words.txt");
		HashWordSet hs = new HashWordSet(100);
		TreeWordSet ts = new TreeWordSet();
		String line;
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			line = scan.next();
			hs.add( new Word(line));
			ts.add( new Word(line));
		}
		int count = 1;
		Iterator<Word> it = ts.iterator();
		while (it.hasNext())
		System.out.println(count++ + ": " + it.next());
		
		System.out.println();
		System.out.println("HashSet Size: " + hs.size());
		System.out.println("HashSet Size: " + ts.size());

		System.out.println("HashSet Contains: " + hs.contains(new Word("programing")));
		System.out.println("TreeSet Contains: " + ts.contains(new Word("a")));
		System.out.println("HashSet Contains: " + hs.contains(new Word("a")));
		
		scan.close();
		

	}
}
