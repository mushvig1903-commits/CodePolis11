package Mentor.Lesson9.Vehicle;

public class MAin {
    static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 1967);
        Car car1 = new Car("Toyota", "Camry", 2025);
        Car car2 = new Car("BMW");
        car.showBrand();
        car.move();
        car1.showBrand();
        car1.fuel();
        car2.showInfo();

    }
}
