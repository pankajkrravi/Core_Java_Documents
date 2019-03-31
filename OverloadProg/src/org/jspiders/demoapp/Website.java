package org.jspiders.demoapp;

public class Website{
	void login(String un,String pwd)
	{
	}
	void login(long mobNum,int otp){

	}
	public static void main(String []args){
		Website w=new Website();
		w.login(8712916210l, 2145);
		w.login("Pankaj", "214j4");
		System.out.println();
	}
}
