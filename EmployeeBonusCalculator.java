import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = new double[employees][2]; // [Salary, Years of Service]
        double[][] newEmployeeData = new double[employees][2]; // [New Salary, Bonus]

        generateEmployeeData(employeeData);
        calculateNewSalaryAndBonus(employeeData, newEmployeeData);
        displayResults(employeeData, newEmployeeData);
    }

    // Generate random salary (5-digit) and years of service
    public static void generateEmployeeData(double[][] data) {
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Salary between 10000 - 99999
            data[i][1] = rand.nextInt(11); // Years of service between 0 - 10
        }
    }

    // Calculate new salary and bonus
    public static void calculateNewSalaryAndBonus(double[][] oldData, double[][] newData) {
        for (int i = 0; i < oldData.length; i++) {
            double salary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }
    }

    // Display results in a tabular format
    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15s %-15s %-15s %-10s%n", "ID", "Old Salary", "Years of Service", "Bonus", "New Salary", "Bonus %");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            double bonusPercent = (years > 5) ? 5 : 2;
        }}}


