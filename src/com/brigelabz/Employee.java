package com.brigelabz;

public class Employee {
	public static void main(String[] args) {
		/*
		 * int IS_FULL_TIME = 1; int IS_PART_TIME = 2;
		 */
		int EMP_RATE_PER_HOUR = 20;
		int NUM_OF_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 100;
		int empHrs = 0;
		int totalSalary = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Days : " + totalWorkingDays + "\nEmp hours : " + empHrs);
		}

		totalSalary = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println("Total Salary is : " + totalSalary);
	}
}
