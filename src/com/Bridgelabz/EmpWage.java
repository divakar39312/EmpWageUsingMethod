package com.Bridgelabz;

public class EmpWage {
	public static void Parttimewage()
	{
		int isfulltime=1;
		int empRatePerHour=20;
		int empHrs=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==isfulltime)
			empHrs=8;
		else
			empHrs=0;
		empwage=empHrs*empRatePerHour;
		System.out.println("Emp wage"+empwage);
	}

	public static void main(String[] args) {
		Parttimewage();
}
}