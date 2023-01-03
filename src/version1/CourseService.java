/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Name
 */
import java.util.*;

/**
 *
 * @author Name
 */
public class CourseService {

    /**
     *
     */
    List<Course> courseset = new ArrayList<>();

    /**
     *
     */
    Course course1 = new Course("MATH101", "Introduction to Calculus", "beginner", 6, "Ramadan");

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
    String code;

    /**
     *
     */
    String name;

    /**
     *
     */
    String level;

    /**
     *
     */
    int duration;

    /**
     *
     */
    String studentName;

    /**
     *
     */
    public CourseService() {
        courseset.add(course1);
    }

    // Add course

    /**
     *
     */
    public void addCourse() {
        System.out.println("Enter course code:");
        code = sc.next();
        System.out.println("Enter course name:");
        name = sc.next();
        System.out.println("Enter course level(ex. beginner, intermediate, advanced):");
        level = sc.next();
        System.out.println("Enter course duration in months:");
        duration = sc.nextInt();
        System.out.println("Enter student name:");
        studentName = sc.next();

        Course cour = new Course(code, name, level, duration, studentName);

        courseset.add(cour);
        System.out.println(cour);
        System.out.println("course addeed successsfully.......");

    }

    //view all courses

    /**
     *
     */
    public void viewAllCourses() {
        System.out.println("Course Details :");
        for (Course course : courseset) {
            System.out.println(course);
        }
        System.out.println("-----------------------------");
    }

    //view course based on there code

    /**
     *
     */
    public void viewCourse() {
        System.out.println("Enter course code: ");
        code = sc.next();
        for (Course course : courseset) {
            if ((course.getCode()).equals(code)) {
                System.out.println(course);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Course with this code is not present.");
        }
    }

    //update the course

    /**
     *
     */
    public void updateCourse() {
        System.out.println("Enter course code: ");
        code = sc.next();
        boolean found = false;
        int ch1 = 0;
        System.out.println("\nEDIT course Details :\n"
                + "1). Course code\n"
                + "2). Course Name\n"
                + "3). Course level\n"
                + "4). Course duration\n"
                + "5). Student Name\n"
                + "6). GO BACK\n");
        System.out.println("Enter your choice : ");
        ch1 = sc.nextInt();
        for (Course course : courseset) {
            if ((course.getCode()).equals(code)) {
                switch (ch1) {
                    case 1:
                        System.out.println("\nEnter new course code:");
                        code = sc.next();
                        course.setCode(code);
                        System.out.println(course + "\n");
                        found = true;
                        break;

                    case 2:
                        System.out.println("Enter the updated Name of the Course:");
                        name = sc.next();
                        course.setName(name);
                        System.out.println(course + "\n");
                        found = true;
                        break;

                    case 3:
                        System.out.println("Enter a updated course level:");
                        level = sc.next();
                        course.setLevel(level);
                        System.out.println(level + "\n");
                        found = true;
                        break;

                    case 4:
                        System.out.println("Enter a updated course duration:");
                        duration = sc.nextInt();
                        course.setDuration(duration);
                        System.out.println(course + "\n");
                        found = true;
                        break;

                    case 5:
                        System.out.println("Enter a updated name of the student:");
                        studentName = sc.next();
                        course.setName(studentName);
                        System.out.println(course + "\n");
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
            System.out.println("Course is not present in the list.");
        } else {
            System.out.println("Course details updated successfully..!!");
        }
    }

    //delete Course

    /**
     *
     */
    public void deleteCourse() {
        System.out.println("Enter course code:");
        code = sc.next();
        boolean found = false;
        Course coursedelete = null;
        for (Course course : courseset) {
            if ((course.getCode()).equals(code)) {
                coursedelete = course;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Course is not present in the list.");
        } else {
            courseset.remove(coursedelete);
            System.out.println("Course deleted successfully..!!");
        }
    }
}
