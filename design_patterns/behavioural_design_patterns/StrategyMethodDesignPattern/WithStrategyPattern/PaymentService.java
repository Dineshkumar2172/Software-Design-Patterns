package design_patterns.behavioural_design_patterns.StrategyMethodDesignPattern.WithStrategyPattern;

public class PaymentService {
    
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.processPayment();
    }
}
