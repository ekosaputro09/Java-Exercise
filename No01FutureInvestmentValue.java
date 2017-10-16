
/**
Write a program that reads in investment amount, annual interest rate, and number of years,
and display the future investment value using the following formula:

	futureInvestmentValue = investmentAmount x (1 + monthlyInvestmentRate)^(numberOfYears x 12)

For example, if you entered amount 1000, annual interest rate 3.25%, and number of years 1,
the future investment value is 1032.98
**/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class No1FutureInvestmentValue {

	public static void main(String[] args) {

		int investmentAmount = 1000;
		double annualInterestRate = 3.25 / 100;
		double monthlyInterestRate = annualInterestRate / 12;
		int numberOfYears = 1;

		double a = 1 + monthlyInterestRate;
		double b = numberOfYears * 12;
		double futureInvestmentValue = investmentAmount * Math.pow(a, b);

		DecimalFormat df = new DecimalFormat("##.00");
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df.format(futureInvestmentValue));
	}
}
