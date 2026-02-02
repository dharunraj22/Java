package interfaces;

public class Main {
    
    public static void main(String[] args) {
        PaymentServer pay = new CreditCardPayment();
        pay.processPayment(500);
        pay = new UPIPayment();
        pay.processPayment(1000);
    }

}
