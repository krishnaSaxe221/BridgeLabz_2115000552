// Parent class: BankAccount
class BankAccount {
    public String accountNumber; // public attribute
    protected String accountHolder; // protected attribute
    private double balance; // private attribute

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to access the balance
    public double getBalance() {
        return this.balance;
    }

    // Method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to access accountNumber and accountHolder
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Test the implementation
public class BAccounts {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "John Smith", 5000.00);

        // Display account details
        savingsAccount.displayAccountInfo();

        // Access and modify balance
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.setBalance(6000.00);  // Modify balance
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}

