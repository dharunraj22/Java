package practice;

import java.util.concurrent.atomic.AtomicInteger;

public final class BankAccount {

    private final String accountNumber; // immutable
    private final String holderName;    // immutable
    private final AtomicInteger balance; // thread-safe

    private static final int MAX_AMOUNT = 10000;

    public BankAccount(String accountNumber, String holderName, int initialBalance) {
        if (accountNumber == null || accountNumber.isEmpty())
            throw new IllegalArgumentException("Account number cannot be null or empty");
        if (holderName == null || holderName.isEmpty())
            throw new IllegalArgumentException("Holder name cannot be null or empty");
        if (initialBalance < 0 || initialBalance > MAX_AMOUNT)
            throw new IllegalArgumentException("Initial balance must be between 0 and " + MAX_AMOUNT);

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = new AtomicInteger(initialBalance);
    }

    public int getBalance() {
        return balance.get(); // atomic, always up-to-date
    }

    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");

        balance.updateAndGet(curr -> {
            if (curr + amount > MAX_AMOUNT)
                throw new IllegalArgumentException("Balance cannot exceed " + MAX_AMOUNT);
            return curr + amount;
        });
    }

    public void withdraw(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");

        balance.updateAndGet(curr -> {
            if (curr - amount < 0)
                throw new IllegalArgumentException("Insufficient balance");
            return curr - amount;
        });
    }

    @Override
    public String toString() {
        String maskedAcc = "*****" + accountNumber.substring(Math.max(0, accountNumber.length() - 4));
        return String.format("Account Number: %s%nHolder Name: %s%nAvailable Balance: %d",
                             maskedAcc, holderName, balance.get());
    }
}
