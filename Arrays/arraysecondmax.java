public class arraysecondmax {
	
	public static void main(String[] args) {
		// Initialize an array 'a' with values 2, 6, 9, 4, 5, 1
		int a[] = {2, 6, 9, 4, 5, 1};
		
		int max1, max2;
		// Initialize max1 and max2 to the first element of the array 'a'
		max1 = max2 = a[0];
		
		// Find the second maximum element in the array
		for (int i = 0; i < a.length; i++) {
			 if (a[i] > max1) {
				// If the current element is greater than max1,
				// update max2 to max1 and max1 to the current element
				max2 = max1;
				max1 = a[i];
			}
		}
		
		System.out.println("Second max is " + max2);
	}
}
