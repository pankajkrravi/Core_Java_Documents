public class MyArraylist {
	private Object obj[];
	int cc,index=-1;
	public MyArraylist() {
		cc=10;
		obj=new Object[cc];
	}
	MyArraylist(int sc) {
		cc=sc;
		obj=new Object[cc];
	}
	boolean add(Object ob)
	{
		if(index<cc)
		{
			obj[++index]=ob;
			return true;
		}
		else 
		{
			cc=cc*3/2+1;
			Object no[]=new Object[cc];
			for(int i=0;i<=index;i++)
			{
				no[i]=obj[i];
			}
			obj=no;
			obj[++index]=ob;
		}
		return true;
	}
}
