// Parent class: Employee
class Employee {
    public String employeeID; // public attribute
    protected String department; // protected attribute
    private double salary; // private attribute

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void modifySalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to get the salary
    public double getSalary() {
        return this.salary;
    }
}

// Subclass: Manager
 class Manager extends Employee {

    // Constructor
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to access employeeID and department
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Test the implementation
public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager("E123", "Sales", 75000.00);

        // Display employee details
        manager.displayEmployeeInfo();

        // Modify and access salary
        System.out.println("Current Salary: " + manager.getSalary());
        manager.modifySalary(80000.00);  // Modify salary
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}

