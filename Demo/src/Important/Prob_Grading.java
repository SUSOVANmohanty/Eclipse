package Important;

import java.util.Scanner;

public class Prob_Grading {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks");
		int num = s.nextInt();
		if (num <= 30) {
			System.out.println("FAIL");
		} else if (num > 31 && num < 50) {
			System.out.println("THIRD DIVISION");
		} else if (num > 51 && num < 70) {
			System.out.println("SECOND DIVISION");
		} else if (num > 71 && num < 90) {
			System.out.println("FIRST DIVISION");
		} else
			System.out.println("DISTINCTION");
	}
}
