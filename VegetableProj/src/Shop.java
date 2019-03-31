import java.util.Scanner;

public class Shop {
	Vegetable shell(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1.chilly/2.Potato/3.Carrot");
		String choice =sc.next();
		if(choice.equalsIgnoreCase("chilly")){
			Chilly c=new Chilly();
			return c;
		}
		else  if(choice.equalsIgnoreCase("Potato")){
			Potato p=new Potato();
			return p;
		}
		else if(choice.equalsIgnoreCase("Carrot")){
			Carrot ct=new Carrot();
			return ct;
		}
		else{
			return null;

		}
	}
}
