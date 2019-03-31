import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
         LinkedList ls=new LinkedList();
         ls.add("Pankaj");
         ls.add(20);
         ls.add(null);
         ls.add("pankaj");//[Pankaj,20,null,,Pankaj]
         ls.set(0, "Kumar");//[kumar,20,null,,Pankaj]
         ls.add(0, "Ravi");//[Ravi,20,null,,Pankaj]
         ls.removeLast();//[Pankaj,20,null]
         ls.addFirst("Dinga");//[Dinga,20,null,,Pankaj]
         System.out.println(ls);//[Dinga, Ravi, Kumar, 20, null]
	}

}
