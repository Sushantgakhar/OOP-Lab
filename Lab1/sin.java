import java.util.*;
public class sin
{
	public static void main(String args[])
	{
		int x,n;
		double flag=-1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		x=sc.nextInt();
		System.out.println("Enter limit");
		n=sc.nextInt();
		for(int i=3,j=1;i<=n;i+=2,j++)
		{
			flag=Math.pow(flag,j);
			sum+=(flag)*((Math.pow(x,i)/fact(i)));				
		}
		sum+=x;
		System.out.println(sum);
	}
	static int fact(int num)	
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
	return fact;
	}			
}
