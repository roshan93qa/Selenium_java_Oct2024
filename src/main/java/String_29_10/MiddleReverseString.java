package String_29_10;

public class MiddleReverseString {



	    public static void main(String[] args) {
	        String str = "Roshan"; // Initialize the input string

	        if (str.length() <= 2) { // Check if the string is too short to reverse
	            System.out.println("Output: " + str); // If yes, just print the string as it is
	        } else {
	            // Extract first and last characters
	            char first = str.charAt(0); // Get the first character
	            char last = str.charAt(str.length() - 1); // Get the last character

	            // Reverse the middle characters by prepending each character
	            String revM = ""; // Initialize an empty string for reversed middle part
	            for (int i = 1; i < str.length() - 1; i++) { // Loop through the middle part of the string
	                char c = str.charAt(i); // Get the character at position i
	                revM = c + revM; // Prepend the character to revM (reverse the word)
	            }

	            // Combine and print the result
	            System.out.println("Output: " + first + revM + last); // Output the final string
	        }
	    }
	

	}


