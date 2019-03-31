import java.util.LinkedList;
import java.util.Scanner;

public class MainRunner {
	static Scanner sc=new Scanner(System.in);
	static   Book readBook()
	{
		Scanner sc=new Scanner(System.in) ; 
		System.out.println("enter id anme and price of book");
		return new Book();
	}
	static   readPen()
	{
		System.out.println("enter id anme and price of pen");
		return new Book();
	}
	public static void main(String[] args) {
		
		LinkedList ls=new LinkedList();
		while(true)
		{
			System.out.println("1.Book/n 2.pen /n 3. display");
			System.out.println("enter your choise");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: bookPoeration(ls);
			break;


			case 2: penOperation(ls);
			break;
			case 3:  


			}
		}
	}
}
