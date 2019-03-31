import java.util.Scanner;

public class VendingMachine {
	Beverage give(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice[1-coffee;2-tea;3-milk");
		int choice=scan.nextInt();
		if(choice==1){
			Coffee c=new Coffee();
			System.out.println(c.type);
			return c;
		}
		if(choice==2){
			Tea t=new Tea();
			System.out.println(t.type);
			return t;
		}
		if(choice==3){
			Milk m=new Milk();
			System.out.println(m.type);
			return m;

		}
		return null;

	}
}