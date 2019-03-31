
public class Employee {
	int id;
	String  name;
	double salary;
	public Employee(String name,int id,double salary){
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) {
		Employee e=new Employee("pankaj",550,8751.56);
		System.out.println(e);
	}
   public String toString(){
	   return name+" "+id+" "+salary;
	}
}
