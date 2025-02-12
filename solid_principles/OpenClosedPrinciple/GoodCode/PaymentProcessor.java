package solid_principles.OpenClosedPrinciple.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount); // runtime polymorphism
    }
}
