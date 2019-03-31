
public class Test {
	public static void main(String[] args) {
		Website w=new Website();
		Gift g=w.registerAndTakeGift();
		if(g instanceof Chocolate){
			Chocolate c=(Chocolate)g;
			//c.eat():
			System.out.println("eat");	
		}
		else if(g instanceof Perfume){
			
			System.out.println("spray perfume");
		}
		else{
			System.out.println("make a call");
		}
	}
}
