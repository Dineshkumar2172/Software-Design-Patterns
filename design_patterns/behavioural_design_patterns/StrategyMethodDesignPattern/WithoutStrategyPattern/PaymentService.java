package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithoutStrategyPattern;

public class PaymentService {
    public void processPayment(String paymentMethod){
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via CreditCard");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via DebitCard");
        } else {
            System.out.println("Unsupported payment method");
        }
    }
}
