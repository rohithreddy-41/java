

public class ardelete {
	
	public static void main (String[] args) {
		int a[]={1,2,3,6,4,5};
		
		
		for(int i=4;i<=a.length-1;i++)
		{
			a[i-1]=a[i];
			}
			
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
				}
		
	}
}

