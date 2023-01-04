package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    /**
    * @author Akash Pakhare
    */

    public class EmployeePayrollService {

        static List<EmployeePayrollData> employList;

        public enum IOServices{
            CONSOLE_IO, FILE_IO
        }

        /**
         *Default constructor
         */
        public EmployeePayrollService() {
        }

        /**
         * parameterized constructor
         */
        public EmployeePayrollService(List<EmployeePayrollData> employList) {
            this.employList =employList;
        }
        /**
        *   create write method to print data back to console
        */
        public boolean writeEmployeePayrollData(IOServices ioServices){
        PayrollService payrollService = getEmployeePayrollObject(ioServices);
        try {
        return payrollService.writePayrollData(employList);
        } catch (IOException e) {
        System.out.println("catch block" + e);
        }
        return false;
        }
        public void readEmployPayrollData(IOServices ioServices) {
        PayrollService payrollService = getEmployeePayrollObject(ioServices);
        try {
        payrollService.readPayrollData();
        } catch (IOException e) {
        System.out.println("catch block" + e);
        }
        }
        public long countEntries(IOServices ioServices) {
        PayrollService payrollService = getEmployeePayrollObject(ioServices);
        try {
        return payrollService.countEntries();
        } catch (IOException e) {
        System.out.println("catch block" + e);
        }
        return 0;
        }
        private static PayrollService getEmployeePayrollObject(IOServices ioServices){
        PayrollService payrollService = null;
        if(IOServices.FILE_IO.equals(ioServices))
        payrollService = new FileIOPayrollService();
        else if(IOServices.CONSOLE_IO.equals(ioServices))
        payrollService = new ConsoleIOPayrollService();
        return payrollService;
        }

        /**
        * This is  Main method is Used to read the input from user through console
        */
        public static void main(String[] args) {
        EmployeePayrollService employPayrollService = new EmployeePayrollService();
        employPayrollService.readEmployPayrollData(IOServices.CONSOLE_IO);
        employPayrollService.writeEmployeePayrollData(IOServices.CONSOLE_IO);
        employPayrollService.countEntries(IOServices.CONSOLE_IO);
        }
        }