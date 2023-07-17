import java.util.*;

public class palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		// Initialize the variable to store the reversed number
		int rev = 0; 
		// Store the original number for comparison
		int m = n; 
		int r;
		
		// Reverse the number by extracting digits from right to left
		while (n > 0) {
			// Extract the last digit
			r = n % 10; 
			// Remove the last digit
			n = n / 10; 
			// Append the digit to the reversed number
			rev = rev * 10 + r; 
		}
		
		// Check if the number is a palindrome
		if (rev == m) {
			System.out.println("The number is a palindrome.");
		} else {
			System.out.println("The number is not a palindrome.");
		}
		
		sc.close(); // Close the scanner to release system resources
	}
}
