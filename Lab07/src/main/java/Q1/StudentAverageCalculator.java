/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author wrs
 */
public class StudentAverageCalculator {
    // Private attributes as required
    private int totalMarks;
    private int numberOfStudents;

    // Constructor to initialize both values
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method that calculates and returns the average using integer division
    public int calculateAverage() {
        // Do not handle the exception inside this class
        return totalMarks / numberOfStudents;
    }
}
