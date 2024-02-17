public class methodReverse{

	// Method to reverse a given integer
	static int rev(int n)
	{
		int r=0,x;
		while(n>0)
		{
			x=n%10;      // Extract the last digit of the number
			n=n/10;      // Remove the last digit from the number
			r=r*10+x;    // Append the extracted digit to the result in reverse order
		}
		// Return the reversed number
		return r;    
	}
	
	// Method to reverse an array of integers
	static void rev(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");   // Print the elements of the array in reverse order
		}
	}
	
	public static void main (String[] args) {
		System.out.println(rev(256));    // Test the integer reversal method
		int a[]={1,2,3,4,5};              // Create an array
		rev(a);                           // Test the array reversal method
	}
}
