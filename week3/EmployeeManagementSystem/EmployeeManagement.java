package week3.EmployeeManagementSystem;

import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save to File");
            System.out.println("4. Load from File");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch(choice) {

                    case 1:
                        addEmployee();
                        break;

                    case 2:
                        displayEmployees();
                        break;

                    case 3:
                        saveToFile();
                        break;

                    case 4:
                        loadFromFile();
                        break;

                    case 5:
                        System.out.println("Thank You");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch(NumberFormatException e) {
                System.out.println("Enter numbers only.");
                choice = 0;
            }

        } while(choice != 5);
    }

    static void addEmployee() {

        try {

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            employees.add(new Employee(id, name, dept, salary));

            System.out.println("Employee Added.");

        } catch(Exception e) {
            System.out.println("Invalid Input.");
        }
    }

    static void displayEmployees() {

        if(employees.isEmpty()) {
            System.out.println("No Employees.");
            return;
        }

        for(Employee emp : employees)
            emp.display();
    }

    static void saveToFile() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("employees.txt"));

            for(Employee emp : employees) {
                bw.write(emp.toString());
                bw.newLine();
            }

            bw.close();

            System.out.println("Saved Successfully.");

        } catch(IOException e) {
            System.out.println("Error Saving File.");
        }
    }

    static void loadFromFile() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("employees.txt"));

            employees.clear();

            String line;

            while((line = br.readLine()) != null) {
                employees.add(Employee.fromString(line));
            }

            br.close();

            System.out.println("Data Loaded.");

        } catch(IOException e) {
            System.out.println("File Not Found.");
        }
    }
}
