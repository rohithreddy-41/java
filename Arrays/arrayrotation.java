public class arrayrotation {
	
	public static void main(String[] args) {
		// Initialize an array 'a' with values 1, 2, 3, 4, 5, 6, 7, 8, 9
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// Store the first element of the array in a variable 't'
		int t = a[0];
		
		// Perform rotation by shifting elements to the left
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		
		// Assign the value of 't' to the last element of the array
		a[a.length - 1] = t;
		
		// Print the elements of the rotated array 'a'
		for (int x : a) {
			System.out.print(x + ",");
		}
	}
}
