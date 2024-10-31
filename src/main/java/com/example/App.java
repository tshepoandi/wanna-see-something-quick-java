package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

  public static void main(String[] args) {
    // Database URL, username, and password
    String url = "jdbc:postgresql://localhost:5432/wannaseesomething"; // Change to your database URL
    String user = "admin"; // Change to your username
    String password = "admin123"; // Change to your password

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      if (conn != null) {
        System.out.println("Connected to the database.");
      }
    } catch (SQLException e) {
      System.out.println("Connection failed: " + e.getMessage());
    }
  }
}
// "Host=localhost;Port=5432;Database=event-db;Username=admin;Password=admin123"
