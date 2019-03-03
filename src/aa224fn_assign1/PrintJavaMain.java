package aa224fn_assign1;

import java.io.File;

public class PrintJavaMain {

	public static void main(String[] args) {

		File startDir = new File("C:\\Users\\Ahmad\\eclipse-workspace\\aa224fn_assign1");
		if (startDir.exists())
			System.out.println("Start: " + startDir);
		else
			System.out.println("Can't find directory: " + startDir);
		visitSub(startDir);
	}

	private static int depth = 1;

	private static void visitSub(File file) {
		if (file.isDirectory()) {
			depth++;
			File[] subs = file.listFiles();
			for (File f : subs)
				visitSub(f);
			depth--;
		}
		if (file.getName().endsWith(".java"))
			printDir(file);
	}

	private static int count = 0;

	private static void printDir(File file) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < depth; i++)
			buf.append("  ");
		System.out.println((++count) + buf.toString() + file.getName() + buf.toString() + file.length());
	}

}
