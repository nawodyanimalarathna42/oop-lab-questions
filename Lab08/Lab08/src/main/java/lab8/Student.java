/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author wrs
 */

public class Student {
    private int studentId;
    private String studentName;
    private int mark;

    // Constructor
    public Student(int studentId, String studentName, int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMark() {
        return mark;
    }
}
