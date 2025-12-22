package Mentor.Lesson8;

public class ApparelProduct extends Product{
    private String size;

    public ApparelProduct(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public ApparelProduct(String name, double price, int stock) {
        super(name, price, stock);

    }


    @Override
    public void showInfo() {
        System.out.println("Apparel Product: " + getName() + " Price " + getPrice() + " AZN " + "Stock: " + getStock() + "Size: " + size);

        //"Apparel Product: [name], Price: [price] AZN, Stock: [stock] units, Size: [size]."
    }
}
