public class arrjagged {
	
	public static void main (String[] args) {
		int a[][];
		a=new int[3][];
		a[0]=new int[5];
		a[1]=new int[8];
		a[2]=new int[3];
		
		// Create a jagged array 'a' with different lengths for each row
		// Row 0 has 5 columns
		// Row 1 has 8 columns
		// Row 2 has 3 columns
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				// Print the element at the current position
				System.out.print(a[i][j]+" ");
			}
			// Move to the next line after printing all elements in a row
			System.out.println("");
		}
	}
}
