import java.util.*;
public class list1
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data =d;
			next=null;
			prev=null;
		}
	}	
	public void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.prev;
		}
	}
	public static void main(String args[])
	{
		list1 l=new list1();
		Node f=new Node(1);// create 3 nodes
		Node s=new Node(2);
		Node t=new Node(3);
		
		l.head=t;//assign start to travese the node
		//l.head.next=null;
		t.prev=s;//links between the node
		s.prev=f;
		f.prev=null;
		l.print();		
	}
}