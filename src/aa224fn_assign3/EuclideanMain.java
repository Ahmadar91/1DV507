package aa224fn_assign3;

import java.util.Scanner;

public class EuclideanMain {


	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the first Number: ");
		int x = sc.nextInt();
		if(x<0) {
			System.out.println("Negative Number Please enter a positive number");
			x= sc.nextInt();
		}
		System.out.print("Enter the Second Number: ");
		int y = sc.nextInt();
		if(y<0) {
			System.out.println("Negative Number Please enter a positive number");
			y= sc.nextInt();
		}
		
		System.out.println("Gcd("+x+","+ y+") = " + gcd(x, y));
		sc.close();
	}


	
	private static int gcd(int a, int b) {
		if (a < 0 || b < 0 ) {
			throw new IllegalArgumentException("Negative Number Please enter a positive number");
		}
		 if(b==0) {
		 return a;
		 }else
		 return gcd(b, a%b);
	}
}
