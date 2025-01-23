public class PenDistribution {
    public static void main(String[] args) {
        // Input values
        int totalPens = 14;
        int students = 3;
        // Calculations
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }

}
