package maang_prep.structural;

// Step 1: Define the Base Component (Interface)
interface Notifier {
    void send(String message);
}

// Step 2: Create a Concrete Component (Base Notifier)
class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Basic notification: " + message);
    }
}

// Step 3: Create an Abstract Decorator Class
abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}

// Step 4: Create Concrete Decorators
// email notifier
class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String message){
        super.send(message);
        System.out.println("Sending email : " + message);
    }
}

// sms notifier
class SMSNotifier extends NotifierDecorator {
    public SMSNotifier (Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Sending message : " + message);
    }
}

// push notification
class PushNotifier extends NotifierDecorator {
    public PushNotifier (Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Sending push notification : " + message);
    }
}

// // Step 5: Use the Decorator Pattern
public class Decorator {
    // A basic Notification Service sends messages. Over time, we need to support Email, SMS, and Push Notifications without modifying existing code.

    // Step 1: Define the Base Component (Interface)
    // Step 2: Create a Concrete Component (Base Notifier)
    // Step 3: Create an Abstract Decorator Class
    // Step 4: Create Concrete Decorators
    // Step 5: Use the Decorator Pattern
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        System.out.println("------ Basic Notification ------");
        notifier.send("hello user!");

        System.out.println("\n------ Email Notification ------");
        notifier = new EmailNotifier(notifier);
        notifier.send("hello user!");

        System.out.println("\n------ SMS & Email Notification ------");
        notifier = new SMSNotifier(notifier);
        notifier.send("hello user!");

        System.out.println("\n------ Push, SMS & Email Notification ------");
        notifier = new PushNotifier(notifier);
        notifier.send("hello user!");
    }
}
