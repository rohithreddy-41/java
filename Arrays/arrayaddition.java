
public class arradd {
	
	public static void main (String[] args) {
		int a[][]={{2,3,4},{1,2,3},{3,4,5}};
		int b[][]={{1,2,3},{3,4,5},{2,4,5}};
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=b[i][j]+a[i][j];
				}
			}
		
		for(int x[]:c)
		{
			for(int y:x)
			{
				
				System.out.print(y+" ");
				
				
				}
				System.out.println("");
			}
			
		
	}
	
}

