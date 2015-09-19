import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		int n,m,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");
		n=sc.nextInt();
		System.out.println("Enter upper limit");
		m=sc.nextInt();
		System.out.print("Prime numbers: ");
		for(int i=n;i<=m;i++)
		{
			flag=0;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
				if(i!=1&&flag==0)
					System.out.print(i+" ");
		}
	}
}
