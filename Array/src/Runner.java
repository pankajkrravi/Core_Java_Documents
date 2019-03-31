
public class Runner {

	public static void main(String[] args) {
		ArrayOeration ao=new ArrayOeration();
		int ar[]={10,20,50,6032};
		System.out.println("before delete");
		ao.dispArray(ar);
		if(ar==null){
			System.out.println("delete filed :");
			return;
		}
		System.out.println("after delete: ");
	}

}

