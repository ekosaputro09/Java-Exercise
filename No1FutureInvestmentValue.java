package chapter1;

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
