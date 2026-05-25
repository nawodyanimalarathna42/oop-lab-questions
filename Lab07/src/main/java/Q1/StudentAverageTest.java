/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author wrs
 */
public class StudentAverageTest {
    public static void main(String[] args) {
        // Create one StudentAverageCalculator object with 0 as the number of students
        StudentAverageCalculator calculator = new StudentAverageCalculator(450, 0);

        try {
            // Call calculateAverage() inside a try block
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } 
        catch (ArithmeticException e) {
            /* * Part C: Short Comment
             * The ArithmeticException occurs because the program attempts integer division by zero 
             * (totalMarks / 0) inside the calculateAverage() method, which is mathematically 
             * undefined and an illegal operation in Java.
             */
            System.out.println("Error: Number of students cannot be zero.");
        } 
        // Finally block for completion message
        finally {
            System.out.println("Average calculation completed.");
        }

        // Statement after the try-catch-finally block to show the program continues
        System.out.println("Program continues...");
    }
}
