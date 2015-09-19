import java.util.*;
public class area
{
	public static void main(String args[])
	{
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Breadth: ");
		b=sc.nextInt();
		System.out.println("Enter Length ");
		l=sc.nextInt();
		System.out.println("Area : "+l*b);
		System.out.println("Circumference : "+2*(l+b));
	}
}