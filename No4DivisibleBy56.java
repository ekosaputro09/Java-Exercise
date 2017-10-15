package chapter1;

import java.util.Scanner;

public class No4DivisibleBy56 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Enter first integer :");
		num1 = input.nextInt();

		System.out.println("Enter second integer :");
		num2 = input.nextInt();

		System.out.println("Enter third integer :");
		num3 = input.nextInt();

		if (num1 % 5 == 0 && num1 % 6 == 0) {
			System.out.println(num1 + " is divisible by both 5 and 6");
		} else if (num1 % 5 == 0 || num1 % 6 == 0) {
			System.out.println(num1 + " is divisible by 5 or 6, but not both");
		} else {
			System.out.println(num1 + " is not divisible by either 5 or 6");
		}

		if (num2 % 5 == 0 && num2 % 6 == 0) {
			System.out.println(num2 + " is divisible by both 5 and 6");
		} else if (num2 % 5 == 0 || num2 % 6 == 0) {
			System.out.println(num2 + " is divisible by 5 or 6, but not both");
		} else {
			System.out.println(num2 + " is not divisible by either 5 or 6");
		}

		if (num3 % 5 == 0 && num3 % 6 == 0) {
			System.out.println(num3 + " is divisible by both 5 and 6");
		} else if (num3 % 5 == 0 || num3 % 6 == 0) {
			System.out.println(num3 + " is divisible by 5 or 6, but not both");
		} else {
			System.out.println(num3 + " is not divisible by either 5 or 6");
		}

	}
}
