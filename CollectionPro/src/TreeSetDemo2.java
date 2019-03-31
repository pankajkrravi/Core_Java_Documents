import java.util.TreeSet;
/*if we a depending  on diffault natural sorting order 
compelsory the object sould be homogenious and comparable
otherwise we will gwet reuntime exception saying classcast exception*/
/*an object is said toe comparable if and only if corresponding 
 * class implements comprable interface
 * String class and all Wraper already implement comparable inteface 
 * but String buffer class doesnt imlements conparable 
 * interface
 *             hence we got class cast exception in this example */

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));

	}

}
