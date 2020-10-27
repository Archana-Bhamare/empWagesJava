package com.brigelabz;

public class Employee {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursInMonth;
	public final String comname;
	public int totalEmpWage;

	public Employee(String comname, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		this.comname = comname;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public int calculateWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
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
		System.out.println("Total Salary for : " + comname + "is :" + totalSalary);
		return totalSalary;
	}

	public static void main(String[] args) {
		Employee techMahindra = new Employee("Tech Mahindra", 20, 10, 10);
		Employee infosys = new Employee("Infosys", 15, 15, 20);
		techMahindra.calculateWage();
		infosys.calculateWage();
	}
}
