/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
import java.util.*;

/**
 *
 * @author Name
 */
public class EmployeeService {

    /**
     *
     */
    List<Employee> empset = new ArrayList<>();

    /**
     *
     */
    Employee emp1 = new Employee(100, "Ramadan", "France", "1234567890", 70000.00, "IT");

    /**
     *
     */
    Scanner sc = new Scanner(System.in);

    /**
     *
     */
    boolean found = false;

    /**
     *
     */
    int empId;

    /**
     *
     */
    String name;

    /**
     *
     */
    String address;

    /**
     *
     */
    String phoneNumber;

    /**
     *
     */
    double salary;

    /**
     *
     */
    String department;

    /**
     *
     */
    double overtimeHours = 0;

    /**
     *
     */
    public EmployeeService() {

        empset.add(emp1);

    }

    //view all employees

    /**
     *
     */
    public void viewAllEmps() {
        System.out.println("Employee Details :");
        for (Employee emp : empset) {
            System.out.println(emp);
        }
        System.out.println("-----------------------------");
    }

    //view emp based on there id

    /**
     *
     */
    public void viewEmp() {
        System.out.println("Enter Employee id: ");
        empId = sc.nextInt();
        for (Employee emp : empset) {
            if (emp.getEmpId() == empId) {
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Employee with this id is not present.");
        }
    }

    //update the employee

    /**
     *
     */
    public void updateEmployee() {
        System.out.println("Enter id: ");
        empId = sc.nextInt();
        boolean found = false;
        int ch1 = 0;
        System.out.println("\nEDIT Employee Details :\n"
                + "1). Employee ID\n"
                + "2). Name\n"
                + "3). Address\n"
                + "4). PhoneNumber\n"
                + "5). Salary \n"
                + "6). Department\n"
                + "7). GO BACK\n");
        System.out.println("Enter your choice : ");
        ch1 = sc.nextInt();
        for (Employee emp : empset) {
            if (emp.getEmpId() == empId) {
                switch (ch1) {
                    case 1:
                        System.out.println("\nEnter new Employee ID for the Employee:");
                        empId = sc.nextInt();
                        emp.setEmpId(empId);
                        System.out.println(emp + "\n");
                        found = true;
                        break;

                    case 2:
                        System.out.println("Enter the updated Name of the Employee:");
                        name = sc.next();
                        emp.setName(name);
                        System.out.println(emp + "\n");
                        found = true;
                        break;

                    case 3:
                        System.out.println("Enter the updated Address of the Employee:");
                        address = sc.next();
                        emp.setAddress(address);
                        System.out.println(emp + "\n");
                        found = true;
                        break;

                    case 4:
                        System.out.println("Enter a updated Phone Number of the Employee:");
                        phoneNumber = sc.next();
                        emp.setPhoneNumber(phoneNumber);
                        System.out.println(emp + "\n");
                        found = true;
                        break;

                    case 5:
                        System.out.println("Enter a updated Salary for the Employee:");
                        salary = sc.nextDouble();
                        emp.setSalary(salary);
                        System.out.println(emp + "\n");
                        found = true;
                        break;
                    case 6:
                        System.out.println("Enter a updated Department for the Employee:");
                        department = sc.next();
                        emp.setDepartment(department);
                        System.out.println(emp + "\n");
                        found = true;
                        break;

                    case 7:
                        break;

                    default:
                        System.out.println("\nEnter a correct choice from the List :");
                        break;

                }

            }
        }
        if (!found) {
            System.out.println("Employee is not present in the list.");
        } else {
            System.out.println("Employee details updated successfully..!!");
        }
    }

    //delete emp

    /**
     *
     */
    public void deleteEmp() {
        System.out.println("Enter Employee id:");
        empId = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getEmpId() == empId) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present in the list.");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully..!!");
        }
    }

    //add emp

    /**
     *
     */
    public void addEmp() {
        System.out.println("Enter Employee id:");
        empId = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter Address:");
        address = sc.next();
        System.out.println("Enter Phone Number:");
        phoneNumber = sc.next();
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();
        System.out.println("Enter Department:");
        department = sc.next();
        System.out.println("Enter Over Time Hours in number:");
        overtimeHours = sc.nextInt();

        Employee emp = new Employee(empId, name, address, phoneNumber, salary, department);

        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee addeed successsfully.......");

    }

}
