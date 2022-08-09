package com.Bridgelabz;

public class EmpWage {

	public static void EmpAttendce()
    {
    	int isfulltime=1;
		double empCheck=Math.floor(Math.random()*10)%2;
			if(empCheck==isfulltime) 
				System.out.println("Employee is present");
				else
					System.out.println("employee is absent");
    }

	public static void main(String[] args) {
		System.out.println("welcome to Employee wage computation program");
		
		EmpAttendce();
    }
}