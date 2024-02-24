public class parpass1 {
	
	// Function to add two integers (call by value)
	static int par(int x, int y) {
		int z = x + y; // Perform addition
		return z; // Return the result
	}
	
	// Main method
	public static void main(String ar[]) {
		int a = 10, b = 20, c; // Declare variables a, b, and c
		c = par(a, b); // Call the par function with a and b as arguments and assign the result to c
		System.out.println(c); // Print the value of c
	}
}
