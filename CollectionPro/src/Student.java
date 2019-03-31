
public class Student {
    private String name;
    private int id;
    private int m[];
    private double per;
    public Student(String name,int id,int[] m){
    	this.name=name;
    	this.id=id;
    	this.m=m;
    	per=calcuPer(m);
    }
    public double getPer()
    
    {
    	return per;
    }
    public double calcuPer(int m[])
    {
    	double total=0;
    for(int i=0;i<m.length;i++)
    {
      total=total+m[i];
    }
    return total/m.length;
    }
    public String getResult(){
    for(int i=0;i<m.length;i++){
    	if(m[i]<35)
    		return "FAIL";
}
    if(per>=85)
    	return "DESTINCTION";
    else if(per>=60)
    	return"FIRST CLASS";
    else if(per>=50)
    	return "SECONFD CLASS";
    else 
    	return "PASS";
    }
    public String toString()
    {
    	String st="["+id+", "+name+" ,";
    	for(int i=0;i<m.length;i++)
    	{
    		st=st+m[i]+",";
    	}
    	st=st+per+","+getResult()+"]";
    	return st;
    }
}