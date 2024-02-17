


public class maxmethod {
	
	static int largest(int a[])
	{ 
		
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>temp)
			temp=a[i];
			
			
			}
			return temp;
			
			
		}
		
	public static void main (String[] args) {
		int a[]={3,6,4,2,9,20,25};
		System.out.println(largest(a));
		
		
		
	}
}

