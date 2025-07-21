############################# VIOLATION DESIGN #############################
# depend on abstraction, not on concretions

class EmailService:
    def send_email(self, message, receiver):
        self.message = message
        self.receiver = receiver

class SmsService:
    def send_sms(self, message, receiver):
        self.message = message
        self.receiver = receiver

class NotificationService:
    def __init__(self):
        self.email_service = EmailService()
        self.sms_service = SmsService()
    
    def send_notification(self, message, receiver, method):
        if method == "sms":
            self.sms_service.send_sms(message, receiver)
        elif method == "email":
            self.email_service.send_email(message, receiver)

############################# SOLUTION #############################

from abc import ABC, abstractmethod

class INotificationService(ABC):
    @abstractmethod
    def notify(self, messsage, receiver): pass

class EmailService2(INotificationService):
    def notify(self, message, receiver):
        print(f"Sending email: {message} to {receiver}")

class SmsService2(INotificationService):
    def notify(self, message, receiver):
        print(f"Sending sms: {message} to {receiver}")

class NotificationService2:
    def __init__(self, message_service: INotificationService):
        self.message_service = message_service

    def send_notification(self, message, receiver):
        self.message_service.notify(message, receiver)

# In the refactored solution, we introduce an abstract class INotificationService with an abstract method send().
# Both the EmailService and SmsService now implement the INotificationService interface.
# The NotificationService class now depends on the abstraction INotificationService instead of concrete classes EmailService and SmsService
# This adheres to the DIP because both high-level and low-level classes depend on abstractions rather than concrete implementations, making the code
# more flexible and easier to change or extend.
