package chapter1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class No8SumOfSeries {

	public static void main(String[] args) {

		double sum = 0;
		DecimalFormat df = new DecimalFormat("##.00");
		df.setRoundingMode(RoundingMode.UP);

		for (int i = 1; i <= 97; i += 2) {
			for (int j = 3; j <= 99; j += 2) {
				sum += ((float) i / j);
			}
		}
		System.out.println(df.format(sum));
	}
}
