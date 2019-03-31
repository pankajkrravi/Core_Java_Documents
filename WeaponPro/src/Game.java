
public class Game {

	public static void main(String[] args) {
		Button b=new Button();
		Weapon w=b.click();
		//if return value is gun-->shoot
		//if return value is bomb-->blast
		//if return value is knife-->stab
		if(w instanceof Gun){
			Gun g=(Gun)w;
			g.shoot();
			System.out.println("shoot.....");
		} 
		else if(w instanceof Bomb){
			Bomb bn=(Bomb)w;
			bn.blast();
			System.out.println("blast");

		}
		else if(w instanceof Knife){
			Knife k=(Knife)w;
			k.stab();
			System.out.println("stabed");
		}
		else{
			System.out.println("hited");
		}
	}

}
