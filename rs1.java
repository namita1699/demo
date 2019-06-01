import java.util.*;
public class rs1
{
	static void reverse(char[] c,int i,int j)
	{
		//reverses the letters in array c between start and last
		while(i<=j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
	}
	public static String rvstring(String s)
	{
		char[] c=s.toCharArray();
		reverse(c,0,s.length()-1);
		int i=0,j;
		for(j=0;j<c.length;j++)
		{
			if(j==c.length-1)
			{
				reverse(c,i,j);
			}
			if(c[j]==' ')
			{
				reverse(c,i,j-1);
				i=j+1;
			}
		}
		return new String(c);	
	}
	public static void main(String args[])
	{
		System.out.println(rvstring("Sky is blue"));
	}
}

//time complexity O(n)


