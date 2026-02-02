package interfaces;

public class UPIPayment implements PaymentServer{
    
    public void processPayment(double amount) {
        System.out.println("In UPI Card Payment");
    }

}
