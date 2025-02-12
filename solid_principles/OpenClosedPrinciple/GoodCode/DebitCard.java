package solid_principles.OpenClosedPrinciple.GoodCode;

public class DebitCard implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Making payment via DebitCard : " + amount);
    }
}
