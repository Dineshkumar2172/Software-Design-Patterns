package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithStrategyPattern;

public class DebitCard implements PaymentStrategy{
    public void processPayment(){
        System.out.println("Making payment via DebitCard");
    }
}
