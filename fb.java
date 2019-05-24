import java.util.*;
public class fb
{ 	
	int a=0,b=1,c;
	void fib(int i) 
	{ 
		if(i>=1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fib(i-1);
		}
	} 
	public static void main (String args[]) 
	{ 
		fb f=new fb();
		f.fib(5);
	} 
} 