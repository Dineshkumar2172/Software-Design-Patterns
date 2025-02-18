package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("DebitCard");
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("UPI"); // in order to add new method, we need to add one more else if block

        // In order to support new payment method, we have to modify existing payment service
        // which violates Open-Closed principle and also increase the code complexity by adding too many if conditions. 
    }
}
