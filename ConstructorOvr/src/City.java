
public class City {
	int pinCode;
	String name;
	public City (){
	}
	public City (int pc, String nm){
		this.pinCode=pc;
		this.name=nm;
	}
	public City (int pc){
		this.pinCode=pc;
	}
	public City (String nm){
		this.name=nm;
	}
	public static void main(String[] args) {
		City c1=new City();
		System.out.println(c1);
		City c2=new City(854318,"bangalore");
		System.out.println(c2.pinCode+" "+c2.name);
		City c3=new City(854318);
		System.out.println(c3.pinCode);
		City c4=new City("bangalore");
			System.out.println(c4.name);
		
	}
}