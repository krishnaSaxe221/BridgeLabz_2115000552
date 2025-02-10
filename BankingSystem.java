import java.util.*;

// Abstract BankAccount class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public abstract double calculateInterest();
}

// Interface for Loanable
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% interest
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2 + overdraftLimit;
    }
}

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount acc1 = new SavingsAccount("SA12345", "Alice", 5000);
        CurrentAccount acc2 = new CurrentAccount("CA67890", "Bob", 10000, 5000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest Earned: " + account.calculateInterest());

            if (account instanceof Loanable) {
                System.out.println("Loan Eligibility: " + ((Loanable) account).calculateLoanEligibility());
            }
            System.out.println("----------------");
        }
    }
}

