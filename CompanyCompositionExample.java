import java.util.ArrayList;
import java.util.List;

// Employee Class (Belongs to a Department)
class Employee {
    String name;
    String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Display Employee Details
    void displayEmployee() {
        System.out.println("  Employee: " + name + ", Position: " + position);
    }
}

// Department Class (Belongs to a Company, Cannot Exist Without It)
class Department {
    String deptName;
    List<Employee> employees; // Composition: Department contains Employees

    // Constructor
    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    // Add Employee to the Department
    void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    // Display Department and Employees
    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

// Company Class (Owns Departments, Deleting Company Deletes All)
class Company {
    String companyName;
    List<Department> departments; // Composition: Company contains Departments

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add a Department to the Company
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Get a Department by Name
    Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.deptName.equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    // Display Company, Departments, and Employees
    void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

// Driver Class
public class CompanyCompositionExample {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Add Departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add Employees to Departments
        company.getDepartment("IT").addEmployee("Alice", "Software Engineer");
        company.getDepartment("IT").addEmployee("Bob", "System Analyst");

        company.getDepartment("HR").addEmployee("Charlie", "HR Manager");
        company.getDepartment("HR").addEmployee("David", "Recruiter");

        // Display Company Structure
        company.displayCompany();

        // Deleting the Company (Implied, since Java handles garbage collection)
        company = null;  // All Departments and Employees are also removed
    }
}

