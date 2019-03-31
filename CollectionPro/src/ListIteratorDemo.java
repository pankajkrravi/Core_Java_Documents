import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Pankaj");
		l.add("kumar");
		l.add("Ravi");
		l.add("Dinga");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()){
			String s=(String)ltr.next();
			if(s.equals("kumar")){
				ltr.remove();
			}
			else if(s.equals("ravi"))
			{
				ltr.add("Kishan");
			}
			else if(s.equals("kumar")){
				ltr.set("karan");
			}
		}
		System.out.println(l);

	}

}
