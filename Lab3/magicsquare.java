import java.util.*;
public class magicsquare
{
	public static void main(String args[])
	{
		int m,sum=0,sum1=0,sum2=0;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns");
		m=sc.nextInt();
		int arr[][]=new int[m][m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<m;i++)
			sum+=arr[0][i];
		for(int i=0;i<m;i++)
		{	
			for(int j=0;j<m;j++)
			{
				sum1+=arr[i][j];
			}
			if(sum1!=sum)
				flag=false;
			sum1=0;
		}
		sum1=0;
		for(int i=0;i<m;i++)
		{	
			for(int j=0;j<m;j++)
			{
				sum1+=arr[j][i];
			}
			if(sum1!=sum)
				flag=false;
			sum1=0;
		}
		sum1=0;
		for(int i=0;i<m;i++)
		{
			sum1+=arr[i][i];
			sum2+=arr[i][m-1-i];
		}
		if(sum1!=sum||sum2!=sum)
			flag=false;
		if(flag)
			System.out.println("Magic Square");
		else
			System.out.println("Not Magic Square");
	}
}