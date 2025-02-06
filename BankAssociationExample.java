import java.util.ArrayList;
import java.util.List;

// Bank Class
class Bank {
    String name;
    List<Customer> customers;  // Bank has multiple Customers

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Open an account for a customer
    public void openAccount(Customer customer, String accountType, double initialBalance) {
        Account newAccount = new Account(this, accountType, initialBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.name + " at " + this.name);
    }

    // Display all customers of the bank
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

// Customer Class
class Customer {
    String name;
    List<Account> accounts;  // Customer has multiple accounts

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View all accounts and balances
    public void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account acc : accounts) {
            System.out.println("- " + acc.accountType + " at " + acc.bank.name + ": $" + acc.balance);
        }
    }
}

// Account Class (Association with Bank and Customer)
class Account {
    Bank bank;
    String accountType;
    double balance;

    // Constructor
    public Account(Bank bank, String accountType, double balance) {
        this.bank = bank;
        this.accountType = accountType;
        this.balance = balance;
    }
}

// Driver Class
public class BankAssociationExample {
    public static void main(String[] args) {
        // Create Banks
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        // Create Customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open Accounts
        bank1.openAccount(customer1, "Savings", 1000);
        bank1.openAccount(customer1, "Checking", 500);
        bank2.openAccount(customer2, "Savings", 2000);
        bank1.openAccount(customer2, "Checking", 800);

        // View customer balances
        customer1.viewBalance();
        customer2.viewBalance();

        // Display Bank Customers
        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}

