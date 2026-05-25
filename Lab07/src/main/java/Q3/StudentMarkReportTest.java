/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author wrs
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        // String array containing both valid numbers and an invalid string text
        String[] marks = {"78", "82", "absent", "90"};
        
        // Create a StudentMarkReport object
        StudentMarkReport report = new StudentMarkReport(marks);

        // --- Part B: Test an Invalid Array Index ---
        try {
            // Call getMarkAt(6) inside a try block (index 6 does not exist)
            int mark = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            /* * Part D: Short Comment 1
             * getMarkAt(6) causes an ArrayIndexOutOfBoundsException because the array 'marks' 
             * only has 4 elements (valid indices 0 to 3). Index 6 is completely outside 
             * the legal bounds of this array.
             */
            System.out.println("Error: Selected mark position does not exist.");
        } 
        finally {
            System.out.println("Array access checking completed.");
        }

        // --- Part C: Test an Invalid Number Format ---
        try {
            // Call getMarkAt(2) inside a second try block (index 2 contains "absent")
            int mark = report.getMarkAt(2);
            System.out.println("Mark at index 2: " + mark);
        } 
        catch (NumberFormatException e) {
            /* * Part D: Short Comment 2
             * getMarkAt(2) causes a NumberFormatException because the element at index 2 
             * is the alphabetical text "absent", which Integer.parseInt() cannot successfully 
             * convert into a valid numerical integer.
             */
            System.out.println("Error: Selected mark is not a valid number.");
        } 
        finally {
            System.out.println("Number conversion checking completed.");
        }

        // Final print message after both try-catch-finally blocks have completed
        System.out.println("Report checking completed.");
    }
}
