
public class Student {
	int rollno;
	String sname,branch;
    public Student(int rollno,String sname,String branch){
    this.rollno=rollno;
    this.sname=sname;
    this.branch=branch;
    
    }
	public static void main(String[] args) {
		Student s=new Student(205, "  Pankaj  ", "CSE");
	System.out.println(s);
	}
	public String toString()
	{
		return rollno+""+sname+""+branch;
	}

}
