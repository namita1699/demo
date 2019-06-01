import java.util.*;
public class target
{
	 public boolean target1(int[] a,int tar)
	{
		boolean l=false;
		int rs;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1;j++)
			{
				rs=a[i]+a[j];
				if(rs==tar)
				{
					l=true;
					break;
				}	
			}
			if(l)
			{
				break;
			}
		}
		return l;	
	}
	public static void main(String args[])
	{
	    System.out.println("Enter Target");
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a[]={4,2,3,5,1};
		target t1=new target();
		boolean x=t1.target1(a,t);
		if(x==true)
		{
			System.out.println("true");
		}
		if(x==false)
		{
			System.out.println("false");
		}
		
	}
}

//time complexity O(n)