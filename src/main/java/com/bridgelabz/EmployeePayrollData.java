package com.bridgelabz;

/**
 *This Class is Created for Here Created getter setter , toString and Constructor methods with the help of Variables as  private keyword
 */

public class EmployeePayrollData {
    private int id;
    private String name;
    private double salary;
    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    }
