package Important;

public class PrimeNumbers {

	public static void main(String[] args) {
				int no =7;  
				int temp =0;  // Variable to count the number of divisors
				for(int i=2;i<=no-1;i++) {
					if(no % i == 0)
						// Check if no is divisible by i without leaving a remainder
					{
						temp = temp + 1; // If no is divisible by i, increment temp
					}
				}
				// Check if temp is greater than 1
				if (temp>1)
					// If temp is greater than 1, print "not a prime no"
				{
					System.out.println("not a prime no");
				} else
					// If temp is not greater than 1, print " prime no"
				{
					System.out.println("prime");
				}
			}
		}


