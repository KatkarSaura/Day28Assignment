package com.bridgelabz;

import java.awt.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO,REST_IO}
	private List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService() {}
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {...}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
		
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee Id:");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name:");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary:");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
	}
	
	private void writeEmloyeePayrollData() {
		String employeePayrollList;
		System.out.println("\n writing emloyee payroll roaster to console\n" + employeePayrollList);
	
		

	}

}
