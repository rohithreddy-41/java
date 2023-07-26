public class MethodDemo {
	
	// This method takes two integers as input and returns the maximum of the two.
	static int findMax(int x, int y) {
		 
		if (x > y)
		 // If 'x' is greater than 'y', return 'x' as the maximum.
			return x;
		else
		// Otherwise, return 'y' as the maximum.
			return y; 
	}
	
	// The main method, where the program execution starts.
	public static void main(String args[]) {
		// Declaring three integer variables 'a', 'b', and 'c' and initializing 'a' to 30 and 'b' to 20.
		int a = 30, b = 20, c; 
		 // Calling the 'findMax' method with 'a' and 'b' as arguments and storing the result in 'c'.
		c = findMax(a, b);
		// Printing the value of 'c', which represents the maximum of 'a' and 'b'.
		System.out.println(c); 
	}
}
