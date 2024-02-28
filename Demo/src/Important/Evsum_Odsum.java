package Important;   //write a programme evsum odsum

import java.util.Scanner;

public class Evsum_Odsum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data");
		int a = s.nextInt();
		int evsum = 0;
		int odsum = 0;
		while (a != 0) {
			int rem = (a % 10);
			if (rem % 2 == 0)
			{
				evsum = evsum + rem;
			} 
			else
			{
				odsum = odsum + rem;
			}
			a = a / 10;
		}
		System.out.println("Sum of even no is" + evsum);
		System.out.println("Sum of odd no is" + odsum);
	}
}
