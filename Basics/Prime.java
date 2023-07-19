import java.util.*;

public class Prime {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Read an integer from the user
        int n = sc.nextInt();
         
        // Initialize a counter variable to count the factors of 'n'
        int count = 0;
        
         // Iterate from 1 to 'n' to check for factors
        for (int i = 1; i <= n; i++) {
             // Check if 'n' is divisible evenly by 'i'
            if (n % i == 0) {
			// Increment the counter if 'i' is a factor of 'n'
                count++;  
            }
        }
        
        // Check if 'n' has exactly 2 factors (1 and itself)
        if (count == 2) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
