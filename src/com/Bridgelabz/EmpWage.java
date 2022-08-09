package com.Bridgelabz;

public class EmpWage {
	public static final int isparttime=1;
	public static final int isfulltime=2;
	public static final int emprateperhrs=20;
	public static final int numofworkingdays=2;
	public static void CalwageforMonth()
	{
		int empHrs=0;
	      int empwage=0;
	      int totalEmpwage=0;
	      for(int day=0;day<numofworkingdays;day++) {
	    	  int empCheck=(int) Math.floor(Math.random()*10)%3;
	      switch (empCheck) {
	      case isparttime:
	        empHrs=4;
	        break;
	      case isfulltime:
	    	  empHrs=8;
	    	  break;
	    	  default:
	    		  empHrs=0;
	      }
	      empwage= empHrs*emprateperhrs;
	      totalEmpwage+=empwage;
	      System.out.println("empwage"+empwage);
	      }
	      System.out.println("total emp wage"+totalEmpwage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalwageforMonth();
}
}