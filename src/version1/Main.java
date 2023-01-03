/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Name
 */
public class Main {

    /**
     *
     */
    static EmployeeService service = new EmployeeService();

    /**
     *
     */
    static CourseService courseService = new CourseService();

    /**
     *
     */
    static StudentService studentService = new StudentService();

    /**
     *
     */
    static LeaveRequestService leaveRequestService = new LeaveRequestService();

    /**
     *
     */
    static AttendanceRecordService attendanceRecordService = new AttendanceRecordService();

    /**
     *
     */
    static Scanner sc = new Scanner(System.in);

    /**
     *
     */
    static boolean ordering = true;

    /**
     *
     */
    static boolean validUser;

    /**
     *
     */
    public static void login() {
        System.out.println("**************** Welcome To Employee Managment System *********** ");
        System.out.println("Enter your Username:");
        String userNameInput = sc.next();
        System.out.println("Enter your Password:");
        String userPasswordInput = sc.next();
        String userName = "admin";
        String password = "admin";
        validUser = userName.equals(userNameInput) && password.equals(userPasswordInput);
    }

    /**
     *
     */
    public static void menu() {
        System.out.println("**************** Welcome Admin *********** "
                + "\n1.Employee Management"
                + "\n2.Course Management"
                + "\n3.Student Management"
                + "\n4.Leave Management"
                + "\n5.Attendance Management"
                + "\n6.Exit ");
        validUser = true;

    }

    /**
     *
     */
    public static void Empmenu() {
        System.out.println("**************** Welcome Admin *********** "
                + "\n1.Add Employee"
                + "\n2.View Employee"
                + "\n3.Update Employee"
                + "\n4.Delete Employee"
                + "\n5.View All Employees"
                + "\n6.Back to Main Menu ");

        System.out.println("Enter your Choice:");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Add Employee");
                service.addEmp();
                Empmenu();
            }
            case 2 -> {
                System.out.println("View Employee");
                service.viewEmp();
                Empmenu();
            }
            case 3 -> {
                System.out.println("Update Employee");
                service.updateEmployee();
                Empmenu();
            }
            case 4 -> {
                System.out.println("Delete Employee");
                service.deleteEmp();
                Empmenu();
            }
            case 5 -> {
                System.out.println("view All Employees");
                service.viewAllEmps();
                Empmenu();
            }
            case 6 ->
                menu();

            default ->
                System.out.println("Please enter valid choice......");
        }
    }

    /**
     *
     */
    public static void courseMenu() {

        System.out.println("**************** Course Management *********** "
                + "\n1.Add Course"
                + "\n2.View Course"
                + "\n3.Update Course"
                + "\n4.Delete Course"
                + "\n5.View All Courses"
                + "\n6.Back to Main Menu");

        System.out.println("Enter your Choice:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Add Course:");
                courseService.addCourse();
                courseMenu();
                break;
            }

            case 2 -> {
                System.out.println("View Course:");
                courseService.viewCourse();
                courseMenu();
                break;
            }

            case 3 -> {
                System.out.println("Update Course:");
                courseService.updateCourse();
                courseMenu();
                break;
            }

            case 4 -> {
                System.out.println("Delete Course:");
                courseService.deleteCourse();
                courseMenu();
                break;
            }

            case 5 -> {
                System.out.println("view All Courses:");
                courseService.viewAllCourses();
                courseMenu();
                break;
            }

            case 6 -> {
                menu();
                break;

            }

            default ->
                System.out.println("Please enter valid choice.......");
        }

    }

    /**
     *
     */
    public static void studentMenu() {

        System.out.println("**************** Student Management *********** "
                + "\n1.Add Student"
                + "\n2.View Student"
                + "\n3.Update Student"
                + "\n4.Delete Student"
                + "\n5.View All Students"
                + "\n6.Back to Main Menu");
        System.out.println("Enter your Choice:");
        int studentChoice = sc.nextInt();
        validUser = true;

        switch (studentChoice) {
            case 1 -> {
                System.out.println("Add Student:");
                studentService.addStudent();
                studentMenu();
                break;
            }

            case 2 -> {
                System.out.println("View Student:");
                studentService.viewStudent();
                studentMenu();
                break;
            }

            case 3 -> {
                System.out.println("Update Student:");
                studentService.updateStudent();
                studentMenu();
                break;
            }

            case 4 -> {
                System.out.println("Delete Student:");
                studentService.deleteStudent();
                studentMenu();
                break;
            }

            case 5 -> {
                System.out.println("view All Students:");
                studentService.viewAllStudents();
                studentMenu();
                break;
            }

            case 6 -> {
                menu();
                break;
            }

            default ->
                System.out.println("Please enter valid choice..........");
        }
    }

    /**
     *
     * @throws ParseException
     */
    public static void leaveRequestMenu() throws ParseException {

        System.out.println("**************** Leave Management Management *********** "
                + "\n1.Add Leave"
                + "\n2.View Employee Leave"
                + "\n3.View all Leaves"
                + "\n4.Back to Main Menu");

        System.out.println("Enter your Choice:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Add Leave:");
                leaveRequestService.leaveRequest();
                leaveRequestMenu();
                break;
            }

            case 2 -> {
                System.out.println("View Employee Leave:");
                leaveRequestService.viewEmpLeaveRequest();
                leaveRequestMenu();
                break;
            }

            case 3 -> {
                System.out.println("View all Leaves:");
                leaveRequestService.viewAllEmpLeaveRequests();
                leaveRequestMenu();
                break;
            }

            case 4 -> {
                menu();
                break;

            }

            default ->
                System.out.println("Please enter valid choice.......");
        }

    }

    /**
     *
     */
    public static void attendanceMenu() {

        System.out.println("**************** Attendance Management Management *********** "
                + "\n1.Add Attendance"
                + "\n2.View Employee Attendance"
                + "\n3.View all Employees Attendance"
                + "\n4.Back to Main Menu");

        System.out.println("Enter your Choice:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Add Employee:");
                attendanceRecordService.attendanceRecord();
                attendanceMenu();
                break;
            }

            case 2 -> {
                System.out.println("View Employee Attendance");
                attendanceRecordService.viewEmpAttendance();
                attendanceMenu();
                break;
            }

            case 3 -> {
                System.out.println("View all Employees Attendance");
                attendanceRecordService.viewAllEmpAttendance();
                attendanceMenu();
                break;
            }

            case 4 -> {
                menu();
                break;

            }

            default ->
                System.out.println("Please enter valid choice.......");
        }

    }

    /**
     *
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {

        login();

        if (validUser) {
            menu();
            do {
                System.out.println("Enter your Choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        Empmenu();
                        break;

                    case 2:
                        courseMenu();
                        break;

                    case 3:
                        studentMenu();
                        break;

                    case 4:
                        leaveRequestMenu();
                        break;

                    case 5:
                        attendanceMenu();
                        break;

                    case 6:
                        System.out.println("Thank you for using HR Management System...!!");
                        System.exit(0);

                    default:
                        System.out.println("Please enter valid choice");
                        break;

                }

            } while (ordering);
        } else {
            System.out.println("Invalid Credentials! Try again");
            login();
        }
    }

}
