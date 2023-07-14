public class arraysecondmin {
	
	public static void main(String[] args) {
		// Initialize an array 'a' with values 5, 6, 7, 2, 1, 3
		int a[] = {5, 6, 7, 2, 1, 3};
		
		// Initialize variables min1 and min2 to the first element of the array 'a'
		int min1 = a[0];
		int min2 = a[0];
		
		// Find the second minimum element in the array
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min1) {
				// If the current element is less than min1,
				// update min2 to min1 and min1 to the current element
				min2 = min1;
				min1 = a[i];
			}
		}
		
		System.out.println(min2);
	}
}
