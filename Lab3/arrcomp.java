import java.util.*;
public class arrcomp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10],small,large;
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		small=large=arr[0];
		for(int i=0;i<10;i++)
		{
			if(arr[i]<small)
				small=arr[i];
			if(arr[i]>large)
				large=arr[i];
		}
		System.out.println("Smallest Number: "+small);
		System.out.println("Largest Number: "+large);
	}
}