import java.util.LinkedHashSet;
public class LinkedHashSets {
		public static void main(String[] args) {
			LinkedHashSet h=new LinkedHashSet();
			h.add("A");
			h.add("B");
			h.add("C");
			h.add("Z");
			System.out.println(h.add("Z"));//false
			System.out.println(h);
		}

	}
