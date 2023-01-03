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
public class AttendanceRecordService {

    /**
     *
     */
    static Scanner sc = new Scanner(System.in);

    /**
     *
     */
    int absences,

    /**
     *
     */
    overtimeHours;

    /**
     *
     */
    boolean found;

    /**
     *
     */
    List<AttendanceRecord> attendanceset = new ArrayList<>();

    /**
     *
     */
    AttendanceRecord attendanceRecord = new AttendanceRecord(100, "01/05/2023", 9, 5, 0, 0);

    /**
     *
     */
    public AttendanceRecordService() {
        attendanceset.add(attendanceRecord);

    }

    //view all employees attendance

    /**
     *
     */
    public void viewAllEmpAttendance() {
        System.out.println("Attendance Details :");
        for (AttendanceRecord attendanceRecord : attendanceset) {
            System.out.println(attendanceRecord);
        }
        System.out.println("-----------------------------");
    }

    //view emp attendance by emp id

    /**
     *
     */
    public void viewEmpAttendance() {
        System.out.println("Enter Employee id: ");
        int empId = sc.nextInt();
        for (AttendanceRecord attendanceRecord : attendanceset) {
            if (attendanceRecord.getEmpId() == empId) {
                System.out.println(attendanceRecord);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Employee with this id is don't have any Leave Request.");
        }
    }

    //create leaveRequest

    /**
     *
     */
    public void attendanceRecord() {

        System.out.println("Enter Employee id:");
        int empId = sc.nextInt();
        System.out.println("Enter Date:");
        String date = sc.next();
        System.out.println("Enter Arrival time:");
        int arrivalTime = sc.nextInt();
        System.out.println("Enter Departure time");
        int departureTime = sc.nextInt();

        if (departureTime >= 5 && arrivalTime == 9) {
            absences = 0;
            if (departureTime > 5) {
                overtimeHours = 1;
            }
        }

        AttendanceRecord attendanceRecord = new AttendanceRecord(empId, date, arrivalTime, departureTime, absences, overtimeHours);

        attendanceset.add(attendanceRecord);
        System.out.println(attendanceRecord);
        System.out.println("Attendance Record created successsfully.......");

    }

}
