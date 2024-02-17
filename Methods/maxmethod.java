public class maxmethod{
	
	// Method to find the largest element in an array
	static int largest(int a[])
	{ 
		// Assume the first element is the largest
		int temp=a[0];
		// Loop through the array
		for(int i=0;i<a.length;i++)
		{
			// If current element is greater than the assumed largest element, update the assumed largest
			if(a[i]>temp)
				temp=a[i];
		}
		// Return the largest element found
		return temp;
	}
		
	public static void main (String[] args) {
		// Array of integers
		int a[]={3,6,4,2,9,20,25};
		// Print the largest element using the largest method
		System.out.println(largest(a));
	}
}
