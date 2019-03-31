
public class Duck {
	private int size;
	private static int  noofduck;
	int setSiz(){
		return size;
	}
	public void   getSize(int size){
		this.size=size;
	}
	Duck(){
		noofduck++;
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
		Duck d=new Duck();
		d.getSize(10);
		}
		System.out.println("size of duck :"+noofduck);
	}
}
