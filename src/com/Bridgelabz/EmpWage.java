package com.Bridgelabz;

public class EmpWage {
	public static final int isparttime=1;
	public static final int isfulltime=2;
	public static final int emprateperhour=20;
	public static final int numofworkingdays=2;
	public static final int maxhrsinmonth=10;
	public static void CalwageTotalmonth()
	{
		int empHrs=0;
		int totalempHrs=0;
		int totalworkingdays=0;
		
		while(totalempHrs<=maxhrsinmonth && totalworkingdays <numofworkingdays) {
			totalworkingdays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case isparttime:
				empHrs=4;
				break;
			case isfulltime:
				empHrs=8;
				break;
				default:
					empHrs=0;
			}
			totalempHrs+=empHrs;
			System.out.println("day"+ totalworkingdays+"emp hr"+empHrs);
		
		}
		int totalEmpWage=totalempHrs*emprateperhour;
		System.out.println("total empwage"+totalEmpWage);
	}

	public static void main(String[] args) {
		CalwageTotalmonth();
}
}