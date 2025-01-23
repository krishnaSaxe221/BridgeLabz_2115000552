import java.util.Scanner;
public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the total fee
        System.out.print("Enter the total fee (INR): ");
        double fee = input.nextDouble();

        // Prompt user to enter the discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.printf("The discount amount is INR %.2f and the final discounted fee is INR %.2f.%n", discount, finalFee);

        // Close the scanner
        input.close();
    }

}
