import java.util.*;

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Fibonacci numbers to generate: ");
		int n = sc.nextInt();

		// Initialize the first two numbers in the Fibonacci sequence
		int a = 0, b = 1;
		System.out.print(a + "," + b + ",");

		// Generate the remaining Fibonacci numbers
		for (int i = 0; i < n; i++) {
		// Calculate the next Fibonacci number by summing the previous two numbers
			int c = a + b;
			System.out.print(c + ",");

			// Update the values of a and b for the next iteration
			a = b;
			b = c;
		}

		// Fibonacci sequence generation complete
		System.out.println("Fibonacci sequence generated successfully.");
		// Close the scanner to release system resources
		sc.close();
	}
}
