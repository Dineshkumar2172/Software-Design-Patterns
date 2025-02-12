package solid_principles.DependancyInversionPrinciple.GoodCode;

public class SMSService implements NotificationChannel{
    public void send(String message) {
        System.out.println("Sending SMS : " + message);
    }
}
