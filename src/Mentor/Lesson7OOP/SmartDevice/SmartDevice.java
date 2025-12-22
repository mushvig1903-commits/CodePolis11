package Mentor.Lesson7OOP.SmartDevice;

public class SmartDevice {
    private String brand;
    private String model;
    private boolean isOnline;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOnline = false;
    }
    public void connectToWifi(){
        isOnline = true;
        System.out.println(model + " wifi-ya qoşuldu \uD83D\uDCF6 ✅ . ");
    }
    public void disconnect(){
        isOnline = false;
        System.out.println(model + " wifi-dan ayrıldı \uD83D\uDEAB\uD83D\uDCF6 . ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOn=" + isOnline +
                '}';
    }
}
