package aa224fn_assign1;

import java.util.Scanner;

public class PascalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Number: ");
		int n = sc.nextInt();
		int[] Pascal;

		for (int i = 0; i < n; i++) {
			Pascal = pascalRow(i);
			for (int k = i; k < n; k++)
				System.out.print(" ");
			System.out.println(ToString(Pascal));
		}
		sc.close();
	}

	private static int[] pascalRow(int n) {
		int[] Values = new int[n + 1];
		int[] row = new int[Values.length];
		Values[0] = 1;
		Values[n] = 1;
		if (n == 0) {
			return Values;
		}
		row = pascalRow(n - 1);
		for (int i = 1; i < row.length; i++) {
			Values[i] = row[i] + row[i - 1];
		}
		return Values;
	}

	private static String ToString(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++)
			str = str + String.valueOf(arr[i] + " ");
		return str;
	}

}
