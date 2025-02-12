package solid_principles.OpenClosedPrinciple.GoodCode;

public class UPI implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Making payment via UPI : " + amount);
    }
}
