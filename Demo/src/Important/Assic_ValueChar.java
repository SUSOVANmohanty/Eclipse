package Important; ////identify case of input

import java.util.Scanner;

public class Assic_ValueChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("INPUT THE DATA");
		char c = s.next().charAt(0);
		if (c <= 65 && c >= 90) {
			System.out.println("Enter char is UPPER CASE");

		} else if (c >= 97 && c <= 122) {
			System.out.println("Char is LOWER CASE");
		} else
			System.out.println("Char is INVALID");
	}

}
