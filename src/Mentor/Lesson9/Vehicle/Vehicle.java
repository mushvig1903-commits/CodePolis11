package Mentor.Lesson9.Vehicle;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Vehicle (String brand){
        this.brand = brand;
    }



    public String getBrand() {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
