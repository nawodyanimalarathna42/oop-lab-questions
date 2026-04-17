/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wrs
 */
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Global University";
    public static final double BONUS_RATE = 0.1;

    // A final class should not be inherited to prevent overriding its core rules or logic.
    
    public static void showPolicyHeader() {
        System.out.println("--- University Payment Policy ---");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
