package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleIOPayrollService implements PayrollService {

    @Override
    public boolean writePayrollData(List<EmployeePayrollData> employList) {
        System.out.println("Given Employee Data is : " + employList);
        return false;
    }

    @Override
    public void readPayrollData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Id: ");
        int id = scanner.nextInt();
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        EmployeePayrollService.employList = new ArrayList<>();
        EmployeePayrollData empData = new EmployeePayrollData(id, name, salary);
//    adding all employee data to the arraylist
        EmployeePayrollService.employList.add(empData);
    }

    @Override
    public long countEntries() throws IOException {
        return new FileIOPayrollService().countEntries();
    }
}
