import java.util.Scanner;

public class Person1 {

	public static void main(String[] args)//calling method
	{
       System.out.println("Enter your age");
       Scanner sc=new Scanner(System.in);
       int age=sc.nextInt();
       boolean rs=checkEligiblity(age);//calling statement
       if(rs){
    	   System.out.println("You are eligible to vote");
       }
       else{
    	   System.out.println("You are not aligible to vote");
       }System.out.println("Thank you");
	}
      static boolean checkEligiblity(int x)
      {
    	  return x>=18;
      }
      }

