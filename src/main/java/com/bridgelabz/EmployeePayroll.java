package com.bridgelabz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

     /**
     * @author Akash Pakhare
     */
public class EmployeePayroll {
     /**
     * This is Main Method is Using For Calling the Methods
     */
     public static void main(String[] args) {
     System.out.println("..WELCOME TO EMPLOYEE PAYROLL SYSTEM..");
     EmployeePayrollService employeePayrollService = new EmployeePayrollService();
     employeePayrollService.readEmployeeDataFromConsole();
     employeePayrollService.writeEmployeeDataInConsole();
     }
     }