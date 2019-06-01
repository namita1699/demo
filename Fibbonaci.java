import java.util.*;

public class Fibbonaci
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,n;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n1+"\n");
		}
		
		
	}
}
//time complexity O(n)
