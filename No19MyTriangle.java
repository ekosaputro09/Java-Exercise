
/**

Create a class named MyTriangle that contains the following two methods:

* Returns true if the sum of any two sides is greater that the third side.
public static boolean isValid(double side1, double side2, double side3)

* Returns the area of the triangle.
public static double area(double side1, double side2, double side3)

Write a test program that reads three sides for a triangle and computes the area if the input is
valid. Otherwise, it displays that the input is invalid.

**/

import java.util.Scanner;

public class No19MyTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)) {
			System.out.println("That is a triangle sides");
			return true;
		} else {
			System.out.println("That is not a triangle sides");
			return false;
		}
	}

	public static double area(double side1, double side2, double side3) {
		double S = 0;
		double area = 0;

		S = (side1 + side2 + side3) / 2;
		area = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));

		System.out.println("The area of the triangle is : " + area);

		return area;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter side 1 :");
		double side1 = input.nextDouble();

		System.out.println("Enter side 2 :");
		double side2 = input.nextDouble();

		System.out.println("Enter side 3 :");
		double side3 = input.nextDouble();

		isValid(side1, side2, side3);

		area(side1, side2, side3);

	}
}
