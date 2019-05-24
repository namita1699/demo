import java.util.*;
public class rs
{
	public static void main(String args[])
	{
		String str=" Sky  is  Blue ";
		char[] a=str.toCharArray();
		for (int i=a.length-1;i>=0;i--)
		{
			if(a[i]==' ')
			{
				for(int j=i+1;j<a.length;j++)
				{
				
					if(a[j]==' ')
					{
						break;
					}
					else
					{
						System.out.print(a[j]);
					}
				}
			}
		}
	}
}