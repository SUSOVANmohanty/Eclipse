package Important;

import java.util.Scanner;

//Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

//totalSalary = basic + hra + da + allow – pf
//where :
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.
//Round off the total salary and then print the integral part only.
public class Tot_Sala {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary");
		int bs = s.nextInt();
		float hra, da, pf, totsalary = 0;
		System.out.println("Enter your grade");
		char grade = s.next().charAt(0);
		char A;
		char B;
		char C;
		if (grade == 'A') {
			int allowance = 1700;
			hra = (20 * bs) / 100f;
			da = (50 * bs) / 100f;
			pf = (11 * bs) / 100f;

		} else if (grade == 'B') {
			int allowance = 1500;
			hra = (20 * bs) / 100f;
			da = (50 * bs) / 100f;
			pf = (11 * bs) / 100f;

		} else if (grade == 'C') {
			int allowance = 1300;
			hra = (20 * bs) / 100f;
			da = (50 * bs) / 100f;
			pf = (11 * bs) / 100f;
			totsalary = bs + hra + da + allowance - pf;
		} else
			System.out.println(totsalary);
	}
}


