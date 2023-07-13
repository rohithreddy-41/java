import java.util.*;

public class arraysearch {
	
	public static void main (String[] args) {
		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// Initialize an array 'a' with values
		int a[] = {3, 4, 5, 6, 7, 8, 9};
		
		// Prompt the user to enter a key
		System.out.println("Enter the key");
		
		// Read the user input as the key to search for
		int k = sc.nextInt();
		
		// Loop through the elements of 'a' to search for the key
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				// If the key is found, print the index and exit the program
				System.out.println("Index is " + i);
				System.exit(0);
			}
		}
		
		// If the loop completes without finding the key, print "Invalid"
		System.out.println("Invalid");
		
		// Close the Scanner object
		sc.close();
	}
}
