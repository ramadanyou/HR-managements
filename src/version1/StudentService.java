/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.*;

/**
 *
 * @author Name
 */
public class StudentService {

    /**
     *
     */
    List<Student> studentSet = new ArrayList<>();

    /**
     *
     */
    Student student1 = new Student(100, "Naveen", "France", "9080965525", "Computer Science", "CS101");

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
    int studentId;

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
    String program;

    /**
     *
     */
    String course;

    /**
     *
     */
    public StudentService() {
        studentSet.add(student1);
    }

    //view all students

    /**
     *
     */
    public void viewAllStudents() {
        System.out.println("Student Details :");
        for (Student student : studentSet) {
            System.out.println(student);
        }
        System.out.println("-----------------------------");
    }

    //view Student based on there id

    /**
     *
     */
    public void viewStudent() {
        System.out.println("Enter Student id: ");
        studentId = sc.nextInt();
        for (Student student : studentSet) {
            if (student.getStudentId() == studentId) {
                System.out.println(student);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Student with this id is not present.");
        }
    }

    //update the employee

    /**
     *
     */
    public void updateStudent() {
        System.out.println("Enter Student id: ");
        studentId = sc.nextInt();
        boolean found = false;
        int ch1 = 0;
        System.out.println("\nEDIT Student Details :\n"
                + "1). Student ID\n"
                + "2). Name\n"
                + "3). Address\n"
                + "4). PhoneNumber\n"
                + "5). Program t\n"
                + "6). Course\n"
                + "7). GO BACK\n");
        System.out.println("Enter your choice : ");
        ch1 = sc.nextInt();
        for (Student student : studentSet) {
            if (student.getStudentId() == studentId) {
                switch (ch1) {
                    case 1:
                        System.out.println("\nEnter new Student ID for the Student:");
                        studentId = sc.nextInt();
                        student.setStudentId(studentId);
                        System.out.println(student + "\n");
                        found = true;
                        break;

                    case 2:
                        System.out.println("Enter the updated Name of the Student:");
                        name = sc.next();
                        student.setName(name);
                        System.out.println(student + "\n");
                        found = true;
                        break;

                    case 3:
                        System.out.println("Enter the updated Address of the Student:");
                        address = sc.next();
                        student.setAddress(address);
                        System.out.println(student + "\n");
                        found = true;
                        break;

                    case 4:
                        System.out.println("Enter the updated PhoneNumber for the Student:");
                        phoneNumber = sc.next();
                        student.setPhoneNumber(phoneNumber);
                        System.out.println(student + "\n");
                        found = true;
                        break;

                    case 5:
                        System.out.println("Enter the updated Program for the Student:");
                        program = sc.next();
                        student.setProgram(program);
                        System.out.println(student + "\n");
                        found = true;
                        break;
                    case 6:
                        System.out.println("Enter the updated Course for the Student:");
                        course = sc.next();
                        student.setCourse(course);
                        System.out.println(student + "\n");
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
            System.out.println("Student is not present in the list.");
        } else {
            System.out.println("Student details updated successfully..!!");
        }
    }

    //delete student

    /**
     *
     */
    public void deleteStudent() {
        System.out.println("Enter Student id:");
        studentId = sc.nextInt();
        boolean found = false;
        Student studentDelete = null;
        for (Student student : studentSet) {
            if (student.getStudentId() == studentId) {
                studentDelete = student;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student is not present in the list.");
        } else {
            studentSet.remove(studentDelete);
            System.out.println("Student deleted successfully..!!");
        }
    }

    //add Student

    /**
     *
     */
    public void addStudent() {
        System.out.println("Enter Student id:");
        studentId = sc.nextInt();
        System.out.println("Enter Student name:");
        name = sc.next();
        System.out.println("Enter Student Address:");
        address = sc.next();
        System.out.println("Enter Student Phone Number:");
        phoneNumber = sc.next();
        System.out.println("Enter Student Program:");
        program = sc.next();
        System.out.println("Enter Student Course:");
        course = sc.next();

        Student student = new Student(studentId, name, address, phoneNumber, program, course);

        studentSet.add(student);
        System.out.println(student);
        System.out.println("Student addeed successsfully.......");

    }

}
