package chapter1;

import java.util.Scanner;

public class No11InverseNumber {

	public static int reverse(int number) {

		int reverse = 0;
		while (number > 0) {
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		System.out.println("The reverse of the number is : " + reverse);
		return reverse;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to reverse its digits : ");
		int number = input.nextInt();

		reverse(number);
	}
}
