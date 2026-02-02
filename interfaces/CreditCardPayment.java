package interfaces;

public class CreditCardPayment implements PaymentServer{
    
    public void processPayment(double amount) {
        System.out.println("In Credit Card Payment");
    }

}
