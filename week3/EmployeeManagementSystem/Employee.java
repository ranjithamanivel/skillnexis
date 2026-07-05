package week3.EmployeeManagementSystem;

public class Employee {
     private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + "," + name + "," + department + "," + salary;
    }

     public static Employee fromString(String line) {
        String[] data = line.split(",");
        return new Employee(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                Double.parseDouble(data[3]));
    }

    public void display() {
        System.out.println(id + " " + name + " " + department + " " + salary);
    }
}
