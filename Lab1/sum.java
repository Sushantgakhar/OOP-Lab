import java.util.*;
public class sum
{
	public static void main(String args[])
	{
		double sum=0,x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		x=sc.nextInt();
		System.out.println("Enter limit");
		n=sc.nextInt();
		for(double i=1;i<=n;i++)
		{
			sum+=(Math.pow((1/i),i));				
		}
		System.out.println(sum);
	}
}
