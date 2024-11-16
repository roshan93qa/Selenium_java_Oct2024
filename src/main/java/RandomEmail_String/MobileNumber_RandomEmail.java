package RandomEmail_String;

public class MobileNumber_RandomEmail {
	
	
	public static void main(String[] args) {
		System.out.println(getRandomMobileNumber());
	}

	public static String getRandomMobileNumber() {
	    // Prefix with a starting digit (e.g., '9') and append the current time in milliseconds
	    return "9" + System.currentTimeMillis() % 1000000000L;
	}

}
