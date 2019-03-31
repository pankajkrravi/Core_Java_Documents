

public class Student {
	void take()
	{
		Teacher t=new Teacher();
		QuestionPaper q=t.give();
		q.contact=87145129876l;
		q.studentName="Pankaj kumar";
		q.rollNum=65;
		System.out.println("Sname" +":"+q.studentName);
		System.out.println("Scontact"+":"+q.contact);
		System.out.println("Srollnum"+":"+q.rollNum);
		System.out.println("Subject"+":"+q.Sub+"   "+"Institute"+":"+q.instName);


	}
}
