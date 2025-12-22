package Main.lesson7;

public class SmsService implements NotificationService {
    public void sendMessage(String message){
        System.out.println("SMS göndərildi: " + message);
    }
}
