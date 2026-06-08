/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasktracker;

/**
 *
 * @author wrs
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDAO {

    // Add Task Logic
    public void addTask(Task task) throws SQLException {
        String sql = "INSERT INTO tasks (task_id, task_title, status) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, task.getTaskId());
            stmt.setString(2, task.getTaskTitle());
            stmt.setString(3, task.getStatus());
            stmt.executeUpdate();
        }
    }

    // Search Task Logic
    public Task findTaskById(int taskId) throws SQLException {
        String sql = "SELECT * FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, taskId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Task(
                        rs.getInt("task_id"),
                        rs.getString("task_title"),
                        rs.getString("status")
                    );
                }
            }
        }
        return null;
    }

    // Update Task Logic
    public boolean updateTask(Task task) throws SQLException {
        String sql = "UPDATE tasks SET task_title = ?, status = ? WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, task.getTaskTitle());
            stmt.setString(2, task.getStatus());
            stmt.setInt(3, task.getTaskId());
            return stmt.executeUpdate() > 0;
        }
    }

    // Delete Task Logic
    public boolean deleteTask(int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, taskId);
            return stmt.executeUpdate() > 0;
        }
    }
}
