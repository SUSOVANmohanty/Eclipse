package Important; // //write a java program to calculate SI=(P*R*T)/100 take principle,rate and time from user

import java.util.Scanner;

public class Simple_intrst {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		float p = s.nextFloat();
		float r = s.nextFloat();
		float t = s.nextFloat();
		float simpint = (p * r * t) / 100f;
		System.out.println("Simple Intrest" + simpint);

	}
}
