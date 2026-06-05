/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author wrs
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {
    
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());
            
            statement.executeUpdate();
            
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int mark = resultSet.getInt("mark");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Mark: " + mark);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
