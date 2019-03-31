
public class Test {

	public static void main(String[] args) {
		IMouse m =new CpuImpl();//upcasting to an interface[upcasting]
		m.click();        //consumer services
		m.doubleclick();   
		m.rightclick();
	}

}
