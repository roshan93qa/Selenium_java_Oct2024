package RandomEmail_String;

public class fistname_lastname {
	
	
	
	public static class RandomDataGenerator {

	    // Method to generate a random first name
	    public static String getRandomFirstName() {
	        return "FirstName" + System.currentTimeMillis();
	    }

	    // Method to generate a random last name
	    public static String getRandomLastName() {
	        return "LastName" + System.currentTimeMillis();
	    }

	    public static void main(String[] args) {
	        RandomDataGenerator generator = new RandomDataGenerator();

	        System.out.println("Random First Name: " + generator.getRandomFirstName());
	        System.out.println("Random Last Name: " + generator.getRandomLastName());
	    }
	}


}
