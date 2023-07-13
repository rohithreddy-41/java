public class arraycopying {
	
	public static void main (String[] args) {
		// Initialize an array 'a' with values
		int a[]={2,3,4,5,6,7,8,9,10,11};
		
		// Create a new array 'b' with the same size as 'a'
		int b[]=new int[10];
		
		// Copy elements from 'a' to 'b'
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		// Print the elements of array 'b'
		for(int x:b) {
			System.out.print(x+",");
		}
	}
}
