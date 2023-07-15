public class arraymultiplication {
	
	public static void main (String[] args) {
		int a[][]={{2,3,4},{1,2,3},{3,4,5}};
		int b[][]={{1,0,0},{0,1,0},{0,0,1}};
		int c[][]=new int[3][3];
		
		// Iterate over the rows of the array 'a'
		for(int i=0;i<3;i++)
		{
			// Iterate over the columns of the array 'b'
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				
				// Perform matrix multiplication of 'a' and 'b'
				for(int k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
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
