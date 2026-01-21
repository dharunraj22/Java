package oops;

class Bank {

    private int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Balance is " + balance);
    }

}

public class Encapsulation {

    public static void main (String[] args) {
        Bank myBank = new Bank(10);
        myBank.getBalance();
    }

}
