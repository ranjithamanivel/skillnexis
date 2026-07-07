package week4.StudentManagementSystem;

import java.sql.*;

public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/stu_db";
    static String user = "root";
    static String password = "Venki@123";  

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Connection Failed");
            return null;
        }
    }
}
