import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        int math = sc.nextInt();

        // Compute total and average
        int totalMarks = physics + chemistry + math;
        double averageMarks = totalMarks / 3.0;

        // Compute grade and remarks
        String grade, remarks;
        if (averageMarks >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMarks >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMarks >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averageMarks >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMarks >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "F";
            remarks = "Remedial standards";
        }

        // Output results
        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
