
public class LinkedList {
	Node head;
	class Node
	{
		int data;
		Node link;
	}
	void insert(int n)
	{
		if(head==null)
		{
			Node b=new Node();
			b.data=n;
			b.link=null;
			head=b;
		}
		else
		{
			Node c=head;
			while(c.link!=null)
			{
				c=c.link;
			}
			Node d=new Node();
			d.data=n;
			d.link=null;
			c.link=d;
		}
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.link==null)
			{
				System.out.print(temp.data);

			}else
			{
				System.out.print(temp.data+"->");
			}
			temp=temp.link;
		}
	}
	void reverse()
	{
		Node a=head,b=null,c;
		while(a!=null)
		{
			c=b;
			b=a;
			a=a.link;
			b.link=c;
		}
		head=b;
		Node e=head;
		while(e!=null)
		{
			if(e.link==null)
			{
				System.out.print(e.data);
			}
			else
			{
				System.out.print(e.data+"<-");
			
		}e=e.link;
		}
	}
	public static void main(String args[])
	{
		LinkedList a=new LinkedList();
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.insert(50);
		a.display();
		System.out.println();
		a.reverse();
		a.display();
	}
}
