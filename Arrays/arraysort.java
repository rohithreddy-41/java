public class arraysort {
	
	public static void main (String[] args) {
		// Initialize a String array 'a' with values
		String a[] = {"rohith", "reddy", "sai", "kumar", "bunny", "vinny", "chinni"};
		
		// Sort the array using the Arrays.sort() method from the java.util package
		java.util.Arrays.sort(a);
		
		// Print the sorted elements of array 'a'
		for (String x : a) {
			System.out.println(x);
		}
	}
}
