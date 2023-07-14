public class arrayincrement {
	
	public static void main(String[] args) {
		// Initialize an array 'a' with values 1, 2, 3, 4, 5, 6
		int a[] = {1, 2, 3, 4, 5, 6};
		
		// Initialize a new array 'b' with size 10
		int b[] = new int[10];
		
		// Initialize a new array 'n' with size 10
		int n[] = new int[10];
		
		System.out.println("a is " + a.length);
		
		// Copy elements from array 'a' to array 'b'
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// Assign array 'a' the reference to array 'b'
		a = b;
		
		// Assign array 'b' the reference to array 'n'
		b = n;
		
		// Print the elements of array 'a'
		for (int x : a) {
			System.out.print(x + ",");
		}
		
		System.out.print("\na is " + a.length);
	}
}
