package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Akash Pakhare
 */
public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollDataList;
    public EmployeePayrollService() {
    /**
    * This is Default Constructor
    */
    }
    public EmployeePayrollService(ArrayList<EmployeePayrollData> employPayrollDataList) {
    /**
    *This is Parameterized Constructor
    */
    this.employeePayrollDataList =employPayrollDataList;
    }
    public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    ArrayList<EmployeePayrollData> employPayrollDataList = new ArrayList<>();
    EmployeePayrollService  employPayrollService = new EmployeePayrollService(employPayrollDataList);
    employPayrollService.readEmployPayrollData(scanner1);
    employPayrollService.writeEmployPayrollData();
    }
    /**
    *Create write method to print data of employee
    */
    private void writeEmployPayrollData(){
    /**
    *Print the employee data which is stored in employPayrollDataList
    **/
    System.out.println("Writing EmployPayrollData: " + employeePayrollDataList);
    }
    /**
    *This method  is Created to read the input from user through console
    **/
    private void readEmployPayrollData(Scanner scanner1){
    System.out.println("Enter your Id: ");
    int id = scanner1.nextInt();
    System.out.println("Enter your name: ");
    String name = scanner1.next();
    System.out.println("Enter your salary: ");
    double salary = scanner1.nextDouble();
    EmployeePayrollData employeeData = new EmployeePayrollData(id, name, salary);
    /**
    *Adding all Employee data to the Arraylist
    */
    employeePayrollDataList.add(employeeData);
    }
    }
