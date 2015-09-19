import java.util.*;
public class digitNoRep
{
	public static void main(String args[])
	{
		int lim;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{	
			for(int j=0;j<5;j++)
			{
				for(int k=0;k<5;k++)
				{
					for(int l=0;l<5;l++)
					{
						if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l)
						{
							System.out.print(i+""+j+""+k+""+l);
							System.out.println();
						}
					}
				}
			}
		}
	}
}