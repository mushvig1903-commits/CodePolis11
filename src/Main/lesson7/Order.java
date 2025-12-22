package Main.lesson7;

import Mentor.Lesson8.DiscountApplicable;
import Mentor.Lesson8.Product;

public class Order  {


    public void createOrder(Product product, int quanity){
        if (product.getStock() < quanity){
            System.out.println("Error: Not enough stock for" + product.getName() + ".");
        }
        else {
            System.out.println("Order confirmed: " + quanity + " units of " + product.getName() + ".");
        }
    }
    public double calculateTotalPrice(DiscountApplicable product, int quantity, double discountRate) {
        double discountedPrice = product.calculateDiscountedPrice(discountRate);
        return discountedPrice * quantity;
    }
}
