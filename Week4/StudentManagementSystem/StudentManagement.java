package week4.StudentManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("\n1.Add Student");
            System.out.println("2.Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.View Students");
            System.out.println("5.Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    viewStudents();
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);
    }

    static void addStudent() {

        try {
            Connection con = DBConnection.getConnection();
            System.out.print("ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Department : ");
            String dept = sc.nextLine();

            System.out.print("Age : ");
            int age = sc.nextInt();

            String sql = "INSERT INTO students VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,dept);
            ps.setInt(4,age);

            ps.executeUpdate();

            System.out.println("Student Added");

            con.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void updateStudent() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("New Name : ");
            String name = sc.nextLine();

            String sql = "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,name);
            ps.setInt(2,id);

            ps.executeUpdate();

            System.out.println("Updated Successfully");

            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void deleteStudent() {

        try {
            Connection con = DBConnection.getConnection();
            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Deleted Successfully");
            con.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void viewStudents() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            System.out.println("\nID\tName\tDepartment\tAge");

            while(rs.next()) {
                System.out.println(
                        rs.getInt("id")+"   "+
                        rs.getString("name")+"   "+
                        rs.getString("department")+"   "+
                        rs.getInt("age")
                );
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
