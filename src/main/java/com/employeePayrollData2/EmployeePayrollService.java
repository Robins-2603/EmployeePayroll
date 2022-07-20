package com.employeePayrollData2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    ArrayList<EmployeePayrollData> employeePayrollDataArrayList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    public void readEmployeePayrollData(Scanner consoleInputReader ) {
        System.out.println("Enter Employee Id");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollDataArrayList.add(new EmployeePayrollData(id,name,salary));

    }

    public void writeEmployeePayrollData() {
        System.out.println("\n writing Employee payroll roster to console\n" + employeePayrollDataArrayList);
    }
}
