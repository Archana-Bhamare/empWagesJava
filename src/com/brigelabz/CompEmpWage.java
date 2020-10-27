package com.brigelabz;

public class CompEmpWage {
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursInMonth;
	public final String comname;
	public int totalEmpWage;

	public CompEmpWage(String comname, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		this.comname = comname;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Employee Wage : " + comname + " is : " + totalEmpWage;
	}
}
