package aa224fn_assign1;

import java.util.Scanner;

public class SumMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		System.out.println("First half of the Sum: " + (FirstSum(n / 2)));
		System.out.println("Second half of the sum " + (SecondSum(n / 2 + 1, n)));
		System.out.println("Total Sum: " + Totalsum(n));
		sc.close();
	}

	public static int Totalsum(int n) {
		if (n == 1)
			return 1;
		int x = n / 2;
		return FirstSum(x) + SecondSum(x + 1, n);
	}

	private static int FirstSum(int n) {
		if (n == 1)
			return 1;
		return FirstSum(n - 1) + n;

	}

	private static int SecondSum(int start, int end) {
		if (end == start)
			return start;
		return SecondSum(start, end - 1) + end;

	}

}
