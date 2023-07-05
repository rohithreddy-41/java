import java.util.*;
public class adding 
{
	
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0,i;
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is "+sum);
		sc.close();
	}
}

