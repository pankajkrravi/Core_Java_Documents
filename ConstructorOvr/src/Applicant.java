
public class Applicant {
       String name;
       int salary;
       boolean isMarried;
       public Applicant(){
    	   }
       public Applicant(String nm,int sal,boolean b){
    	   this.name=nm;
    	   this.salary=sal;
    	   this.isMarried=b;
       }
       public Applicant(String nm){
    	   this.name=nm;
       }
       public Applicant(int sal){
    	   this.salary=sal;
       }
       public Applicant(boolean b){
    	   this.isMarried=b;
       }
       public static void main(String[] args) {
    	   Applicant a1=new Applicant();
    	   System.out.println(a1);
    	   Applicant a2=new Applicant("pankaj",50000,false);
    	   System.out.println(a2.name+"  "+a2.salary+""+a2.isMarried);
    	   Applicant a3=new Applicant("niraj kumar");
    	   System.out.println(a3.name);
    	   Applicant a4=new Applicant(45000);
    	   System.out.println(a4.salary);
    	   Applicant a5=new Applicant(false);
    	   System.out.println(a5.isMarried);
	}
       
       
     }
