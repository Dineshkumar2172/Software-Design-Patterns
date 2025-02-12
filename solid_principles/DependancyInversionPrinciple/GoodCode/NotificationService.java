package solid_principles.DependancyInversionPrinciple.GoodCode;

public class NotificationService {

    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel){
        this.notificationChannel = channel;
    }

    public void notify(String message){
        // incase if user implements new notification service for whatsApp, client don't need
        // to worry about if it has a send methods or not, because it has to since it'll implement a abstraction
        // called NotificationChannel
        notificationChannel.send(message);
    }

}
