public class MethodDemo1{
	
	// This method takes two integers as input and returns the minimum of the two.
	int findMin(int x, int y) {
		if (x < y)
		// If 'x' is less than 'y', return 'x' as the minimum.
			return x; 
		else 
		// Otherwise, return 'y' as the minimum.
			return y; 
	}
	
	// The main method, where the program execution starts.
	public static void main(String arg[]) {
		// Declaring two integer variables 'a' and 'b' and initializing 'a' to 500 and 'b' to 10.
		int a = 500, b = 10; 
		 // Creating an object 'mp' of class 'MethodDemo' using the 'new' keyword.
		MethodDemo1 mp = new MethodDemo1();
		 // Calling the 'findMin' method of the 'MethodDemo' object 'mp' with 'a' and 'b' as arguments and printing the result.
		System.out.println(mp.findMin(a, b));
	}
}
