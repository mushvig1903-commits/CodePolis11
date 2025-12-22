package Mentor.Lesson8;

public class ElectronicProduct extends Product implements DiscountApplicable{
    private String warrantyPeriod;

    public ElectronicProduct(String name, double price, int stock, String warrantyPeriod) {
        super(name, price, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(String name, double price, int stock) {
        super(name, price, stock);


    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void showInfo() {
        System.out.println("Electronic Product: " +  getName() + "Price: " + getPrice() + " AZN, " + " Stock " + getStock());

    }

    @Override
    public double calculateDiscountedPrice(double discountRate) {
        return getPrice() * (1.0 - discountRate);

    }
    //"Apparel Product: [name], Price: [price] AZN, Stock: [stock] units, Size: [size]."
}
