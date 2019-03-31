
public class CpuImpl implements  IMouse {
	public void click(){
		System.out.println("heighlight app");
	}

	@Override
	public void rightclick() {
		System.out.println("show option");
	}

	@Override
	public void doubleclick() {
		System.out.println("open app");
	}
}


