import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Scanner;

public class MainRunner2 {

	
		static Scanner sc= new Scanner(System.in);
		static Book readBook()
		{
			
			System.out.println(" Enter id name and price of Book");
			return new Book(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		
		static Pen readPen()
		{
			System.out.println(" Enter id ,price and color of Pen");
			return new Pen(sc.nextInt(),sc.nextDouble(),sc.next());
		}
		
	public static void main(String[] args) 
	{
		
		
		LinkedList ls= new LinkedList();
		while(true)
		{
			System.out.println("1.Book \n 2.Pen \n 3.display ");
			System.out.println(" Enter your choic: ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:  bookOperation(ls);
						break;
				
			case 2:  PenOperation(ls);
						break;
			case 3: Iterator it= ls.iterator();
						while(it.hasNext())
						{
							System.out.println(it.next());
						}
			}
			
			
			
			System.out.println(" do you want to continue: ");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
				break;
			
		}

	}

	private static void PenOperation(LinkedList ls) 
	{
		System.out.println("1.addPen \n 2.deletePen \n 3.displayPen");
		System.out.println(" Enter your choice ");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println(" enter the Pen info");
				ls.add(readPen());
					break;
		case 2: System.out.println(" enter the Pen id delete: ");
				  int id= sc.nextInt();
				  int find=0;
				  for (Object obj : ls)
				  {
					if(obj instanceof Pen)
					{
						Pen b=(Pen)obj;
						if(b.pid==id)
						{
							ls.remove(b);
							System.out.println(" successfully deleted");
							find=1;
							break;
						}
					}
				  }
			    if(find==0)
			    	System.out.println(" this Pen id Pen is not present");
			    break;
			
		case 3:	System.out.println(" enter the Pen id to dispaly: ");
					   id= sc.nextInt();
					    find=0;
					  for (Object obj : ls)
					  {
						if(obj instanceof Pen)
						{
							Pen b=(Pen)obj;
							if(b.pid==id)
							{
								System.out.println(b);
								System.out.println(" successfully dispalyed");
								find=1;
								break;
							}
						}
					  }
				  if(find==0)
				  	System.out.println(" this Pen id Pen is not present");
				  break;
		}
		
	}

	private static void bookOperation(LinkedList ls) 
	{
		System.out.println("1.addBook \n 2.delete book \n 3.display book");
		System.out.println(" Enter your choice ");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println(" enter the book info");
				ls.add(readBook());
					break;
		case 2: System.out.println(" enter the book id delete: ");
				  int id= sc.nextInt();
				  int find=0;
				  for (Object obj : ls)
				  {
					if(obj instanceof Book)
					{
						Book b=(Book)obj;
						if(b.bid==id)
						{
							ls.remove(b);
							System.out.println(" successfully deleted");
							find=1;
							break;
						}
					}
				  }
			    if(find==0)
			    	System.out.println(" this book id book io not present");
			    break;
			
		case 3:	System.out.println(" enter the book id to dispaly: ");
					   id= sc.nextInt();
					    find=0;
					  for (Object obj : ls)
					  {
						if(obj instanceof Book)
						{
							Book b=(Book)obj;
							if(b.bid==id)
							{
								System.out.println(b);
								System.out.println(" successfully dispalyed");
								find=1;
								break;
							}
						}
					  }
				  if(find==0)
				  	System.out.println(" this book id book is not present");
				  break;
		}
	}

	}

