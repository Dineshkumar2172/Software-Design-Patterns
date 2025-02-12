package solid_principles.OpenClosedPrinciple.GoodCode;

public class PayPal implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Making payment via PayPal : " + amount);
    }
}
