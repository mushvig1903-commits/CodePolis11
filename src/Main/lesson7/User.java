package Main.lesson7;

public class User  {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendNotification(NotificationService service, String message){
        System.out.println("User: " + name);
        service.sendMessage(message);
    }

}

