
public class BusConductor {
	Ticket issue(){
		Ticket t=new Ticket();
		t.date="20/12/2017";
		t.place="Bangalore";
		t.price=20;
		System.out.println(t.date);
		System.out.println(t.place);
		System.out.println(t.price);
		return t;

	}
}
