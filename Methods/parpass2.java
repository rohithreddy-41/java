public class parpass2 {
	
	// Function to display a welcome message with a name (call by reference)
	static void welcome(String n) {
		// Display the welcome message with the given name
		System.out.println("Welcome Mr. " + n); 
	}
	
	// Main method
	public static void main(String ar[]) {
		 // Declare and initialize the name variable
		String name = "rohith";
		 // Call the welcome function with the name variable as an argument
		welcome(name);
	}
}
