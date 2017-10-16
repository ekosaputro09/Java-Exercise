
/**

If you know the balance and the annual percentage interest rate, you can compute the interest
on the next monthly payment using the following formula:

	interest = balance x (annualInterestRate / 1200)

Write a program that reads the balance and the annual percentage interest rate and displays
the interest for the next month. Use console to obtain input and display output.

**/

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class No2NextMonthlyInterest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int balance;
		float annualInterestRate;

		System.out.println("Enter balance: ");
		balance = input.nextInt();

		System.out.println("Enter annual interest rate: ");
		annualInterestRate = input.nextFloat();

		float monthlyInterestRate = annualInterestRate / 1200;

		float Interest = balance * monthlyInterestRate;

		DecimalFormat df = new DecimalFormat("##.000");
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println("The Interest is " + df.format(Interest));
	}

}
