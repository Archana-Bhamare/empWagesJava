package com.brigelabz;

public class Employee {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		int empHrs = 0;
		int totalSalary = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
<<<<<<< HEAD
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + "Emp hours : " + empHrs);
=======
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Days : " + totalWorkingDays + "\nEmp hours : " + empHrs);
>>>>>>> fcd32400d62e76ad0bf2f8d9691ddf3f454abbf5
		}
		totalSalary = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println("Total Salary is : " + totalSalary);
	}
}
