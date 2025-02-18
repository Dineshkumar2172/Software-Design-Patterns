package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithStrategyPattern;

public class CreditCard implements PaymentStrategy{
    public void processPayment(){
        System.out.println("Making payment via CreditCard");
    }
}
