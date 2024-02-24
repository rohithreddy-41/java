public class primepar {
	
	// Function to check if a number is prime
	static boolean prime(int n) {
		// Iterate from 2 to n/2 to check for factors
		for (int i = 2; i < n / 2; i++) {
			// If n is divisible by i, it is not prime
			if (n % i == 0)
				return false;
		}
		// If no factors found, n is prime
		return true;
	}
	
	// Main method
	public static void main(String[] args) {
		// Check if 23 is prime and print the result
		System.out.println(prime(23));
	}
}
