package Important;

import java.util.Scanner;

public class EvenOdd_UserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter tHe dAtA");
		int i = s.nextInt();
		if (i % 2 == 0) {
			System.out.println("Even no");
		} else
			System.out.println("Odd no");
	}

}
