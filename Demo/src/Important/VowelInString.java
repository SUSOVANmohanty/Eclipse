package Important;

public class VowelInString {

	public static void main(String[] args) {
		        String word = "automation";
		        
		        // Convert the word to lowercase for case-insensitive comparison
		        //word = word.toLowerCase();// use to take the capital letter as a small letter
		        
		        // Loop through each character in the word
		        for (int i = 0; i < word.length(); i++) {
		            char ch = word.charAt(i);
		            
		            // Check if the character is a vowel
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                System.out.println(ch + " is a vowel.");
		            } //else {
		               // System.out.println(ch + " is not a vowel.");
		            }
		        }
		    }
		


