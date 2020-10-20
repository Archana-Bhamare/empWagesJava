package com.brigelabz;

public class Employee {
	public static void main(String[] args) {
		/*
		 * int IS_FULL_TIME = 1; int IS_PART_TIME = 2;
		 */
		int EMP_RATE_PER_HOUR = 20;
		int NUM_OF_WORKING_DAYS = 20;
		int empHrs = 0;
		int totalSalary = 0;
		for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			int dailyWage = EMP_RATE_PER_HOUR * empHrs;
			totalSalary = totalSalary + dailyWage;
		}
		System.out.println("Total Salary for a month is : " + totalSalary);
	}
}
