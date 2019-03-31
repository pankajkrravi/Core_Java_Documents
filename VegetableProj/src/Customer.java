
public class Customer {

	public static void main(String[] args) {
		Shop s=new Shop();
		Vegetable v=s.shell();
		if(v!=null){
			v.prepare();
		
		}else{
			System.out.println("wrong input");
		}
	}

}
