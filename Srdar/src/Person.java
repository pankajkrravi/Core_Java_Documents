
public class Person {
	String personName="Sardar";
	void giveBiscuit(){
		Biscuit b=new Biscuit();
		Dog d=new Dog();
		d.eat(b);
		System.out.println(this.personName+"gives"+b.brand+" ");
	}
}
