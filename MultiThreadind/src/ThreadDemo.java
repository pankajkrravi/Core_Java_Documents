class ThreadDemo{
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.run();
		//mt.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread ");
		}
	}
}

