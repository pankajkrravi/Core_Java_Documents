import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Ennter your Choice [coffee / tea]");
  String type=s.nextLine();
  if(type .equalsIgnoreCase("coffee"))
  {
	  System.out.println("Latte");
	  System.out.println("capchheno");
  }else if(type .equalsIgnoreCase("tea")){
	  System.out.println("green tea");
	  System.out.println("lemon tee");
	  System.out.println("Ginger tee");
	  System.out.println("masala tee");
  }
  else{
	  System.out.println("wrong input");
  }
  }

}
