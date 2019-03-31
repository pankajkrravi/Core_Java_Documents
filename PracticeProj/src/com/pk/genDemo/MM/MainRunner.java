package com.pk.genDemo.MM;
public class MainRunner {
		public static void main(String[] args) {
			System.out.println("M M S");
			Sample s1=new Sample();
			Sample s2=new Sample();
			Sample.display();
			s2.x=45;
			Sample.y=400;
			System.out.println(s1.x);
			System.out.println(s2.x);
			System.out.println(Sample.y);
			Sample.display();
			Sample.display();
			System.out.println(Sample.w);
			
		}
	}


