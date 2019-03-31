public class InstanceVariableDemo{
	public String str1;
		private String str2;
		public InstanceVariableDemo (String empName){
		str1 = empName;
	}
	public void salary(String empSal){
		str2 = empSal;
	}
    public void disp(){
    System.out.println( str1 );
    System.out.println( str2 );
	}
	public static void main(String args[]){
		InstanceVariableDemo obj = new InstanceVariableDemo("This is an instance variable and is visible to all child classes");
		obj.salary("The variable str2 is visible only inside methodOne");
		obj.disp();
	}
}