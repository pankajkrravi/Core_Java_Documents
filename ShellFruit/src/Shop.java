
public class Shop {
	Fruit shell(){
		Fruit f=new Fruit();
		f.type="Mango";
		f.price=120;
		System.out.println("Shop sells fruit");
		System.out.println(f.price +"   "+f.type);
		System.out.println();
		return f;
	}
}
