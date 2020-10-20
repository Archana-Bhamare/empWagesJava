package com.brigelabz;

public class Employee {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs=0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("EMployee is Present"); 
			empHrs = 8;
		} else {
			System.out.println("EMployee is Absent"); 
			empHrs = 0;
		}
		int dailyWage = EMP_RATE_PER_HOUR *empHrs;
		System.out.println("Employee Daily wage is : " + dailyWage);
	}
}
