
public class Shop {
	Product[] shell(){
		Product p1=new Product();
		Product p2= new Product();
		Product p3= new Product();
		Product[] parr={p1,p2,p3};
		p1.type="Apple";
		p2.type="Mango";
		p3.type="Banana";
		p1.price=20;
		p2.price=23;
		p3.price=40;
		System.out.println(p1.price);
		return parr;
	}
}
