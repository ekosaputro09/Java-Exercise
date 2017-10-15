package chapter1;

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
