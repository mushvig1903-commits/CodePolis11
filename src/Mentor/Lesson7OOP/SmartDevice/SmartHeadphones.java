package Mentor.Lesson7OOP.SmartDevice;

public class SmartHeadphones extends SmartDevice{
    public SmartHeadphones(String brand, String model) {
        super(brand, model);

    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("\uD83D\uDD0A Qulaqlıq \uD83C\uDFA7 musiqi \uD83C\uDFB5 yayımlamağa hazırdır.");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("  qulaqlıq qoşulu deyil.");
    }
    public void playMusic(String song){
        System.out.println("Apple Music-də \uD83C\uDFA7 musiqidən \uD83C\uDFB6 zövq alın: " + song);

    }
}
