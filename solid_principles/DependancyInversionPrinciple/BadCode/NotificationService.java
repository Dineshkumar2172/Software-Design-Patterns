package solid_principles.DependancyInversionPrinciple.BadCode;

public class NotificationService {

    // here high level module is dependant on low level module - it's a violation of DIP
    // + tight coupling and also both notification services uses different kind of methods to send notifications.
    // if any change in sendEmail or sendSMS will affect the high level module that uses it.
    private SMSService smsService;
    private EmailService emailService;

    public NotificationService(){
        this.smsService = new SMSService();
        this.emailService = new EmailService();
    }

    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }

    public void notifyBySMS(String message) {
        smsService.sendSMS(message);
    }

}
