package Important;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");

		int year = s.nextInt();

		if (year % 4 == 0) {
			System.out.println("2K16 is a leap year");
		} else {
			System.out.println("not a leap year");
		}
	}
}
