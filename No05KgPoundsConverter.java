/**

Write a program that displays the table that converts kilogram to pounds(note that 1 kilogram is 2.2 pounds)

**/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class No5KgPoundsConverter {

	public static void main(String[] args) {
	
		System.out.println("Kilograms \t" + "Pounds");
		
		DecimalFormat df = new DecimalFormat("##.0");
		df.setRoundingMode(RoundingMode.DOWN);

		for (int i = 1; i < 200; i += 2 ) {
			System.out.println(i  + " \t\t" + df.format(i * 2.2));
		}
	}
}
