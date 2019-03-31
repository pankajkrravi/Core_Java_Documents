import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainRunnerStudent {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     ArrayList al=new ArrayList(5);
     while(true)
     {
    	 System.out.println("Enter the student info:");
    	 Student std=getStudent();
    	 al.add(std);
    	 System.out.println("du u have more student");
    	 String res=sc.next();
    	 if(res.equalsIgnoreCase("NO"))
    		 break;
     }
     System.out.println("<======RESULT SHEET=======>");
     for(Object obj: al)
     {
    	 System.out.println(obj);
     }
     System.out.println("---------------------------");
     Student hs=getHeighestPerStudent(al);
     System.out.println("Heighest percentage Student Infi:");
     System.out.println(hs);
	}
	private static Student getHeighestPerStudent(ArrayList stds)
	{
		Student hstd=(Student)stds.get(0);
		Iterator it=stds.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			Student st=(Student)obj;
			if(hstd.getPer()<st.getPer());
			hstd=st;
			
		}
		return hstd;
	}
	static Student getStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the id: ");
		int id=sc.nextInt();
		System.out.println("ente the four subject marks");
		int mrk[]=new int[4];
		for(int i=0;i<mrk.length;i++)
		{
			mrk[i]=sc.nextInt();
		}
		return new Student(name ,id, mrk);
	}
}
