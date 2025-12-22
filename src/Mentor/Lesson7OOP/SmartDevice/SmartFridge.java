package Mentor.Lesson7OOP.SmartDevice;

public class SmartFridge extends SmartDevice{
    private int coolingLevel;
    public SmartFridge(String brand, String model) {
        super(brand, model);
        this.coolingLevel = 0;
    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("\uD83E\uDDCA Soyuducu məhsulların siyahısını sinxronlaşdırır.");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("\uD83E\uDDCA Soyuducu internetdən ayrıldı. Uzaqdan idarə dayandırıldı.");
    }
    public void showTemperaturs(int temp){
        this.coolingLevel = temp;
        System.out.println("🌡️ Cari soyutma səviyyəsi: " + coolingLevel + "°C");
    }

    @Override
    public String toString() {
        return "SmartFridge{" +
                "coolingLevel=" + coolingLevel +
                '}';
    }
}
