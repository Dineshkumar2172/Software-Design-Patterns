package solid_principles.OpenClosedPrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCard(), 100);

        // now, if I want to add a new method of payment called UPI, I just need to add a new class called UPI which implements PaymentMethod.
        // PaymentProcessor will support this new method without having to make any changes specific to this new payment method.
        paymentProcessor.processPayment(new UPI(), 1000);
    }
}
