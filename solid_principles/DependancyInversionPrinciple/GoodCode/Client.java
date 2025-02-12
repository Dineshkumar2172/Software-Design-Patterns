package solid_principles.DependancyInversionPrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService(new SMSService());
        NotificationService notificationService2 = new NotificationService(new EmailService());

        notificationService.notify("hello everyone");
        notificationService2.notify("hello everyone");

    }
}
