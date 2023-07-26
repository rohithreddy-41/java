public class MethodDemo4 {
	
	// Method to update the value of an element in the array 'a' at the given 'index'
	static void update(int a[], int index, int value) {
		// Modify the value of the element in the array 'a' at the given 'index' to 'value'
		a[index] = value;	
		// Here, the 'update' method is taking a reference to the array 'a' from the 'main' method.
	}
	
	// Method 'm' to update the value of 'x' (int primitive type)
	static void m(int x, int value) {
		// Change the value of 'x' to 'value', but this change is local to the method and does not affect the 'main' method's 'x'.
		x = value;	
	}
	
	public static void main(String ar[]) {
		// Declare and initialize an integer array 'a' with values 1, 9, 3, 4, 5, 6
		int a[] = {1, 9, 3, 4, 5, 6};	
		// Call the 'update' method to modify the array 'a', setting the element at index 1 to 2
		update(a, 1, 2);	
		for (int x : a) {
				// Print the modified array 'a' after the 'update' method call
			System.out.print(x + " ");
		}

		// Declare and initialize an integer variable 'x' with the value 10
		int x = 10;		
		// Call the method 'm' with 'x' as an argument, attempting to change its value
		m(x, 20);		
		// Print the value of 'x' after the 'm' method call (It will still be 10; no change occurred).
		System.out.println("\nvalue of primitive " + x);  
	}
}
