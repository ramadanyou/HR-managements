/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
public class Student {

    // Student attributes

    /**
     *
     */
    private int studentId;

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
    private String program;

    /**
     *
     */
    private String course;

    // Constructor for student

    /**
     *
     * @param studentId
     * @param name
     * @param address
     * @param phoneNumber
     * @param program
     * @param course
     */
    public Student(int studentId, String name, String address, String phoneNumber, String program, String course) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.program = program;
        this.course = course;
    }

    // Methods for accessing student attributes

    /**
     *
     * @return
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     *
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     *
     * @return
     */
    public String getCourse() {
        return course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
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
    public String getProgram() {
        return program;
    }

    /**
     *
     * @param program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               ID: """ + studentId + "\nName: " + name + "\nAddress: " + address
                + "\nPhoneNumber:" + phoneNumber + "\nProgram: " + program + "\nCourse: " + course;
    }
}
