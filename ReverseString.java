import java.util.*;

public class ReverseString
{
	public static void main(String args[])
	{
		String str="Sky is Blue";
		String b[]=str.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+ " ");
		}
		
	}
}