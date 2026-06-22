interface Notification {
    void sendNotification(String message);
}
class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message){
        System.out.println("Email Sent: " + message);
    }
}
class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message){
        System.out.println("SMS Sent: " + message);
    }
}
public class Notifications{
    public static void main(String[] args){
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.sendNotification("Exam Schedule Released");
        sms.sendNotification("Fee Payment Reminder");

    }
}
