import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("Z");
		System.out.println(h.add("Z"));//false
		System.out.println(h);
	}

}
