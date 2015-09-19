import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int lim;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit: ");
		lim=sc.nextInt();
		for(int i=1;i<=lim;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(i);
			System.out.println();
		}
	}
}