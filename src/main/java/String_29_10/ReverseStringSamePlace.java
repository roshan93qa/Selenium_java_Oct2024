package String_29_10;

public class ReverseStringSamePlace {

	public static void main(String[] args) {
		String str = "Test Automation"; // The input string
		String[] words = str.split(" "); // Split the string into words based on spaces
		String result = ""; // Initialize the result string

		// Loop through each word in the words array
		for (String e : words) {

			String rev = ""; // Temporary variable to hold the reversed word

			// Loop through each character of the word to reverse it
			for (int i = 0; i < e.length(); i++) {
				char c = e.charAt(i); // Get the character at position i
				rev = c + rev; // Prepend the character to rev (reverse the word)
			}

			//result = result + rev + " "; // Append the reversed word to the result string with a space
			System.out.print(rev+" ");
		}

		//System.out.println(result.trim()); // Print the result and trim any extra spaces at the end
	}
}
