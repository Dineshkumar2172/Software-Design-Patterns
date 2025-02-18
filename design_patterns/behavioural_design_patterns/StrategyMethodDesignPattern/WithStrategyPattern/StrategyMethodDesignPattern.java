package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithStrategyPattern;

public class StrategyMethodDesignPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();
    }
}
