import java.util.*;

public class factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		// Initialize factorial variable to 1
		long fact = 1; 
		
		// Calculate the factorial of the given number
		for (int i = 1; i <= n; i++) {
			// Multiply factorial by each number from 1 to n
			fact = fact * i; 
		}
		
		System.out.println("The factorial of " + n + " is " + fact);
		// Close the scanner to release system resources
		sc.close(); 
	}
}
