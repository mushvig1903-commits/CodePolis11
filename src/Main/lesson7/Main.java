package Main.lesson7;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mushvig");
        User user1 = new User("Elmar");
        NotificationService emailService = new EmailService();
        NotificationService smsService = new SmsService();
        user.sendNotification(emailService, "Layhiə uğurlu oldu!");
        user.sendNotification(smsService, "Sizə SMS göndərildi");
    }
}
