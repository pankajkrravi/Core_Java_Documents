
public class Main {

	public static void main(String[] args) {
		InStack s=new InStack();
		if(s.isFull()){
			s.push(2);
			s.push(4);
			s.push(6);
			s.push(9);
		}
		System.out.println(s.pop());
	}
}
