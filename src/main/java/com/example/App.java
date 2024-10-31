package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

  public static void main(String[] args) {
    // Database URL, username, and password
    String url = "jdbc:postgresql://localhost:5432/testdb"; // Change to your database URL
    String user = "postgres"; // Change to your username
    String password = "your_password"; // Change to your password

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      if (conn != null) {
        System.out.println("Connected to the database.");
      }
    } catch (SQLException e) {
      System.out.println("Connection failed: " + e.getMessage());
    }
  }
}
