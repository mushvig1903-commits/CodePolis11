package Main.lesson7;

public class EmailService implements NotificationService{
    public void sendMessage(String message){
        System.out.println("Email göndərildi: " + message);
    }
}
