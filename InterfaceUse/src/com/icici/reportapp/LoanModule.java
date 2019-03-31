package com.icici.reportapp;

public class LoanModule {

	public static void main(String[] args) {
		//program to an interface
		IReport report=ReporterFactory.getInstance();
			report.genReport();//consuming service
		}
	}
