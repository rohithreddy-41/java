import java.util.*;

public class reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		// Initialize the variable to store the reversed number
		int rev = 0; 
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
		
		System.out.println("The reversed number is: " + rev);
		// Close the scanner to release system resources
		sc.close(); 
	}
}
