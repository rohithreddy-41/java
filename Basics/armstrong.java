import java.util.*;

public class armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		// Store the original number for comparison
		int m = n;
		int sum = 0;
		int r;
		
		 // Calculate the sum of cubes of individual digits
		while (n > 0) {
			// Extract the last digit
			r = n % 10;
			// Remove the last digit
			n = n / 10; 
			// Cube the digit and add to the sum
			sum = sum + r * r * r; 
		}
		
		 // Check if the number is an Armstrong number
		if (m == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
		// Close the scanner to release system resource
		sc.close(); 
	}
}
