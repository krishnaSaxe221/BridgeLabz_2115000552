class BankAccountDetails{
    private static String bankName = "SBI bank";
    private static int totalAccounts = 10;

    //instance variable
    private String accountHolderName;
    private final int accountNumber;
    private  double balance;

    //constructor
    public BankAccountDetails(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details with instanceof check
    public void displayAccountDetails() {
        if (this instanceof BankAccountDetails) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: " + this.balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

}
public class BankAccount {
    public static void main(String[] args) {
        BankAccountDetails acc1 = new BankAccountDetails("krishna", 1001, 5000.0);
        BankAccountDetails acc2 = new BankAccountDetails("saxena", 1002, 7000.0);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccountDetails.getTotalAccounts(); // Display total accounts

    }
}
