package payment_service_project_OOPS;

public class UPI implements PaymentMethod{

    String upiId;

    public UPI(String upiId){
        this.upiId = upiId;
    }
    
    public void pay(){
        System.out.println("making payment via UPI " + upiId);
    }
}
