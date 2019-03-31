package com.icici.reportapp;

import java.util.Scanner;
//factory class
public class ReporterFactory {
	//factory method
	public static IReport getInstance(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter type of report [excel| pdf| browser");
		String type=scan.next();
		if(type.equalsIgnoreCase("pdf")){
			PdfReporter pr=new PdfReporter();
			return pr;
		}
		else if(type.equalsIgnoreCase("browser")){
			BrowserReporter br=new BrowserReporter();
			return br;
		}
		else if(type.equalsIgnoreCase("excel")){
			ExcelReporter er=new ExcelReporter();
			return er;
		}
		else {
			return  null;
		}
	}
}

