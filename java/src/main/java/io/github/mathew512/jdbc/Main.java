package io.github.mathew512.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "myuser";
    private static final String PASSWORD = "mypassword";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to MySQL ✅");

            Statement stmt = conn.createStatement();

            // --- CREATE (INSERT) ---
            stmt.executeUpdate("INSERT INTO users (name, email, age) VALUES ('John', 'john@gmail.com', 30)");
            stmt.executeUpdate("INSERT INTO users (name, email, age) VALUES ('Jane', 'jane@gmail.com', 28)");
            System.out.println("Inserted 2 users");

            // --- READ (SELECT) ---
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            System.out.println("\nCurrent Users:");
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Email: %s, Age: %d\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"));
            }

            // --- UPDATE ---
            stmt.executeUpdate("UPDATE users SET age = 29 WHERE name = 'Jane'");
            System.out.println("\nUpdated Jane's age to 29");

            // --- DELETE ---
            stmt.executeUpdate("DELETE FROM users WHERE name = 'John'");
            System.out.println("Deleted user John");

            // --- READ AGAIN ---
            rs = stmt.executeQuery("SELECT * FROM users");
            System.out.println("\nUsers after update and delete:");
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Email: %s, Age: %d\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}