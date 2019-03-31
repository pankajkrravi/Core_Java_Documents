import java.util.Random;

public class Button {
	Weapon click(){
		Random m= new Random();	
		System.out.println("Click Button");
		int x=m.nextInt(4);
		if(x==0){
			System.out.println();
			Bomb bn=new Bomb();
			bn.blast();
			return bn;
		}
		if(x==1){
			Gun g=new Gun();
			g.shoot();
			return g;
		}
		if(x==2){
			Knife k=new Knife();
			k.stab();
			return k;

		}
		else
		{
			BowAndArrow ba=new BowAndArrow();
			ba.hit();
			return ba;//else BowAndArrow ba=new BowAndArrow();
			//return ba;
		}
	}


}
