
public class Tes1t {
	public static void main(String[] args) {
		Student <Integer ,String ,Double> st=new Student<Integer ,String ,Double>(123,"Ramu",87.25);
		Student<String ,String ,Double> st1=new Student<String,String,Double>("TUY123","Raja",70.54);
		Student st2=new Student(123,"Pankaj",56.58);
		//System.out.println(Student.st);
		System.out.println(st1);
		System.out.println(st2);
	}

}
