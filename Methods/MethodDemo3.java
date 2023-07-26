public class MethodDemo3 {
	
	// Method to change the value of the first element in the array 'a'
	static void change(int a[]) {
		// Modify the value of the first element of the array 'a' to 1
		a[0] = 1;	
		// Here, the 'change' method receives a reference to the array from the 'main' method.
	}
	  
	public static void main(String ar[]) {
		// Declare and initialize an integer array 'a' with values 2, 3, 4, 5, 6
		int a[] = {2, 3, 4, 5, 6};	
		// Call the 'change' method and pass the array 'a' as an argument.
		change(a);		
			// Print the value of the first element of array 'a' after the method call (It will be modified to 1).
			System.out.println(a[0]);
	}			
		
}
