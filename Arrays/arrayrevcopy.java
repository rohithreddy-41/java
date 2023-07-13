public class arrayrevcopy {
	
	public static void main (String[] args) {
		// Initialize an array 'a' with values 1 to 10
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		// Create a new array 'b' with the same size as 'a'
		int b[]=new int[10];
		
		// Declare variables 'i' and 'j' for iteration
		int i,j;
		
		// Loop through the elements of 'a' in reverse order and copy them to 'b'
		for(i=a.length-1,j=0;i>=0;i--,j++) {
			b[j]=a[i];
		}
		
		// Print the elements of array 'b'
		for(int x:b) {
			System.out.print(x+",");
		}
	}
}
