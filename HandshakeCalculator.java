import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.printf("The maximum number of possible handshakes among %d students is %d.%n", numberOfStudents, handshakes);

        scanner.close();
    }
}
