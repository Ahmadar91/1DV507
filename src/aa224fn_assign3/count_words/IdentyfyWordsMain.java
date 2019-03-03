package aa224fn_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentyfyWordsMain {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		File file = new File("C:\\Users\\Ahmad\\eclipse-workspace\\Historyofprogramming.txt");
		Scanner scan = new Scanner(file);
		scan.useDelimiter("[^a-zA-Z\\s]+");
		FileWriter fw = new FileWriter("C:\\Users\\Ahmad\\eclipse-workspace\\words.txt");
		PrintWriter out = new PrintWriter(fw);
		String text = "";
		while (scan.hasNext()) {
		text=scan.next();	out.println(text);
		}
			out.close();
			scan.close();
		}
	}


