package solid_principles.OpenClosedPrinciple.BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount){
        if (paymentMethod.equals("CreditCard")) {
            // business logic comes here
            System.out.println("Making payment via Credit Card : " + amount);
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via DebitCard : " + amount);
        } else if (paymentMethod.equals("PayPal")) {
            System.out.println("Making payment via PayPal : " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}
