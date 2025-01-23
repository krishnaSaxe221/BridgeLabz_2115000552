public class DiscountCalculator {
    public static void main(String[] args) {
        // Define variables
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate discounted fee
        double discountedFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }

}
