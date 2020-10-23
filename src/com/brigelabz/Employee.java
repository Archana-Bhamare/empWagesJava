package com.brigelabz;

public class Employee {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int employeeWages(String comname, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs < maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
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
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + "\tEmp hours : " + empHrs);
		}
		int totalSalary = empRatePerHour * totalEmpHrs;
		System.out.println("Total Salary for : " + comname + " is : " + totalSalary);
		return totalSalary;
	}

	public static void main(String[] args) {
		employeeWages("Tech Mahindra", 15, 20, 100);
		employeeWages("Infosys", 20, 15, 80);
	}
}
