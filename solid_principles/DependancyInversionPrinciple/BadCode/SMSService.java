package solid_principles.DependancyInversionPrinciple.BadCode;

public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending message : " + message);
    }
}
