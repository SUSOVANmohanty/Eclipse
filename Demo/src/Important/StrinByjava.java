package Important;

public class StrinByjava {

	public static void main(String[] args) {
		String name = "Automation is good"; // Define the input string
		int length = name.length(); // Get the length of the input string
		String rev = ""; // Initialize an empty string to store the reversed string

		// Iterate through the characters of the input string in reverse order
		for (int i = length - 1; i >= 0; i--) {
			// Append the current character to the 'rev' string
			rev = rev + name.charAt(i);
		}
        // Print the reversed string
		System.out.println(rev);
	}
}
