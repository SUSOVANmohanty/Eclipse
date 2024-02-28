package Important;

import java.util.Scanner;

public class Lowercase_Uppercase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the alphabets");
		char c = s.next().charAt(0);
		if (c >= 'a' && c <= 'z') {
			System.out.println("lower case");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("upper case");
		} else if (c >= '0' && c <= '9') {
			System.out.println("Numeric value");
		}

		else
			System.out.println("Special");
	}
}
