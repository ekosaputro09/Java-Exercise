package chapter1;

import java.util.Scanner;

public class No10SumDigits {

	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum = (int) (sum + n % 10);
			n = n / 10;
		}
		System.out.println("Sum of the number digits is : " + sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to sum the digits :");
		long n = input.nextLong();

		sumDigits(n);
	}
}
