package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No3SortsInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Enter first integer: ");
		num1 = input.nextInt();

		System.out.println("Enter second integer: ");
		num2 = input.nextInt();

		System.out.println("Enter third integer: ");
		num3 = input.nextInt();

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);

		Collections.sort(intList);

		System.out.println("The Sorted Integer : " + intList);
	}
}
