
/**

Use nested loops that pint the following patterns in four separate programs:

Pattern I 	Pattern II 	Pattern III 	Pattern IV
1 		1 2 3 4 5 6 	          1 	1 2 3 4 5 6
1 2 		1 2 3 4 5 	        1 2 	  1 2 3 4 5
1 2 3 		1 2 3 4 	      1 2 3 	    1 2 3 4
1 2 3 4	 	1 2 3 		    1 2 3 4 	      1 2 3
1 2 3 4 5	1 2 		  1 2 3 4 5 	        1 2
1 2 3 4 5 6 	1 		1 2 3 4 5 6 	          1

**/

public class No7NumberPattern {

	public static void main(String[] args) {
		int i, j, k;

		System.out.println("PATTERN 1");
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("PATTERN 2");
		for (i = 6; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("PATTERN 3");
		for (i = 1; i <= 6; i++) {
			for (j = 6; j > i; j--) {
				System.out.print(" ");
			} 
			for (k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("PATTERN 4");
		for (i = 6; i >= 1; i--) {
			for (j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
