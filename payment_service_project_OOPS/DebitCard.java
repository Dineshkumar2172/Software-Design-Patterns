package payment_service_project_OOPS;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String userName){
        super(cardNo, userName); // super can be used to invoke parent class's constructor
    }

    public void pay() {
        System.out.println("Making payment via Debitcard");
    }
}
