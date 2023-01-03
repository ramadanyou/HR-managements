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
public class AttendanceRecord {
    // Attendance record attributes

    /**
     *
     */

    private int empId;

    /**
     *
     */
    private String date;

    /**
     *
     */
    private int arrivalTime;

    /**
     *
     */
    private int departureTime;

    /**
     *
     */
    private int absences;

    /**
     *
     */
    private int overtimeHours;

    // Constructor for attendance record

    /**
     *
     * @param empId
     * @param date
     * @param arrivalTime
     * @param departureTime
     * @param absenses
     * @param overtimeHours
     */
    public AttendanceRecord(int empId, String date, int arrivalTime, int departureTime, int absenses, int overtimeHours) {
        this.empId = empId;
        this.date = date;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.absences = absenses;
        this.overtimeHours = overtimeHours;
    }

    // Methods for accessing attendance record attributes

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
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     *
     * @param arrivalTime
     */
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     *
     * @return
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     *
     * @param departureTime
     */
    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    /**
     *
     * @return
     */
    public int getAbsences() {
        return absences;
    }

    /**
     *
     * @param absences
     */
    public void setAbsences(int absences) {
        this.absences = absences;
    }

    /**
     *
     * @return
     */
    public int getOvertimeHours() {
        return overtimeHours;
    }

    /**
     *
     * @param overtimeHours
     */
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
              Employee ID: """ + empId + "\nDate: " + date + "\nArrival Time: " + arrivalTime
                + "\nDeparture Time:" + departureTime + "\nAbsences: " + absences + "\nOver Time Hours: " + overtimeHours;
    }

}
