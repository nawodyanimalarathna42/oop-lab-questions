/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author wrs
 */
public class ProductBillTest {
    public static void main(String[] args) {
        // Create one ProductBill object with valid price text and invalid quantity text
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            // Call calculateTotal() inside a try block
            double totalBill = bill.calculateTotal();
            System.out.println("Total Bill: " + totalBill);
        } 
        catch (NumberFormatException e) {
            /* * Part C: Short Comment
             * The NumberFormatException occurs because the program attempts to convert the 
             * invalid alphanumeric string "two" into an integer using Integer.parseInt() 
             * inside the calculateTotal() method, which is not a valid numerical format.
             */
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        // Finally block to run after try-catch completion
        finally {
            System.out.println("Product bill calculation completed.");
        }

        // Print statement after the try-catch-finally block to show the program continues
        System.out.println("Program continues...");
    }
}
