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
        
        System.out.println("\n--- Lecturer 1 Details ---");
        lecturer1.displayLecturerDetails();
        double lec1Payment = lecturer1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + lec1Payment);
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(lec1Payment));
        
        System.out.println("\n--- Lab Assistant Details ---");
        assistant.displayLabAssistantDetails();
        double asstPayment = assistant.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + asstPayment);
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(asstPayment));
        
        System.out.println("\nTotal Staff Members Created: " + StaffMember.getStaffCount());
    }
    }
    
    
