import java.util.Random;

public class Website {
	Gift registerAndTakeGift(){
		Random r=new Random();
		int x=r.nextInt(3);
		if(x==0){
			Mobile m=new Mobile(); 
			return m;
		}
		else if(x==1){
			Perfume p=new Perfume();
			return p;
		}
		else{
			Chocolate c=new Chocolate();
			return c;
		}
	}
}
