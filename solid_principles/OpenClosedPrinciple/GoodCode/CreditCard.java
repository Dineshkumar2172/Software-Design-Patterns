package solid_principles.OpenClosedPrinciple.GoodCode;

public class CreditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Making payment via CreditCard : " + amount);
    }
}
