 abstract public class BankAccount {
    private String accountNumber;
    private double balance;
    private String holderName;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private String accounttype;
    private double interestRate;

    SavingsAccount(String accountnumber, String holdername, double balance, double interestRate) {
        super(accountnumber, holdername, balance);
        this.accounttype = "savings";
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

class CurrentAccount extends BankAccount {
    String accounttype;

    public CurrentAccount(String accountnumber, String holdername, double balance) {
        super(accountnumber, holdername, balance);
        this.accounttype = "current";
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts typically do not earn interest
    }
}
class Bankdemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1000.0, 0.05);
        CurrentAccount currentAccount = new CurrentAccount("CA456", "Jane Smith", 2000.0);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        savingsAccount.deposit(500);
        currentAccount.withdraw(300);

        System.out.println("Savings Account Balance after deposit: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance after withdrawal: " + currentAccount.getBalance());

        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());
    }
}