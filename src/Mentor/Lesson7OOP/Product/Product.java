package Mentor.Lesson7OOP.Product;

abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract void displeyInfo();
    public void applyDiscount(double percent){
        price = price - (price * percent/100);
    }

}
