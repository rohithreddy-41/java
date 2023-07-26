public class MethodDemo2 {

	// This is a static method named 'inc' that takes an integer 'x' as a parameter.
	static void inc(int x) {
		// Increment the value of 'x' by 1 (This change is local to the method).		
		x++;	
		// Print the value of 'x' after the increment operation.				
		System.out.println(x);	
	}
	
	public static void main(String ar[]) {
		// Declare and initialize an integer variable 'a' with the value 9.
		int a = 9;	
		// Call the method 'inc' and pass the value of 'a' (9) as an argument.			
		inc(a);	
		// Print the value of 'a' after the method call (It will still be 9).				
		System.out.println(a);	
	}
	
} 
