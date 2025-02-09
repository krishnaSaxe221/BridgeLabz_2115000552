// Base class BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit + " per day");
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int termPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int termPeriod) {
        super(accountNumber, balance);
        this.termPeriod = termPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term Period: " + termPeriod + " months");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        BankAccount checking = new CheckingAccount("CA67890", 3000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD54321", 10000, 12);

        savings.displayDetails();
        savings.displayAccountType();
        System.out.println();

        checking.displayDetails();
        checking.displayAccountType();
        System.out.println();

        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}

