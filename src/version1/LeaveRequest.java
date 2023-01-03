/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Name
 */
public class LeaveRequest {
    // Leave request attributes

    /**
     *
     */

    private int empId;

    /**
     *
     */
    private String startDate;

    /**
     *
     */
    private String endDate;

    /**
     *
     */
    private String type;

    /**
     *
     */
    private String reason;

    /**
     *
     */
    private boolean approved;

    // Constructor for leave request

    /**
     *
     * @param empId
     * @param startDate
     * @param endDate
     * @param type
     * @param reason
     * @param approved
     */
    public LeaveRequest(int empId, String startDate, String endDate, String type, String reason, boolean approved) {
        this.empId = empId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.reason = reason;
        this.approved = approved;
    }

    // Methods for accessing leave request attributes

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
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return
     */
    public boolean isApproved() {
        return approved;
    }

    // Methods for approving or denying leave request

    /**
     *
     */
    public void approve() {
        approved = true;
    }

    /**
     *
     */
    public void deny() {
        approved = false;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
              Employee ID: """ + empId + "\nLeave Start Date: " + startDate + "\nLeave End Date: " + endDate
                + "\nLeave Type:" + type + "\nLeave Reason: " + reason + "\nApproved: " + approved;
    }
}
