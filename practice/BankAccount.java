package practice;

public class BankAccount {
    
    private static final int MAX_AMOUNT=10000;

    private final String accountNumber;
    private final String holderName;
    private int balance;

    public BankAccount(String accountNumber, String holderName, int balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (holderName == null || holderName.isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be empty");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount should be positive");
        }
        if (this.balance + amount > MAX_AMOUNT) {
            System.out.println();
            throw new IllegalArgumentException("Balance will exceed the maximum amount of " + MAX_AMOUNT);
        }
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        if (this.balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
    }
}
