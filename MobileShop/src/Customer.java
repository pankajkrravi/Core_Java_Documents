
public class Customer {
	public static void main(String[] args) {
		Shop s=new Shop();
		Mobile mb=s.sell();
		System.out.println(mb.brand+"    "+mb.price);
	}
}
