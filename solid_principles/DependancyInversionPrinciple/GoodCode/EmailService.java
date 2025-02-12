package solid_principles.DependancyInversionPrinciple.GoodCode;

public class EmailService implements NotificationChannel{
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}
