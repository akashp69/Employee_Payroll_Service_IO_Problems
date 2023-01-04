package com.bridgelabz;

import java.io.IOException;
import java.util.List;

/**
 * This is Interface Class is Using for throws Exception
 */
public interface PayrollService {
    boolean writePayrollData(List<EmployeePayrollData> employeeList) throws IOException;
    void readPayrollData() throws IOException;
    long countEntries() throws IOException;

}
