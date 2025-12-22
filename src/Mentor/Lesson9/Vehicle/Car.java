package Mentor.Lesson9.Vehicle;

public class Car extends Vehicle implements Movable, Fuelable{
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }
    public Car(String brand){
        super(brand);
    }
    public void showBrand(){
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", year: " + getYear());
    }
    public void showInfo(){
        System.out.println("Brand: " + getBrand());
    }

    @Override
    public void fuel(){
        System.out.println(getBrand() + " " + getModel() +  " is refueling at the station.");
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " " + getModel() + " is moving on the road.");
    }
}
