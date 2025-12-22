package Mentor.Lesson7OOP.SmartDevice;

public class SmartWatch  extends SmartDevice{
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("⌚Saatın \uD83D\uDCF1 ekranında \uD83D\uDCDE zəng  göründü");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("⌚Smart saatınız \uD83D\uDCF1 telefona qoşulu deyil...");
    }

    public void trackHeartRate() {
        System.out.println("Gündəlik  ❤\uFE0F ürək ritminiz...");

    }
}
