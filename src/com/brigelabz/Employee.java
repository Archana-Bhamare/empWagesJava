package com.brigelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee implements IEmployeeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private ArrayList<CompEmpWage> companyWageArray;
	private HashMap<Integer, Integer> companyWageMap;
	private HashMap<String, CompEmpWage> companyWageMap1;

	public Employee() {
		companyWageArray = new ArrayList<>();
		companyWageMap = new HashMap<>();
		companyWageMap1 = new HashMap<>();
	}

	public void companyEmpWage(String comname, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		CompEmpWage comWage = new CompEmpWage(comname, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
		companyWageArray.add(comWage);
		companyWageMap1.put(comname, comWage);
	}

	public void calculateWage() {
		for (int i = 0; i < companyWageArray.size(); i++) {
			CompEmpWage companyEmpWage = companyWageArray.get(i);
			companyEmpWage.setTotalEmpWage(this.calculateWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String comname) {
		int total = 0;
		try {
			total = companyWageMap1.get(comname).totalEmpWage;
		} catch (NullPointerException e) {

		}
		return total;

	}

	public int calculateWage(CompEmpWage compEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, dailyWage = 0;
		while (totalEmpHrs < compEmpWage.maxHoursInMonth && totalWorkingDays < compEmpWage.numOfWorkingDays) {
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
			dailyWage = empHrs * compEmpWage.empRatePerHour;
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + "\tEmp hours : " + empHrs);
			companyWageMap.put(totalWorkingDays, dailyWage);
		}
		for (int i = 0; i < companyWageMap.size(); i++) {
			System.out.println("DailyWage : " + companyWageMap.get(i));
		}
		return totalEmpHrs * compEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.companyEmpWage("Tech Mahindra", 15, 20, 100);
		employee.companyEmpWage("Infosys", 15, 20, 100);
		employee.calculateWage();
		System.out.println("Total Wage of Tech Mahindra: " + employee.getTotalWage("Tech Mahindra"));
		System.out.println("Total Wage of Infosysy : " + employee.getTotalWage("Infosys"));
	}
}