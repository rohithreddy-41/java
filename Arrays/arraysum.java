public class arraysum {
	
	public static void main (String[] args) {
		// Initialize an array 'a' with values
		int a[]={3,4,5,6,7,8,9,2,0};
		
		// Initialize a variable 'sum' to hold the sum of array elements
		int sum=0;
		
		// Loop through the elements of 'a' and calculate the sum
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		// Print the calculated sum
		System.out.println("sum is "+sum);
	}
}
