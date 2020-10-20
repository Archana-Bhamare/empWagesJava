package com.brigelabz;

public class Employee {
	public static void main(String[] args) {
		/*int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;*/
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck) {
		case 1:
			System.out.println("Employee is Present for full time");
			empHrs = 8;
			break;
		case 2:
			System.out.println("Employee is Present for part time");
			empHrs = 4;
			break;
		default:
			System.out.println("Employee is Absent");
			empHrs = 0;
			break;
		}
		int dailyWage = EMP_RATE_PER_HOUR * empHrs;
		System.out.println("Employee Daily wage is : " + dailyWage);
	}
}
