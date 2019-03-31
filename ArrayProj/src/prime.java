import java.util.Scanner;

public class prime {
  public static void main(String args[])
  {
	  int i,count=0;
	  System.out.println("\n enter any number");
	  Scanner sc= new Scanner(System.in);
	  int num= sc.nextInt();
	  i=num;
	  while(i>0)
	  {
		 if(num%i==0) 
		 {
			 count ++;
		 }
	     i--;
	  }
      if(count==2)
      {
    	  System.out.println("\n The number is prime  " + num);
    	  
      }
      else
      {
    	  System.out.println("\n the number is not prime  " + num);
      }
  }
}
