package com.brigelabz;

public class Employee {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present for full time");
			empHrs = 8;
		} else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Present for part time");
			empHrs = 4;
		} else {
			System.out.println("EMployee is Absent");
			empHrs = 0;
		}
		int dailyWage = EMP_RATE_PER_HOUR * empHrs;
		System.out.println("Employee Daily wage is : " + dailyWage);
	}
}
