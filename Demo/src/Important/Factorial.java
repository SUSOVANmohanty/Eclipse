package Important;

public class Factorial {

	public static void main(String[] args) {
		int n=5;  //initialize a value to n that what we are going to calculate the factorial
		int fact=1;  //fact is initialize 1 which is the initial value for factorial calculation
		for(int i=1;i<=n;i++)  //initialize,condition,inc/dec(int i=1,i should be less than equal to n)
		{
			fact=fact*i;   //
			System.out.println(fact);
			
		}

	}

}
