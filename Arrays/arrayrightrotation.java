public class arrayrightrotation {
	
	public static void main(String[] args) {
		// Initialize an array 'a' with values 1, 2, 3, 4, 5, 6, 7
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		
		// Store the last element of the array in a variable 't'
		int t = a[a.length - 1];
		
		// Perform right rotation by shifting elements to the right
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		
		// Assign the value of 't' to the first element of the array
		a[0] = t;
		
		// Print the elements of the right-rotated array 'a'
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
}
