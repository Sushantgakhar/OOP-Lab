import java.util.*;
public class transpose
{
	public static void main(String args[])
	{
		int m;
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
			for(int j=0;j<m;j++)
				if(arr[i][j]!=arr[j][i])
				{
					flag=false;
					break;
				}
		if(flag)
			System.out.println("Symmetric");
		else
			System.out.println("Not Symmetric");
	}
}