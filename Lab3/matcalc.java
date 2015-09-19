import java.util.*;
public class matcalc
{
	public static void main(String args[])
	{
		int m,n,k,l;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns for first matrix");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Enter no. of rows and columns for 2nd matrix");
		k=sc.nextInt();
		l=sc.nextInt();
		int arr[][]=new int[m][n];
		int arr2[][]=new int[k][l];
		System.out.println("Enter elements for first matrix");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		System.out.println("Enter elements for second matrix");
		for(int i=0;i<k;i++)
			for(int j=0;j<l;j++)
				arr2[i][j]=sc.nextInt();
		if(m!=k&&n!=l)
			System.out.println("Addition not possible");
		else
		{
			int sumarr[][]=new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					sumarr[i][j]=arr[i][j]+arr2[i][j];
			System.out.println("Sum");
			for(int i=0;i<m;i++)
			{	
				for(int j=0;j<n;j++)
				{
					System.out.print(sumarr[i][j]+" ");
				}
				System.out.println();
			}	
		}
		if(n==k)
		{
			int sumarr[][]=new int[m][l];	
			for(int i=0;i<m;i++)
			{	
				for(int j=0;j<l;j++)
				{
					sumarr[i][j]=0;
					for(int x=0;x<n;x++)
					{	
						
						sumarr[i][j]+=arr[i][x]*arr2[x][j];
					}
				}
			}
			System.out.println("Product");
			for(int i=0;i<m;i++)
			{	
				for(int j=0;j<l;j++)
				{
					System.out.print(sumarr[i][j]+" ");
				}
				System.out.println();
			}	
		}
		else
			System.out.println("Multiplication not possible");
				
	}
}