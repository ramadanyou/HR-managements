/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @authorName
 */
public class Employee {

    // Employee attributes

    /**
     *
     */
    private int empId;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private String phoneNumber;

    /**
     *
     */
    private double salary;

    /**
     *
     */
    private String department;

    /**
     *
     */
    double overtimeHours = 0;

    /**
     *
     * @return
     */
    public int getEmpId() {
        return empId;
    }

    /**
     *
     * @param empId
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     *
     * @return
     */
    public double getOvertimeHours() {
        return overtimeHours;
    }

    // Methods for accessing employee attributes

    /**
     *
     * @param overtimeHours
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    // Methods to calculate the employee's overtime and annual remuneration

    /**
     *
     * @param overtimeHours
     * @return
     */
    public double calculateOvertimePay(double overtimeHours) {
        // Calculate overtime pay based on hourly rate and number of overtime hours
        return overtimeHours * (salary / 2080);
    }

    /**
     *
     * @return
     */
    public double calculateAnnualPay() {

        // Calculate the annual compensation by adding the overtime compensation to the annual salary
        return salary + calculateOvertimePay(overtimeHours);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               ID: """ + empId + "\nName: " + name + "\nAddress: " + address
                + "\nPhoneNumber:" + phoneNumber + "\nSalary: " + salary + "\nDepartment: " + department;
    }

    // Employee constructor

    /**
     *
     * @param empId
     * @param name
     * @param address
     * @param phoneNumber
     * @param salary
     * @param department
     */
    public Employee(int empId, String name, String address, String phoneNumber, double salary, String department) {
        super();
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.department = department;
    }

}
