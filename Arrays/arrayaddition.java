public class arrayaddition {
	
	public static void main (String[] args) {
		int a[][]={{2,3,4},{1,2,3},{3,4,9}};
		int b[][]={{1,2,3},{3,4,5},{2,4,5}};
		int c[][]=new int[3][3];
		
		 // Iterate over the rows of the arrays 'a' and 'b'
		for(int i=0;i<a.length;i++)
		{
			// Iterate over the columns of the arrays 'a' and 'b'
			for(int j=0;j<a[0].length;j++)
			{
				// Add the corresponding elements of 'a' and 'b' and store the result in 'c'
				c[i][j]=b[i][j]+a[i][j];
			}
		}
		
		// Iterate over the rows of the array 'c'
		for(int x[]:c)
		{
			// Iterate over the columns of each row of 'c'
			for(int y:x)
			{
				// Print the element at the current position of 'c'
				System.out.print(y+" ");
			}
			// Move to the next line after printing all elements in a row
			System.out.println("");
		}
	}
}
