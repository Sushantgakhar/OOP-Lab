import java.util.*;
public class diagonalsum
{
	public static void main(String args[])
	{
		int m,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns");
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<m&&i<n;i++)
			sum+=arr[i][i];
		System.out.println("Sum: " +sum);
	}
}