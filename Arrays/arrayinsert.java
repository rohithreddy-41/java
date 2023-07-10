


public class arinsert {
	
	public static void main (String[] args) {
		int a[]=new int[10];
		a[0]=2;a[1]=3;a[2]=5;a[3]=6;a[4]=7;
		int n=5;
		int t=4;
		int index=2;
		for(int i=n;i>index;i--)
		{
			a[i]=a[i-1];
			}
			a[index]=t;
			for(int i=0;i<=n;i++)
			{
				System.out.print(a[i]+",");
				}
		
	}
}

