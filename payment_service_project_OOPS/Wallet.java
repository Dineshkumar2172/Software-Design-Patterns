package payment_service_project_OOPS;

public class Wallet implements PaymentMethod{
    
    String walletType;

    public Wallet(String walletType){
        this.walletType = walletType;
    }

    public void pay(){
        System.out.println("making payment via wallet " + walletType);
    }
}
