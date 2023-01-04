package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    /**
    * This class is Used  for Created the list of Employee Payroll and Read & Write the Data
    */
public class EmployeePayrollService {
    private List<EmployeePayrollData> employePayrollList = new ArrayList<EmployeePayrollData>();
    Scanner scanner = new Scanner(System.in);
    /**
    * This Method is Created for Read Employee Data from Console
    */
    public void readEmployeeDataFromConsole() {
    System.out.println("Enter Employee Id");
    int id = scanner.nextInt();
    System.out.println("Enter Employee Name");
    String Name = scanner.next();
    System.out.println("Enter the salary");
    int salary = scanner.nextInt();
    employePayrollList.add(new EmployeePayrollData(id, Name, salary));
    }
    /**
    * This Method is Created for Write the employee data in Console
    */
    public void writeEmployeeDataInConsole() {
    System.out.println("Writing Employee Pay Roll Data \n" + employePayrollList);
    }
    }
