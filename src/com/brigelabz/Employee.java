package com.brigelabz;

public class Employee implements IEmployeeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	

	private int numOfComany=0;
	private CompEmpWage[] companyWageArray;
	public Employee() {
		companyWageArray = new CompEmpWage[3];
	}
	public void companyEmpWage(String comname,int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		companyWageArray[numOfComany]=new CompEmpWage(comname,empRatePerHour, numOfWorkingDays, maxHoursInMonth);
		numOfComany++;
	}
	public void calculateWage() {
		for (int i=0;i< numOfComany;i++){
			companyWageArray[i].setTotalEmpWage(this.calculateWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}
	}

	public int calculateWage(CompEmpWage compEmpWage) {
		 int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
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
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + "\tEmp hours : " + empHrs);
		}
		return totalEmpHrs*compEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		Employee empArray=new Employee();
		empArray.companyEmpWage("Tech Mahindra", 15, 20, 100);
		empArray.companyEmpWage("Infosys", 15, 20, 100);
		empArray.calculateWage();
	}
}