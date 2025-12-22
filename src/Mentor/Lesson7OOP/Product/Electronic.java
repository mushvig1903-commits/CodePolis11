package Mentor.Lesson7OOP.Product;

public class Electronic extends Product{
    private String brand;
    public Electronic(String name, double price) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    void displeyInfo() {
        System.out.println("🔌 Electronic: " + name + ", Brand: " + brand + ", Price: " + price + " AZN");
    }
}
