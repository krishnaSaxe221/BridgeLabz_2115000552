public class ProfitAndLoss {
    public static void main(String[] args) {
        // Input values
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculations
        int profit = sellingPrice - costPrice;
        double profitPercentage = ((double) profit / costPrice) * 100;

        // Output using a single print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }

}
