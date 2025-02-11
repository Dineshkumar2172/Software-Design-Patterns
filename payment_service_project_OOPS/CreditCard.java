package payment_service_project_OOPS;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String userName){
        super(cardNo, userName);
    }

    public void pay() {
        System.out.println("Making payment via credit card");
    }

}
