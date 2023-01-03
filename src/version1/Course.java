/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
public class Course {
    // Course attributes

    /**
     *
     */

    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String level;

    /**
     *
     */
    private int duration;

    /**
     *
     */
    private String student;

    // Constructor for course

    /**
     *
     * @param code
     * @param name
     * @param level
     * @param duration
     * @param student
     */
    public Course(String code, String name, String level, int duration, String student) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.duration = duration;
        this.student = student;
    }

    // Methods for accessing course attributes

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
    public String getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     *
     * @return
     */
    public int getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     */
    public String getStudent() {
        return student;
    }

    /**
     *
     * @param student
     */
    public void setStudent(String student) {
        this.student = student;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
              Course Code: """ + code + "\nCourse Name: " + name + "\nCourse Level: " + level
                + "\nCourse duration:" + duration + "\nStudent Name: " + student;
    }

}
