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
        Lecturer lecturer = new Lecturer("Amal perera", "L001", "Computer Science", 3, 50000.0);
        LabAssistant assistant = new LabAssistant("Amali nayana", "A002", "IT Department", 40, 1500.0);
        
        System.out.println("--- Lecturer Details ---");
        lecturer.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer.calculateMonthlyPayment());
        
        System.out.println("\n--- Lab Assistant Details ---");
        assistant.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + assistant.calculateMonthlyPayment());
    }
    }
