/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author wrs
 */
public class StudentMarkReport {
    // Private array attribute as required
    private String[] marks;

    // Constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get a mark at a specific index and convert it to an int
    public int getMarkAt(int index) {
        // Access the mark from the array using the given index
        String selectedMarkText = marks[index];
        
        // Convert the selected text mark and return it
        return Integer.parseInt(selectedMarkText); // Do not handle exceptions inside this class
    }
}
