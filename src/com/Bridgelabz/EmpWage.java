package com.Bridgelabz;

public class EmpWage {
	public static final int isparttime=1;
	public static final int isfulltime=2;
	public static final int Emprateperhr=20;
	public static void UsingSwitchcase()
	{
		int empHrs=0;
	       int empwage=0;
	       int empCheck=(int)Math.floor(Math.random()*10)%3;
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
	       empwage=empHrs*Emprateperhr;
	       System.out.println("empwage"+empwage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingSwitchcase();
}
}