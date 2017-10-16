
/**

Write a method that computes future investment value at a given interest rate for a specified number of years. 
The future investment is determined using the formula in No 01. 
Use the following method header:

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)

For example, futureInverstmentValue (10000, 0.05/12, 5) returns 12833.59

Write a test program that prompts the user to enter the investment amount (eg., 1000) and the
interest rate (e.g., 9%), and print a table that displays future value for the years form 1 to 30.

**/

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class No13FutureInvestmentValue {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int Years) {

		double a = 1 + monthlyInterestRate;
		double b = Years * 12;
		double futureInvestmentValue = investmentAmount * Math.pow(a, b);
	
		return futureInvestmentValue;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the investment amount : ");
		double investmentAmount = input.nextDouble();

		System.out.println("Enter the interest rate (in %) : ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.println();		
		System.out.println("The amount invested  : " + investmentAmount);
		System.out.println("Annual interest rate : " + annualInterestRate + "%");
		System.out.println();
		System.out.println("Years\t" + "Future Value");

		DecimalFormat df = new DecimalFormat("##.00");
		df.setRoundingMode(RoundingMode.DOWN);

		for (int Years = 1 ; Years <= 30; Years++) {
			System.out.println(Years + " \t " + df.format(futureInvestmentValue(investmentAmount, monthlyInterestRate, Years)));
		}

	}
}
