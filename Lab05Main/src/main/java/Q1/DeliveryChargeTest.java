/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author wrs
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        // Testing the overloaded methods
        double test1 = calculator.calculateCharge(500.0);
        double test2 = calculator.calculateCharge(500.0, 10.0);
        double test3 = calculator.calculateCharge(500.0, 10.0, 2.5);
        double test4 = calculator.calculateCharge(500.0, true);

        // Printing results
        System.out.println("Test 1 (Base Only): " + test1);
        System.out.println("Test 2 (Base + 10km Distance): " + test2);
        System.out.println("Test 3 (Base + 10km + 2.5kg Weight): " + test3);
        System.out.println("Test 4 (Base + Express Delivery): " + test4);

        /* 
         * Comment: This is compile-time polymorphism because the compiler 
         * knows exactly which 'calculateCharge' method to call based on 
         * the number and type of arguments provided during compilation.
         */
    }
}
