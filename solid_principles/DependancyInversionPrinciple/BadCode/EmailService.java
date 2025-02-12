package solid_principles.DependancyInversionPrinciple.BadCode;

public class EmailService {
    public void sendEmail(String message){
        System.out.println("Send email : " + message);
    }
}
