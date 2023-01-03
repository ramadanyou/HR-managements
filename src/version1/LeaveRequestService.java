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
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Name
 */
public class LeaveRequestService {

    /**
     *
     */
    private static boolean approved = false;

    /**
     *
     */
    static boolean found;

    /**
     *
     */
    static Scanner sc = new Scanner(System.in);

    /**
     *
     */
    List<LeaveRequest> leaveset = new ArrayList<>();

    /**
     *
     */
    LeaveRequest annualLeave = new LeaveRequest(100, "01/02/2023", "04/02/2023", "Annual Leave", "Vacation", true);

    /**
     *
     */
    public LeaveRequestService() {
        leaveset.add(annualLeave);
    }

    //view all employees leaveRequest

    /**
     *
     */
    public void viewAllEmpLeaveRequests() {
        System.out.println("Leave Details :");
        for (LeaveRequest leaveRequest : leaveset) {
            System.out.println(leaveRequest);
        }
        System.out.println("-----------------------------");
    }

    //view emp leave request by emp id

    /**
     *
     */
    public void viewEmpLeaveRequest() {
        System.out.println("Enter Employee id: ");
        int empId = sc.nextInt();
        for (LeaveRequest leaveRequest : leaveset) {
            if (leaveRequest.getEmpId() == empId) {
                System.out.println(leaveRequest);
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
     * @throws ParseException
     */
    public void leaveRequest() throws ParseException {

        System.out.println("Enter Employee id:");
        int empId = sc.nextInt();
        System.out.println("Enter leave Start Date:");
        String startDateStr = sc.next();
        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDateStr);
        System.out.println("Enter leave Start Date:");
        String endDateStr = sc.next();
        Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDateStr);
        System.out.println("Enter leave Type(eg. Vacation, Annual Leave, etc):");
        String type = sc.next();
        System.out.println("Enter leave Reason");
        String reason = sc.next();

        // get the number of milliseconds between the two dates
        long diffInMilliseconds = endDate.getTime() - startDate.getTime();

        // convert the result to days by dividing by the number of milliseconds in a day
        long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);

        // Leave is automatically will get approved if the number of days is less than or equal to 3
        if (diffInDays <= 3) {
            approved = true;
        }

        LeaveRequest leaveRequest = new LeaveRequest(empId, startDateStr, endDateStr, type, reason, approved);

        leaveset.add(leaveRequest);
        System.out.println(leaveRequest);
        System.out.println("Leave Request created successsfully.......");

    }

}
