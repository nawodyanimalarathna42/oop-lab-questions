/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wrs
 */
public abstract class StaffMember {

    private String fullName;
    private final String staffId;
    protected String department;

    private static int staffCount = 0;
    
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }
    public static void showSystemName() {
        System.out.println("System Name: Campus Staff Payment System");
    }
public static int getStaffCount() {
        return staffCount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();

    // This class is abstract because it provides a common structure for all staff types
    // and prevents direct object creation from this class.
}

