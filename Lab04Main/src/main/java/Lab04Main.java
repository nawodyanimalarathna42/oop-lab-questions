/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wrs
 */
public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        Lecturer lecturer1 = new Lecturer("Amal Perera", "L001", "Computer Science", 3, 50000.0);
        Lecturer lecturer2 = new Lecturer("Sunil Shantha", "L003", "Engineering", 2, 45000.0);
        LabAssistant assistant = new LabAssistant("Amali Nayana", "A002", "IT Department", 40, 1500.0);
        
        lecturer1.changeDepartment("Faculty of Computing");
        
        System.out.println("\n--- All Staff Details ---");
        
        StaffMember[] staffList = {lecturer1, lecturer2, assistant};
        double totalMonthlyPayment = 0;
        for (StaffMember staff : staffList) {
        if (staff instanceof Lecturer) {
                ((Lecturer) staff).displayLecturerDetails();
            } else if (staff instanceof LabAssistant) {
                ((LabAssistant) staff).displayLabAssistantDetails();
            }
        double payment = staff.calculateMonthlyPayment();
            System.out.println("Monthly Payment: " + payment);
            totalMonthlyPayment += payment;
            
            staff.showCommonNotice();
            System.out.println("------------------------");
        }
        System.out.println("Total Monthly Payment for all staff: " + totalMonthlyPayment);
        System.out.println("\nTotal Staff Members Created: " + StaffMember.getStaffCount());
    }
    }
   
    
